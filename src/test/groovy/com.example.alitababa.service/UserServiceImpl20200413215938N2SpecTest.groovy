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
class UserServiceImpl20200413215938N2SpecTest extends Specification {

    @Rule
    BMRuleLoader ruleLoader = new BMRuleLoader();

    @BMRules(rules = [
            @BMRule(
                    name = "invoke_static:com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest",
                    targetClass = "com.example.alitababa.service.ServiceLocatorLocator",
                    targetMethod = "compute(int,int)",
                    binding = 'mockHandler:com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest$StaticStub251=getMock("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest")',
                    targetLocation = "AT ENTRY",
                    helper = 'com.zte.sputnik.extension.InvokeStaicHelper',
                    condition = 'hasMethod("com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest")',
                    action = 'return mockHandler.compute($1,$2)'
            ),
            @BMRule(
                    name = "invoke_static:com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest",
                    targetClass = "com.example.alitababa.service.ServiceLocatorLocator",
                    targetMethod = "findServiceLocator()",
                    binding = 'mockHandler:com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest$StaticStub252=getMock("com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest")',
                    targetLocation = "AT ENTRY",
                    helper = 'com.zte.sputnik.extension.InvokeStaicHelper',
                    condition = 'hasMethod("com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest")',
                    action = 'return mockHandler.findServiceLocator()'
            ),
    ])


    void 'verify method:query(java.lang.Long,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)'() {
        given:
            def subject = new com.example.alitababa.service.UserServiceImpl()
            InvokeStaicHelper.cleanup()
            def invokeStaticDefs = [:]
            InvokeStaicHelper.setupMock(invokeStaticDefs)


            def argMockDefs = [:]
            argMockDefs.arg1 = Mock(javax.servlet.http.HttpServletRequest) {
                1 * getSession() >> {
                    _b ->
                        return Mock(javax.servlet.http.HttpSession) {
                            1 * setAttribute({ _c0 -> _c0 == INPUTS423[0] }, { _c1 -> _c1 == INPUTS423[1] }) >> {
                                java.lang.String _d0, java.lang.Object _d1 ->
                                    OUTPUTS423[0].copyDirtyPropsTo(_d0)
                                    OUTPUTS423[1].copyDirtyPropsTo(_d1)
                                    return RETURNED423
                            }
                            1 * getAttribute({ _e0 -> _e0 == INPUTS412[0] }) >> {
                                java.lang.String _f0 ->
                                    OUTPUTS412[0].copyDirtyPropsTo(_f0)
                                    return RETURNED412
                            }
                        }
                }
            }
            invokeStaticDefs['com.example.alitababa.service.ServiceLocatorLocator::findServiceLocator()@com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest'] = Mock(StaticStub252) {
                1 * findServiceLocator() >> {
                    _b ->
                        return Mock(com.example.alitababa.service.ServiceLocator) {
                            1 * findWeatherService() >> {
                                _d ->
                                    return Mock(com.example.alitababa.service.WeatherService) {
                                        1 * getWeather() >> {
                                            _f ->
                                                return RETURNED422
                                        }
                                    }
                            }
                        }
                }
                1 * findServiceLocator() >> {
                    _e ->
                        return Mock(com.example.alitababa.service.ServiceLocator) {
                            1 * findWeatherService() >> {
                                _g ->
                                    return Mock(com.example.alitababa.service.WeatherService) {
                                        1 * getWeather() >> {
                                            _i ->
                                                return RETURNED421
                                        }
                                    }
                            }
                        }
                }
                1 * findServiceLocator() >> {
                    _h ->
                        return Mock(com.example.alitababa.service.ServiceLocator) {
                            1 * findWeatherService() >> {
                                _j ->
                                    return Mock(com.example.alitababa.service.WeatherService) {
                                        1 * getWeather() >> {
                                            _l ->
                                                return RETURNED420
                                        }
                                    }
                            }
                        }
                }
            }
            argMockDefs.arg2 = Mock(javax.servlet.http.HttpServletResponse) {
                1 * setStatus({ _a0 -> _a0 == INPUTS424[0] }) >> {
                    int _b0 ->
                        OUTPUTS424[0].copyDirtyPropsTo(_b0)
                        return RETURNED424
                }
            }
            subject.userMapper = Mock(com.example.alitababa.mapper.UserMapper) {
                1 * selectById({ _a0 -> _a0 == INPUTS409[0] }) >> {
                    java.io.Serializable _b0 ->
                        OUTPUTS409[0].copyDirtyPropsTo(_b0)
                        return RETURNED409
                }
            }
            invokeStaticDefs['com.example.alitababa.service.ServiceLocatorLocator::compute(int,int)@com.example.alitababa.service.UserServiceImpl20200413215938N2SpecTest'] = Mock(StaticStub251) {
                1 * compute({ _a0 -> _a0 == INPUTS413[0] }, { _a1 -> _a1 == INPUTS413[1] }) >> {
                    int _b0, int _b1 ->
                        OUTPUTS413[0].copyDirtyPropsTo(_b0)
                        OUTPUTS413[1].copyDirtyPropsTo(_b1)
                        return RETURNED413
                }
            }
        when:
            def ret = subject.query(INPUTS408[0], argMockDefs.arg1, argMockDefs.arg2)
        then:
            ret == RETURNED408
        cleanup:
            InvokeStaicHelper.cleanup()
    }

    private static interface StaticStub251 {
        boolean compute(int arg0, int arg1)
    }

