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
class UserServiceImpl20200414001054N3SpecTest extends Specification {

    @Rule
    BMRuleLoader ruleLoader = new BMRuleLoader();



    @BMRules(rules = [
            @BMRule(
                name = "invoke_static:com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest",
                targetClass = "com.example.alitababa.service.ServiceLocatorLocator",
                targetMethod = "compute(int,int)",
                binding = 'mockHandler:com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest$StaticStub408=getMock("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest")',
                targetLocation = "AT ENTRY",
                helper='com.zte.sputnik.extension.InvokeStaicHelper',
                condition = 'hasMethod("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest")',
                action = 'return mockHandler.compute($1,$2)'
            ),
            @BMRule(
                name = "invoke_static:com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest",
                targetClass = "com.example.alitababa.service.ServiceLocatorLocator",
                targetMethod = "findServiceLocator()",
                binding = 'mockHandler:com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest$StaticStub409=getMock("com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest")',
                targetLocation = "AT ENTRY",
                helper='com.zte.sputnik.extension.InvokeStaicHelper',
                condition = 'hasMethod("com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest")',
                action = 'return mockHandler.findServiceLocator()'
            ),
    ])


void 'verify method:queryParallel(java.lang.Long,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)'() {
given:
def subject = new com.example.alitababa.service.UserServiceImpl()
    def invokeStaticDefs=[:]


    def argMockDefs=[:]
    argMockDefs.arg2=Mock(javax.servlet.http.HttpServletResponse){
    1 * setStatus({_a0-> _a0==INPUTS778[0]}) >> { 
	int _b0->
    OUTPUTS778[0].copyDirtyPropsTo(_b0)
    return RETURNED778 
    }
    }
    argMockDefs.arg1=Mock(javax.servlet.http.HttpServletRequest){
    1 * getSession() >> { 
	_b->
    return Mock(javax.servlet.http.HttpSession){
    1 * setAttribute({_c0-> _c0==INPUTS777[0]},{_c1-> _c1==INPUTS777[1]}) >> { 
	java.lang.String _d0,java.lang.Object _d1->
    OUTPUTS777[0].copyDirtyPropsTo(_d0)
    OUTPUTS777[1].copyDirtyPropsTo(_d1)
    return RETURNED777 
    }
    1 * getAttribute({_e0-> _e0==INPUTS766[0]}) >> { 
	java.lang.String _f0->
    OUTPUTS766[0].copyDirtyPropsTo(_f0)
    return RETURNED766 
    }
    }
    }
    }
    invokeStaticDefs['com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest']=Mock(StaticStub408){
    1 * compute({_a0-> _a0==INPUTS767[0]},{_a1-> _a1==INPUTS767[1]}) >> { 
	int _b0,int _b1->
    OUTPUTS767[0].copyDirtyPropsTo(_b0)
    OUTPUTS767[1].copyDirtyPropsTo(_b1)
    return RETURNED767 
    }
    }
    invokeStaticDefs['com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200414001054N3SpecTest']=Mock(StaticStub409){
    1 * findServiceLocator() >> { 
	_b->
    return Mock(com.example.alitababa.service.ServiceLocator){
    1 * findWeatherService() >> { 
	_d->
    return Mock(com.example.alitababa.service.WeatherService){
    1 * getWeather() >> { 
	_f->
    return RETURNED776 
    }
    }
    }
    }
    }
    1 * findServiceLocator() >> { 
	_e->
    return Mock(com.example.alitababa.service.ServiceLocator){
    1 * findWeatherService() >> { 
	_g->
    return Mock(com.example.alitababa.service.WeatherService){
    1 * getWeather() >> { 
	_i->
    return RETURNED774 
    }
    }
    }
    }
    }
    1 * findServiceLocator() >> { 
	_h->
    return Mock(com.example.alitababa.service.ServiceLocator){
    1 * findWeatherService() >> { 
	_j->
    return Mock(com.example.alitababa.service.WeatherService){
    1 * getWeather() >> { 
	_l->
    return RETURNED775 
    }
    }
    }
    }
    }
    }
    subject.userMapper=Mock(com.example.alitababa.mapper.UserMapper){
    1 * selectById({_a0-> _a0==INPUTS763[0]}) >> { 
	java.io.Serializable _b0->
    OUTPUTS763[0].copyDirtyPropsTo(_b0)
    return RETURNED763 
    }
    }

    InvokeStaicHelper.setupMock(invokeStaticDefs)
when:
def ret=subject.queryParallel(INPUTS762[0],argMockDefs.arg1,argMockDefs.arg2)
then:
ret == RETURNED762
cleanup:
    InvokeStaicHelper.cleanup(invokeStaticDefs)
}

