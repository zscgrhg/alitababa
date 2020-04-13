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
class UserServiceImpl20200414000916N2SpecTest extends Specification {

    @Rule
    BMRuleLoader ruleLoader = new BMRuleLoader();



    @BMRules(rules = [
            @BMRule(
                name = "invoke_static:com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414000916N2SpecTest",
                targetClass = "com.example.alitababa.service.ServiceLocatorLocator",
                targetMethod = "compute(int,int)",
                binding = 'mockHandler:com.example.alitababa.service.UserServiceImpl20200414000916N2SpecTest$StaticStub253=getMock("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414000916N2SpecTest")',
                targetLocation = "AT ENTRY",
                helper='com.zte.sputnik.extension.InvokeStaicHelper',
                condition = 'hasMethod("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414000916N2SpecTest")',
                action = 'return mockHandler.compute($1,$2)'
            ),
    ])


void 'verify method:queryParallel(java.lang.Long,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)'() {
given:
def subject = new com.example.alitababa.service.UserServiceImpl()
    def invokeStaticDefs=[:]


    def argMockDefs=[:]
    subject.userMapper=Mock(com.example.alitababa.mapper.UserMapper){
    1 * selectById({_a0-> _a0==INPUTS457[0]}) >> { 
	java.io.Serializable _b0->
    OUTPUTS457[0].copyDirtyPropsTo(_b0)
    return RETURNED457 
    }
    }
    argMockDefs.arg2=Mock(javax.servlet.http.HttpServletResponse){
    1 * setStatus({_a0-> _a0==INPUTS463[0]}) >> { 
	int _b0->
    OUTPUTS463[0].copyDirtyPropsTo(_b0)
    return RETURNED463 
    }
    }
    invokeStaticDefs['com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200414000916N2SpecTest']=Mock(StaticStub253){
    1 * compute({_a0-> _a0==INPUTS461[0]},{_a1-> _a1==INPUTS461[1]}) >> { 
	int _b0,int _b1->
    OUTPUTS461[0].copyDirtyPropsTo(_b0)
    OUTPUTS461[1].copyDirtyPropsTo(_b1)
    return RETURNED461 
    }
    }
    argMockDefs.arg1=Mock(javax.servlet.http.HttpServletRequest){
    1 * getSession() >> { 
	_b->
    return Mock(javax.servlet.http.HttpSession){
    1 * getAttribute({_c0-> _c0==INPUTS460[0]}) >> { 
	java.lang.String _d0->
    OUTPUTS460[0].copyDirtyPropsTo(_d0)
    return RETURNED460 
    }
    1 * setAttribute({_e0-> _e0==INPUTS462[0]},{_e1-> _e1==INPUTS462[1]}) >> { 
	java.lang.String _f0,java.lang.Object _f1->
    OUTPUTS462[0].copyDirtyPropsTo(_f0)
    OUTPUTS462[1].copyDirtyPropsTo(_f1)
    return RETURNED462 
    }
    }
    }
    }

    InvokeStaicHelper.setupMock(invokeStaticDefs)
when:
def ret=subject.queryParallel(INPUTS456[0],argMockDefs.arg1,argMockDefs.arg2)
then:
ret == RETURNED456
cleanup:
    InvokeStaicHelper.cleanup(invokeStaticDefs)
}

   private static interface StaticStub253{
            boolean compute(int arg0,int arg1)
    }
    static final def INPUTS462= [
        		'''Jone''',
        		[
        			id:1 ,
        			name:'''Jone''',
        			age:18 ,
        			email:'''test1@baomidou.com'''
        		] as com.example.alitababa.entity.User
    ]
    static final def INPUTS463= [
        		200 as int
    ]
    static final def INPUTS456= [
        		1 as java.lang.Long,
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
    static final def INPUTS457= [
        		1 as java.io.Serializable
    ]
    static final def INPUTS458= [
    ]
    static final def INPUTS460= [
        		'''Jone'''
    ]
    static final def INPUTS461= [
        		1 as int,
        		1 as int
    ]

    static final def OUTPUTS462= [
        		'''Jone''',
        		[
        			id:1 ,
        			name:'''Jone''',
        			age:18 ,
        			email:'''test1@baomidou.com'''
        		] as com.example.alitababa.entity.User
    ]
    static final def OUTPUTS463= [
        		200 as int
    ]
    static final def OUTPUTS456= [
        		1 as java.lang.Long,
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
    static final def OUTPUTS457= [
        		1 as java.io.Serializable
    ]
    static final def OUTPUTS458= [
    ]
    static final def OUTPUTS460= [
        		'''Jone'''
    ]
    static final def OUTPUTS461= [
        		1 as int,
        		1 as int
    ]

    static final def RETURNED462=         		null

    static final def RETURNED463=         		null

    static final def RETURNED456=         		[
        			data:[
        				id:1 ,
        				name:'''Jone''',
        				age:18 ,
        				email:'''test1@baomidou.com'''
        			],
        			weather:'''unkown'''
        		].reconstruction(new TypeReference<com.example.alitababa.entity.ServiceData>(){})

    static final def RETURNED457=         		[
        			id:1 ,
        			name:'''Jone''',
        			age:18 ,
        			email:'''test1@baomidou.com'''
        		].reconstruction(new TypeReference<com.example.alitababa.entity.User>(){})

    static final def RETURNED458=         		[
        			type:'''RETURNED''',
        			name:'''returnedBy458''',
        			index:0 ,
        			returnedFrom:458 ,
        			declaredType:'''javax.servlet.http.HttpSession'''
        		].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>(){})

    static final def RETURNED460=         		null as java.lang.Object

    static final def RETURNED461=         		false as boolean

}


