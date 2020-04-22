import java.nio.file.Files
import java.nio.file.Paths
import java.util.concurrent.atomic.AtomicInteger

def buildSpec(String specDir){
    def antUtil=new groovy.util.AntBuilder()
    def tempDir= Paths.get(project.build.directory).resolve("sputnik-temp")
    def tempSrcDir= tempDir.resolve("src")
    def sputnikClasses=Paths.get(project.build.directory).resolve("sputnik-classes")
    antUtil.delete(dir:tempDir)
    antUtil.mkdir(dir:tempDir)
    antUtil.mkdir(dir:tempSrcDir)
    antUtil.mkdir(dir:sputnikClasses)
    def sourceDir=project.basedir.toPath().resolve(specDir).toFile()
    List<File> sourceList=new ArrayList<>()
    sourceDir.eachFileRecurse{
        if(it.name.endsWith(".groovy")){
            sourceList.add(it)
        }
    }
    log.info("groovy files:${sourceList.size()}")
    List<String> tempPkgs=new ArrayList<>()
    def k=0
    def stepSize=10
    long start=System.currentTimeSeconds()
    for (int i = 0; i < sourceList.size(); i+=stepSize) {
        k++
        String pkgName="pkg${i}"
        def pkg=tempSrcDir.resolve(pkgName)
        pkg.toFile().mkdirs()
        tempPkgs.add(pkgName)
        for (int j = 0; j < stepSize && (i + j < sourceList.size()); j++) {
            def groovyFile = sourceList.get(i + j)
            Files.copy(groovyFile.toPath(),pkg.resolve(groovyFile.getName()))
        }
    }
    def size=tempPkgs.size()
    log.info("copy ${sourceList.size()} groovy source files to ${size} packages in ${(System.currentTimeSeconds()-start)} seconds")

    def counter=new AtomicInteger(size)
    start=System.currentTimeSeconds()
    tempPkgs.stream().parallel().forEach({
        long innerStart=System.currentTimeSeconds()
        def antBuilder=new groovy.util.AntBuilder()
        antBuilder.path(id:'sputnik.test.classpath'){
            pathelement (path:project.getTestClasspathElements())
        }
        antBuilder.taskdef(name:'groovyc',classname:'org.codehaus.groovy.ant.Groovyc'){
            classpath (refid:'sputnik.test.classpath')
        }
        antBuilder.groovyc(destdir:project.build.testOutputDirectory,srcdir:tempSrcDir.resolve(it),indy:true){
            classpath (refid:'sputnik.test.classpath')
        }
        log.info("progress: ${size-counter.decrementAndGet()}/${size},${it} compiled successfully in ${(System.currentTimeSeconds()-innerStart)} seconds")
    })
    log.info("compile complete in ${(System.currentTimeSeconds()-start)} seconds")
}

try {
    buildSpec("src/test/groovy")
} catch (e) {
    log.error(e.getMessage(),e)
}