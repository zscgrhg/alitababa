import com.zte.sputnik.extension.BMRuleLoader

import java.nio.file.Paths

try {
    System.setProperty("org.jboss.byteman.home","${project.build.directory}/sputnik-lib")

    def antBuilder=new groovy.util.AntBuilder()
    antBuilder.mkdir(dir: Paths.get(project.build.directory).resolve("report"))
    antBuilder.path(id:'sputnik.test.classpath'){
        pathelement (path:project.getTestClasspathElements())
    }
    antBuilder.path(id:'sputnik.compile.classpath'){
        pathelement (path:project.getCompileClasspathElements())
    }
    antBuilder.junitlauncher(printSummary:true){
//        classpath (refid:'sputnik.compile.classpath')
//        classpath (refid:'sputnik.test.classpath')
        classpath {
            //${project.build.directory}/sputnik-lib
            pathelement (path:Paths.get(project.build.directory).resolve("sputnik-classes/pkg0"))
            pathelement (path:"${project.build.directory}/sputnik-lib")
            pathelement (path:project.getCompileClasspathElements())
            pathelement (path:project.getTestClasspathElements())

        }
        testclasses(outputdir:Paths.get(project.build.directory).resolve("report")){
            fileset(dir: Paths.get(project.build.directory).resolve("sputnik-classes/pkg0")){
                include(name:"**/*SpecTest.class")
            }
            listener( type:"legacy-brief", sendSysOut:"true")
            listener( type:"legacy-xml", sendSysErr:"true", sendSysOut:"true")
        }
    }
} catch (Throwable e) {
    e.printStackTrace()
}
