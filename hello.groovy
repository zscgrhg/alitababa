
@Grapes([
        @Grab(group='org.codehaus.groovy', module='groovy-ant', version='2.5.11')
])
def ant = new groovy.ant.AntBuilder()
println ant