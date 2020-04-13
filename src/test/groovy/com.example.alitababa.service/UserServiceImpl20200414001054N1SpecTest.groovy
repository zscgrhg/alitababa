package com.example.alitababa.service

import spock.lang.Specification;
import com.fasterxml.jackson.core.type.TypeReference;
import com.alibaba.ttl.threadpool.agent.TtlAgent;
import com.zte.sputnik.Sputnik;
import com.zte.sputnik.extension.BMRuleLoader
import org.jboss.byteman.contrib.bmunit.BMRule
import org.jboss.byteman.contrib.bmunit.BMRules
import org.jboss.byteman.contrib.bmunit.BMUnitConfig
import org.junit.Rule
import com.zte.sputnik.extension.InvokeStaicHelper


/**
*   http://spockframework.org/
*/
class UserServiceImpl20200414001054N1SpecTest extends Specification {

    @Rule
    BMRuleLoader ruleLoader = new BMRuleLoader();



    @BMRules(rules = [
            @BMRule(
                name = "invoke_static:com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest",
                targetClass = "com.example.alitababa.service.ServiceLocatorLocator",
                targetMethod = "compute(int,int)",
                binding = 'mockHandler:com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest$StaticStub98=getMock("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest")',
                targetLocation = "AT ENTRY",
                helper='com.zte.sputnik.extension.InvokeStaicHelper',
                condition = 'hasMethod("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest")',
                action = 'return mockHandler.compute($1,$2)'
            ),
            @BMRule(
                name = "invoke_static:com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest",
                targetClass = "com.example.alitababa.service.ServiceLocatorLocator",
                targetMethod = "findServiceLocator()",
                binding = 'mockHandler:com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest$StaticStub99=getMock("com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest")',
                targetLocation = "AT ENTRY",
                helper='com.zte.sputnik.extension.InvokeStaicHelper',
                condition = 'hasMethod("com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest")',
                action = 'return mockHandler.findServiceLocator()'
            ),
    ])


void 'verify method:query(java.lang.Long,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)'() {
given:
def subject = new com.example.alitababa.service.UserServiceImpl()
    def invokeStaticDefs=[:]


    def argMockDefs=[:]
    invokeStaticDefs['com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest']=Mock(StaticStub98){
    1 * compute({_a0-> _a0==INPUTS135[0]},{_a1-> _a1==INPUTS135[1]}) >> { 
	int _b0,int _b1->
    OUTPUTS135[0].copyDirtyPropsTo(_b0)
    OUTPUTS135[1].copyDirtyPropsTo(_b1)
    return RETURNED135 
    }
    }
    argMockDefs.response=Mock(javax.servlet.http.HttpServletResponse){
    1 * setStatus({_a0-> _a0==INPUTS140[0]}) >> { 
	int _b0->
    OUTPUTS140[0].copyDirtyPropsTo(_b0)
    return RETURNED140 
    }
    }
    invokeStaticDefs['com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200414001054N1SpecTest']=Mock(StaticStub99){
    1 * findServiceLocator() >> { 
	_b->
    return Mock(com.example.alitababa.service.ServiceLocator){
    1 * findWeatherService() >> { 
	_d->
    return Mock(com.example.alitababa.service.WeatherService){
    1 * getWeather() >> { 
	_f->
    return RETURNED136 
    }
    1 * getWeather() >> { 
	_h->
    return RETURNED137 
    }
    1 * getWeather() >> { 
	_j->
    return RETURNED138 
    }
    }
    }
    }
    }
    }
    subject.userMapper=Mock(com.example.alitababa.mapper.UserMapper){
    1 * selectById({_a0-> _a0==INPUTS129[0]}) >> { 
	java.io.Serializable _b0->
    OUTPUTS129[0].copyDirtyPropsTo(_b0)
    return RETURNED129 
    }
    }
    argMockDefs.request=Mock(javax.servlet.http.HttpServletRequest){
    1 * getSession() >> { 
	_b->
    return Mock(javax.servlet.http.HttpSession){
    1 * getAttribute({_c0-> _c0==INPUTS132[0]}) >> { 
	java.lang.String _d0->
    OUTPUTS132[0].copyDirtyPropsTo(_d0)
    return RETURNED132 
    }
    1 * setAttribute({_e0-> _e0==INPUTS139[0]},{_e1-> _e1==INPUTS139[1]}) >> { 
	java.lang.String _f0,java.lang.Object _f1->
    OUTPUTS139[0].copyDirtyPropsTo(_f0)
    OUTPUTS139[1].copyDirtyPropsTo(_f1)
    return RETURNED139 
    }
    }
    }
    }

    InvokeStaicHelper.setupMock(invokeStaticDefs)
when:
def ret=subject.query(INPUTS128[0],argMockDefs.request,argMockDefs.response)
then:
ret == RETURNED128
cleanup:
    InvokeStaicHelper.cleanup(invokeStaticDefs)
}

