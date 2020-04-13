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
class UserServiceImpl20200413215938N1SpecTest extends Specification {

    @Rule
    BMRuleLoader ruleLoader = new BMRuleLoader();

    @BMRules(rules = [
            @BMRule(
                    name = "invoke_static:com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200413215938N1SpecTest",
                    targetClass = "com.example.alitababa.service.ServiceLocatorLocator",
                    targetMethod = "compute(int,int)",
                    binding = 'mockHandler:com.example.alitababa.service.UserServiceImpl20200413215938N1SpecTest$StaticStub97=getMock("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200413215938N1SpecTest")',
                    targetLocation = "AT ENTRY",
                    helper = 'com.zte.sputnik.extension.InvokeStaicHelper',
                    condition = 'hasMethod("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200413215938N1SpecTest")',
                    action = 'return mockHandler.compute($1,$2)'
            ),
    ])


    void 'verify method:query(java.lang.Long,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)'() {
        given:
            def subject = new com.example.alitababa.service.UserServiceImpl()
            InvokeStaicHelper.cleanup()
            def invokeStaticDefs = [:]
            InvokeStaicHelper.setupMock(invokeStaticDefs)


            def argMockDefs = [:]
            argMockDefs.request = Mock(javax.servlet.http.HttpServletRequest) {
                1 * getSession() >> {
                    _b ->
                        return Mock(javax.servlet.http.HttpSession) {
                            1 * getAttribute({ _c0 -> _c0 == INPUTS119[0] }) >> {
                                java.lang.String _d0 ->
                                    OUTPUTS119[0].copyDirtyPropsTo(_d0)
                                    return RETURNED119
                            }
                            1 * setAttribute({ _e0 -> _e0 == INPUTS121[0] }, { _e1 -> _e1 == INPUTS121[1] }) >> {
                                java.lang.String _f0, java.lang.Object _f1 ->
                                    OUTPUTS121[0].copyDirtyPropsTo(_f0)
                                    OUTPUTS121[1].copyDirtyPropsTo(_f1)
                                    return RETURNED121
                            }
                        }
                }
            }
            argMockDefs.response = Mock(javax.servlet.http.HttpServletResponse) {
                1 * setStatus({ _a0 -> _a0 == INPUTS122[0] }) >> {
                    int _b0 ->
                        OUTPUTS122[0].copyDirtyPropsTo(_b0)
                        return RETURNED122
                }
            }
            subject.userMapper = Mock(com.example.alitababa.mapper.UserMapper) {
                1 * selectById({ _a0 -> _a0 == INPUTS116[0] }) >> {
                    java.io.Serializable _b0 ->
                        OUTPUTS116[0].copyDirtyPropsTo(_b0)
                        return RETURNED116
                }
            }
            invokeStaticDefs['com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200413215938N1SpecTest'] = Mock(StaticStub97) {
                1 * compute({ _a0 -> _a0 == INPUTS120[0] }, { _a1 -> _a1 == INPUTS120[1] }) >> {
                    int _b0, int _b1 ->
                        OUTPUTS120[0].copyDirtyPropsTo(_b0)
                        OUTPUTS120[1].copyDirtyPropsTo(_b1)
                        return RETURNED120
                }
            }
        when:
            def ret = subject.query(INPUTS115[0], argMockDefs.request, argMockDefs.response)
        then:
            ret == RETURNED115
        cleanup:
            InvokeStaicHelper.cleanup()
    }

    private static interface StaticStub97 {
        boolean compute(int arg0, int arg1)
    }
    static final def INPUTS121 = [
            '''Jone''',
            [
                    id   : 1,
                    name : '''Jone''',
                    age  : 18,
                    email: '''test1@baomidou.com'''
            ] as com.example.alitababa.entity.User
    ]
    static final def INPUTS122 = [
            200 as int
    ]
    static final def INPUTS115 = [
            1 as java.lang.Long,
            [
                    type        : '''ARG''',
                    name        : '''request''',
                    index       : 1,
                    returnedFrom: null,
                    declaredType: '''javax.servlet.http.HttpServletRequest'''
            ] as com.zte.sputnik.parse.RefsInfo,
            [
                    type        : '''ARG''',
                    name        : '''response''',
                    index       : 2,
                    returnedFrom: null,
                    declaredType: '''javax.servlet.http.HttpServletResponse'''
            ] as com.zte.sputnik.parse.RefsInfo
    ]
    static final def INPUTS116 = [
            1 as java.io.Serializable
    ]
    static final def INPUTS117 = [
    ]
    static final def INPUTS119 = [
            '''Jone'''
    ]
    static final def INPUTS120 = [
            1 as int,
            1 as int
    ]

    static final def OUTPUTS121 = [
            '''Jone''',
            [
                    id   : 1,
                    name : '''Jone''',
                    age  : 18,
                    email: '''test1@baomidou.com'''
            ] as com.example.alitababa.entity.User
    ]
    static final def OUTPUTS122 = [
            200 as int
    ]
    static final def OUTPUTS115 = [
            1 as java.lang.Long,
            [
                    type        : '''ARG''',
                    name        : '''request''',
                    index       : 1,
                    returnedFrom: null,
                    declaredType: '''javax.servlet.http.HttpServletRequest'''
            ] as com.zte.sputnik.parse.RefsInfo,
            [
                    type        : '''ARG''',
                    name        : '''response''',
                    index       : 2,
                    returnedFrom: null,
                    declaredType: '''javax.servlet.http.HttpServletResponse'''
            ] as com.zte.sputnik.parse.RefsInfo
    ]
    static final def OUTPUTS116 = [
            1 as java.io.Serializable
    ]
    static final def OUTPUTS117 = [
    ]
    static final def OUTPUTS119 = [
            '''Jone'''
    ]
    static final def OUTPUTS120 = [
            1 as int,
            1 as int
    ]

    static final def RETURNED121 = null

    static final def RETURNED122 = null

    static final def RETURNED115 = [
            data   : [
                    id   : 1,
                    name : '''Jone''',
                    age  : 18,
                    email: '''test1@baomidou.com'''
            ],
            weather: '''unkown'''
    ].reconstruction(new TypeReference<com.example.alitababa.entity.ServiceData>() {})

    static final def RETURNED116 = [
            id   : 1,
            name : '''Jone''',
            age  : 18,
            email: '''test1@baomidou.com'''
    ].reconstruction(new TypeReference<com.example.alitababa.entity.User>() {})

    static final def RETURNED117 = [
            type        : '''RETURNED''',
            name        : '''returnedBy117''',
            index       : 0,
            returnedFrom: 117,
            declaredType: '''javax.servlet.http.HttpSession'''
    ].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>() {})

    static final def RETURNED119 = null as java.lang.Object

    static final def RETURNED120 = false as boolean

}