    private static interface StaticStub252 {
        com.example.alitababa.service.ServiceLocator findServiceLocator()
    }
    static final def INPUTS420 = [
    ]
    static final def INPUTS410 = [
    ]
    static final def INPUTS421 = [
    ]
    static final def INPUTS422 = [
    ]
    static final def INPUTS412 = [
            '''Jack'''
    ]
    static final def INPUTS423 = [
            '''Jack''',
            [
                    id   : 2,
                    name : '''Jack''',
                    age  : 20,
                    email: '''test2@baomidou.com'''
            ] as com.example.alitababa.entity.User
    ]
    static final def INPUTS413 = [
            2 as int,
            1 as int
    ]
    static final def INPUTS424 = [
            200 as int
    ]
    static final def INPUTS414 = [
    ]
    static final def INPUTS415 = [
    ]
    static final def INPUTS416 = [
    ]
    static final def INPUTS417 = [
    ]
    static final def INPUTS418 = [
    ]
    static final def INPUTS408 = [
            2 as java.lang.Long,
            [
                    type        : '''ARG''',
                    name        : '''arg1''',
                    index       : 1,
                    returnedFrom: null,
                    declaredType: '''javax.servlet.http.HttpServletRequest'''
            ] as com.zte.sputnik.parse.RefsInfo,
            [
                    type        : '''ARG''',
                    name        : '''arg2''',
                    index       : 2,
                    returnedFrom: null,
                    declaredType: '''javax.servlet.http.HttpServletResponse'''
            ] as com.zte.sputnik.parse.RefsInfo
    ]
    static final def INPUTS419 = [
    ]
    static final def INPUTS409 = [
            2 as java.io.Serializable
    ]

    static final def OUTPUTS420 = [
    ]
    static final def OUTPUTS410 = [
    ]
    static final def OUTPUTS421 = [
    ]
    static final def OUTPUTS422 = [
    ]
    static final def OUTPUTS412 = [
            '''Jack'''
    ]
    static final def OUTPUTS423 = [
            '''Jack''',
            [
                    id   : 2,
                    name : '''Jack''',
                    age  : 20,
                    email: '''test2@baomidou.com'''
            ] as com.example.alitababa.entity.User
    ]
    static final def OUTPUTS413 = [
            2 as int,
            1 as int
    ]
    static final def OUTPUTS424 = [
            200 as int
    ]
    static final def OUTPUTS414 = [
    ]
    static final def OUTPUTS415 = [
    ]
    static final def OUTPUTS416 = [
    ]
    static final def OUTPUTS417 = [
    ]
    static final def OUTPUTS418 = [
    ]
    static final def OUTPUTS408 = [
            2 as java.lang.Long,
            [
                    type        : '''ARG''',
                    name        : '''arg1''',
                    index       : 1,
                    returnedFrom: null,
                    declaredType: '''javax.servlet.http.HttpServletRequest'''
            ] as com.zte.sputnik.parse.RefsInfo,
            [
                    type        : '''ARG''',
                    name        : '''arg2''',
                    index       : 2,
                    returnedFrom: null,
                    declaredType: '''javax.servlet.http.HttpServletResponse'''
            ] as com.zte.sputnik.parse.RefsInfo
    ]
    static final def OUTPUTS419 = [
    ]
    static final def OUTPUTS409 = [
            2 as java.io.Serializable
    ]

    static final def RETURNED420 = '''200 OK'''

    static final def RETURNED410 = [
            type        : '''RETURNED''',
            name        : '''returnedBy410''',
            index       : 0,
            returnedFrom: 410,
            declaredType: '''javax.servlet.http.HttpSession'''
    ].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>() {})

    static final def RETURNED421 = '''200 OK'''

    static final def RETURNED422 = '''200 OK'''

    static final def RETURNED412 = null as java.lang.Object

    static final def RETURNED423 = null

    static final def RETURNED413 = true as boolean

    static final def RETURNED424 = null

    static final def RETURNED414 = [
            type        : '''RETURNED''',
            name        : '''returnedBy414''',
            index       : 0,
            returnedFrom: 414,
            declaredType: '''com.example.alitababa.service.ServiceLocator'''
    ].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>() {})

    static final def RETURNED415 = [
            type        : '''RETURNED''',
            name        : '''returnedBy415''',
            index       : 0,
            returnedFrom: 415,
            declaredType: '''com.example.alitababa.service.ServiceLocator'''
    ].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>() {})

    static final def RETURNED416 = [
            type        : '''RETURNED''',
            name        : '''returnedBy416''',
            index       : 0,
            returnedFrom: 416,
            declaredType: '''com.example.alitababa.service.ServiceLocator'''
    ].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>() {})

    static final def RETURNED417 = [
            type        : '''RETURNED''',
            name        : '''returnedBy417''',
            index       : 0,
            returnedFrom: 417,
            declaredType: '''com.example.alitababa.service.WeatherService'''
    ].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>() {})

    static final def RETURNED418 = [
            type        : '''RETURNED''',
            name        : '''returnedBy418''',
            index       : 0,
            returnedFrom: 418,
            declaredType: '''com.example.alitababa.service.WeatherService'''
    ].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>() {})

    static final def RETURNED408 = [
            data   : [
                    id   : 2,
                    name : '''Jack''',
                    age  : 20,
                    email: '''test2@baomidou.com'''
            ],
            weather: '''200 OK200 OK200 OK'''
    ].reconstruction(new TypeReference<com.example.alitababa.entity.ServiceData>() {})

    static final def RETURNED419 = [
            type        : '''RETURNED''',
            name        : '''returnedBy419''',
            index       : 0,
            returnedFrom: 419,
            declaredType: '''com.example.alitababa.service.WeatherService'''
    ].reconstruction(new TypeReference<com.zte.sputnik.parse.RefsInfo>() {})

    static final def RETURNED409 = [
            id   : 2,
            name : '''Jack''',
            age  : 20,
            email: '''test2@baomidou.com'''
    ].reconstruction(new TypeReference<com.example.alitababa.entity.User>() {})

}