   private static interface StaticStub408{
            boolean compute(int arg0,int arg1)
    }
   private static interface StaticStub409{
            com.example.alitababa.service.ServiceLocator findServiceLocator()
    }
    static final def INPUTS770= [
    ]
    static final def INPUTS771= [
    ]
    static final def INPUTS772= [
    ]
    static final def INPUTS762= [
        		2 as java.lang.Long,
        		[
        			type:'''ARG''',
        			name:'''arg1''',
        			index:1 ,
        			returnedFrom:null ,
        			declaredType:'''javax.servlet.http.HttpServletRequest'''
        		] as com.zte.sputnik.parse.RefsInfo,
        		[
        			type:'''ARG''',
        			name:'''arg2''',
        			index:2 ,
        			returnedFrom:null ,
        			declaredType:'''javax.servlet.http.HttpServletResponse'''
        		] as com.zte.sputnik.parse.RefsInfo
    ]
    static final def INPUTS773= [
    ]
    static final def INPUTS763= [
        		2 as java.io.Serializable
    ]
    static final def INPUTS774= [
    ]
    static final def INPUTS764= [
    ]
    static final def INPUTS775= [
    ]
    static final def INPUTS776= [
    ]
    static final def INPUTS766= [
        		'''Jack'''
    ]
    static final def INPUTS777= [
        		'''Jack''',
        		[
        			id:2 ,
        			name:'''Jack''',
        			age:20 ,
        			email:'''test2@baomidou.com'''
        		] as com.example.alitababa.entity.User
    ]
    static final def INPUTS767= [
        		2 as int,
        		1 as int
    ]
    static final def INPUTS778= [
        		200 as int
    ]
    static final def INPUTS768= [
    ]
    static final def INPUTS769= [
    ]

    static final def OUTPUTS770= [
    ]
    static final def OUTPUTS771= [
    ]
    static final def OUTPUTS772= [
    ]
    static final def OUTPUTS762= [
        		2 as java.lang.Long,
        		[
        			type:'''ARG''',
        			name:'''arg1''',
        			index:1 ,
        			returnedFrom:null ,
        			declaredType:'''javax.servlet.http.HttpServletRequest'''
        		] as com.zte.sputnik.parse.RefsInfo,
        		[
        			type:'''ARG''',
        			name:'''arg2''',
        			index:2 ,
        			returnedFrom:null ,
        			declaredType:'''javax.servlet.http.HttpServletResponse'''
        		] as com.zte.sputnik.parse.RefsInfo
    ]
    static final def OUTPUTS773= [
    ]
    static final def OUTPUTS763= [
        		2 as java.io.Serializable
    ]
    static final def OUTPUTS774= [
    ]
    static final def OUTPUTS764= [
    ]
    static final def OUTPUTS775= [
    ]
    static final def OUTPUTS776= [
    ]
    static final def OUTPUTS766= [
        		'''Jack'''
    ]
    static final def OUTPUTS777= [
        		'''Jack''',
        		[
        			id:2 ,
        			name:'''Jack''',
        			age:20 ,
        			email:'''test2@baomidou.com'''
        		] as com.example.alitababa.entity.User
    ]
    static final def OUTPUTS767= [
        		2 as int,
        		1 as int
    ]
    static final def OUTPUTS778= [
        		200 as int
    ]
    static final def OUTPUTS768= [
    ]
    static final def OUTPUTS769= [
    ]

    static final def RETURNED770=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy770''',
        			index:0 ,
        			returnedFrom:770 ,
        			declaredType:'''com.example.alitababa.service.ServiceLocator'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED771=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy771''',
        			index:0 ,
        			returnedFrom:771 ,
        			declaredType:'''com.example.alitababa.service.WeatherService'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED772=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy772''',
        			index:0 ,
        			returnedFrom:772 ,
        			declaredType:'''com.example.alitababa.service.WeatherService'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED762=         		[
        			data:[
        				id:2 ,
        				name:'''Jack''',
        				age:20 ,
        				email:'''test2@baomidou.com'''
        			],
        			weather:'''200 OK200 OK200 OK'''
        		].reconstruction(new TypeReference<com.example.alitababa.entity.ServiceData>(){})

    static final def RETURNED773=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy773''',
        			index:0 ,
        			returnedFrom:773 ,
        			declaredType:'''com.example.alitababa.service.WeatherService'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED763=         		[
        			id:2 ,
        			name:'''Jack''',
        			age:20 ,
        			email:'''test2@baomidou.com'''
        		].reconstruction(new TypeReference<com.example.alitababa.entity.User>(){})

    static final def RETURNED774=         		'''200 OK'''

    static final def RETURNED764=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy764''',
        			index:0 ,
        			returnedFrom:764 ,
        			declaredType:'''javax.servlet.http.HttpSession'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED775=         		'''200 OK'''

    static final def RETURNED776=         		'''200 OK'''

    static final def RETURNED766=         		null as java.lang.Object

    static final def RETURNED777=         		null

    static final def RETURNED767=         		true as boolean

    static final def RETURNED778=         		null

    static final def RETURNED768=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy768''',
        			index:0 ,
        			returnedFrom:768 ,
        			declaredType:'''com.example.alitababa.service.ServiceLocator'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED769=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy769''',
        			index:0 ,
        			returnedFrom:769 ,
        			declaredType:'''com.example.alitababa.service.ServiceLocator'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

}