   private static interface StaticStub98{
            boolean compute(int arg0,int arg1)
    }
   private static interface StaticStub99{
            com.example.alitababa.service.ServiceLocator findServiceLocator()
    }
    static final def INPUTS132= [
        		'''Jack'''
    ]
    static final def INPUTS133= [
    ]
    static final def INPUTS134= [
    ]
    static final def INPUTS135= [
        		2 as int,
        		1 as int
    ]
    static final def INPUTS136= [
    ]
    static final def INPUTS137= [
    ]
    static final def INPUTS138= [
    ]
    static final def INPUTS128= [
        		2 as java.lang.Long,
        		[
        			type:'''ARG''',
        			name:'''request''',
        			index:1 ,
        			returnedFrom:null ,
        			declaredType:'''javax.servlet.http.HttpServletRequest'''
        		] as com.zte.sputnik.parse.RefsInfo,
        		[
        			type:'''ARG''',
        			name:'''response''',
        			index:2 ,
        			returnedFrom:null ,
        			declaredType:'''javax.servlet.http.HttpServletResponse'''
        		] as com.zte.sputnik.parse.RefsInfo
    ]
    static final def INPUTS139= [
        		'''Jack''',
        		[
        			id:2 ,
        			name:'''Jack''',
        			age:20 ,
        			email:'''test2@baomidou.com'''
        		] as com.example.alitababa.entity.User
    ]
    static final def INPUTS129= [
        		2 as java.io.Serializable
    ]
    static final def INPUTS140= [
        		200 as int
    ]
    static final def INPUTS130= [
    ]

    static final def OUTPUTS132= [
        		'''Jack'''
    ]
    static final def OUTPUTS133= [
    ]
    static final def OUTPUTS134= [
    ]
    static final def OUTPUTS135= [
        		2 as int,
        		1 as int
    ]
    static final def OUTPUTS136= [
    ]
    static final def OUTPUTS137= [
    ]
    static final def OUTPUTS138= [
    ]
    static final def OUTPUTS128= [
        		2 as java.lang.Long,
        		[
        			type:'''ARG''',
        			name:'''request''',
        			index:1 ,
        			returnedFrom:null ,
        			declaredType:'''javax.servlet.http.HttpServletRequest'''
        		] as com.zte.sputnik.parse.RefsInfo,
        		[
        			type:'''ARG''',
        			name:'''response''',
        			index:2 ,
        			returnedFrom:null ,
        			declaredType:'''javax.servlet.http.HttpServletResponse'''
        		] as com.zte.sputnik.parse.RefsInfo
    ]
    static final def OUTPUTS139= [
        		'''Jack''',
        		[
        			id:2 ,
        			name:'''Jack''',
        			age:20 ,
        			email:'''test2@baomidou.com'''
        		] as com.example.alitababa.entity.User
    ]
    static final def OUTPUTS129= [
        		2 as java.io.Serializable
    ]
    static final def OUTPUTS140= [
        		200 as int
    ]
    static final def OUTPUTS130= [
    ]

    static final def RETURNED132=         		null as java.lang.Object

    static final def RETURNED133=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy133''',
        			index:0 ,
        			returnedFrom:133 ,
        			declaredType:'''com.example.alitababa.service.ServiceLocator'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED134=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy134''',
        			index:0 ,
        			returnedFrom:134 ,
        			declaredType:'''com.example.alitababa.service.WeatherService'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED135=         		true as boolean

    static final def RETURNED136=         		'''200 OK'''

    static final def RETURNED137=         		'''200 OK'''

    static final def RETURNED138=         		'''200 OK'''

    static final def RETURNED128=         		[
        			data:[
        				id:2 ,
        				name:'''Jack''',
        				age:20 ,
        				email:'''test2@baomidou.com'''
        			],
        			weather:'''200 OK200 OK200 OK'''
        		].reconstruction(new TypeReference<com.example.alitababa.entity.ServiceData>(){})

    static final def RETURNED139=         		null

    static final def RETURNED129=         		[
        			id:2 ,
        			name:'''Jack''',
        			age:20 ,
        			email:'''test2@baomidou.com'''
        		].reconstruction(new TypeReference<com.example.alitababa.entity.User>(){})

    static final def RETURNED140=         		null

    static final def RETURNED130=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy130''',
        			index:0 ,
        			returnedFrom:130 ,
        			declaredType:'''javax.servlet.http.HttpSession'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

}


