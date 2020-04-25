import com.zte.sputnik.extension.BMRuleLoader

import java.nio.file.Paths
import java.util.stream.Stream


def runSpec(File pkg){
    def antBuilder=new groovy.util.AntBuilder()

    antBuilder.junitlauncher(printSummary:true){
//        classpath (refid:'sputnik.compile.classpath')
//        classpath (refid:'sputnik.test.classpath')
        classpath {
            //${project.build.directory}/sputnik-lib
            pathelement (path:pkg.toPath())
            pathelement (path:project.getTestClasspathElements())

        }
        testclasses(outputdir:Paths.get(project.build.directory).resolve("report")){
            fileset(dir: pkg.toPath()){
                include(name:"**/*SpecTest.class")
            }
            listener( type:"legacy-brief", sendSysOut:"false")
            listener( type:"legacy-xml", sendSysErr:"false", sendSysOut:"false")
        }
    }
}

try {
    def antUtil=new groovy.util.AntBuilder()
    antUtil.mkdir(dir: Paths.get(project.build.directory).resolve("report"))

    //System.setProperty("org.jboss.byteman.home","${project.build.directory}/sputnik-lib")
    def pkgs = Paths.get(project.build.directory).resolve("sputnik-classes").toFile().listFiles()

    Stream.of(pkgs)
    .forEach({pkg->
        runSpec(pkg)
    })


} catch (Throwable e) {
    e.printStackTrace()
}
