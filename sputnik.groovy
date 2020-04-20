import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

def root = new File("sputnik")
def files = root?.listFiles()

StringBuilder content = new StringBuilder()


def prepend = '''
<project  name="ssss">
    <taskdef name="groovyc"
             classname="org.codehaus.groovy.ant.Groovyc">
        <classpath refid="maven.test.classpath"/>
    </taskdef>
    <macrodef name="testing">
        <attribute name="sputnikMod"/>
        <groovyc destdir="${project.build.testOutputDirectory}"
                 srcdir="${basedir}/@{sputnikMod}"
                 indy="true"
                 listfiles="true">
            <classpath refid="maven.test.classpath"/>
        </groovyc>
    </macrodef>
    <target name="aaa">
        <mkdir dir="${basedir}/src/test/groovy"/>
        <mkdir dir="${project.build.testOutputDirectory}"/>
        <parallel>
'''
String each=files.collect {
"           <testing sputnikMod=\"${it}\"/>"
}.join("\n")
String append='''
        </parallel>
    </target>
</project>
'''
content.append(prepend)
content.append(each)
content.append(append)

Files.copy(new ByteArrayInputStream(content.toString().getBytes("UTF-8")),
        Paths.get("sputnikc.xml"), StandardCopyOption.REPLACE_EXISTING)


