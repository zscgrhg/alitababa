package com.example.alitababa.service

import spock.lang.Specification;
import com.fasterxml.jackson.core.type.TypeReference;


/**
 *   http://spockframework.org/
 */
class UserServiceImpl20200407214847testChainN1Spec extends Specification {
	void verifytestChain() {
		given:
			def subject = new com.example.alitababa.service.UserServiceImpl()
			subject.serviceLocator = Mock(com.example.alitababa.service.ServiceLocatorLocator) {
				1 * findServiceLocator() >> { _a ->
					return Mock(com.example.alitababa.service.ServiceLocator) {
						1 * findOrderService() >> { _b ->
							return Mock(com.example.alitababa.service.OrderService) {
								1 * findById(INPUTS4[0]) >> { java.lang.Long _c0 ->
									OUTPUTS4[0].copyDirtyPropsTo(_c0)
									return RETURNED4
								}
							}
						}
					}
				}
				1 * findServiceLocator() >> { _c ->
					return Mock(com.example.alitababa.service.ServiceLocator) {
						1 * findOrderService() >> { _d ->
							return Mock(com.example.alitababa.service.OrderService) {
								1 * findById(INPUTS7[0]) >> { java.lang.Long _e0 ->
									OUTPUTS7[0].copyDirtyPropsTo(_e0)
									return RETURNED7
								}
							}
						}
					}
				}
				1 * findServiceLocator() >> { _e ->
					return Mock(com.example.alitababa.service.ServiceLocator) {
						1 * findOrderService() >> { _f ->
							return Mock(com.example.alitababa.service.OrderService) {
								1 * findById(INPUTS10[0]) >> { java.lang.Long _g0 ->
									OUTPUTS10[0].copyDirtyPropsTo(_g0)
									return RETURNED10
								}
							}
						}
					}
				}
				1 * findServiceLocator() >> { _g ->
					return Mock(com.example.alitababa.service.ServiceLocator) {
						1 * findOrderService() >> { _h ->
							return Mock(com.example.alitababa.service.OrderService) {
								1 * findById(INPUTS13[0]) >> { java.lang.Long _i0 ->
									OUTPUTS13[0].copyDirtyPropsTo(_i0)
									return RETURNED13
								}
							}
						}
					}
				}
				1 * findServiceLocator() >> { _i ->
					return Mock(com.example.alitababa.service.ServiceLocator) {
						1 * findOrderService() >> { _j ->
							return Mock(com.example.alitababa.service.OrderService) {
								1 * findById(INPUTS16[0]) >> { java.lang.Long _k0 ->
									OUTPUTS16[0].copyDirtyPropsTo(_k0)
									return RETURNED16
								}
							}
						}
					}
				}
			}
		when:
			def ret = subject.testChain(INPUTS1[0])
		then:
			ret == RETURNED1
	}
	
	
	static final def INPUTS11 = [
	]
	static final def INPUTS12 = [
	]
	static final def INPUTS13 = [
			1 as java.lang.Long
	]
	static final def INPUTS14 = [
	]
	static final def INPUTS15 = [
	]
	static final def INPUTS16 = [
			1 as java.lang.Long
	]
	static final def INPUTS1 = [
			1 as java.lang.Long
	]
	static final def INPUTS2 = [
	]
	static final def INPUTS3 = [
	]
	static final def INPUTS4 = [
			1 as java.lang.Long
	]
	static final def INPUTS5 = [
	]
	static final def INPUTS6 = [
	]
	static final def INPUTS7 = [
			1 as java.lang.Long
	]
	static final def INPUTS8 = [
	]
	static final def INPUTS9 = [
	]
	static final def INPUTS10 = [
			1 as java.lang.Long
	]
	
	static final def OUTPUTS11 = [
	]
	static final def OUTPUTS12 = [
	]
	static final def OUTPUTS13 = [
			1 as java.lang.Long
	]
	static final def OUTPUTS14 = [
	]
	static final def OUTPUTS15 = [
	]
	static final def OUTPUTS16 = [
			1 as java.lang.Long
	]
	static final def OUTPUTS1 = [
			1 as java.lang.Long
	]
	static final def OUTPUTS2 = [
	]
	static final def OUTPUTS3 = [
	]
	static final def OUTPUTS4 = [
			1 as java.lang.Long
	]
	static final def OUTPUTS5 = [
	]
	static final def OUTPUTS6 = [
	]
	static final def OUTPUTS7 = [
			1 as java.lang.Long
	]
	static final def OUTPUTS8 = [
	]
	static final def OUTPUTS9 = [
	]
	static final def OUTPUTS10 = [
			1 as java.lang.Long
	]
	
	static final def RETURNED11 = [
	] as com.example.alitababa.service.ServiceLocator
	
	static final def RETURNED12 = [
	] as com.example.alitababa.service.OrderService
	
	static final def RETURNED13 = [
			id      : 1,
			amount  : 11,
			itemName: '''item1'''
	] as com.example.alitababa.entity.Order
	
	static final def RETURNED14 = [
	] as com.example.alitababa.service.ServiceLocator
	
	static final def RETURNED15 = [
	] as com.example.alitababa.service.OrderService
	
	static final def RETURNED16 = [
			id      : 1,
			amount  : 11,
			itemName: '''item1'''
	] as com.example.alitababa.entity.Order
	
	static final def RETURNED1 = [
			id      : 1,
			amount  : 11,
			itemName: '''item1'''
	] as com.example.alitababa.entity.Order
	
	static final def RETURNED2 = [
	] as com.example.alitababa.service.ServiceLocator
	
	static final def RETURNED3 = [
	] as com.example.alitababa.service.OrderService
	
	static final def RETURNED4 = [
			id      : 1,
			amount  : 11,
			itemName: '''item1'''
	] as com.example.alitababa.entity.Order
	
	static final def RETURNED5 = [
	] as com.example.alitababa.service.ServiceLocator
	
	static final def RETURNED6 = [
	] as com.example.alitababa.service.OrderService
	
	static final def RETURNED7 = [
			id      : 1,
			amount  : 11,
			itemName: '''item1'''
	] as com.example.alitababa.entity.Order
	
	static final def RETURNED8 = [
	] as com.example.alitababa.service.ServiceLocator
	
	static final def RETURNED9 = [
	] as com.example.alitababa.service.OrderService
	
	static final def RETURNED10 = [
			id      : 1,
			amount  : 11,
			itemName: '''item1'''
	] as com.example.alitababa.entity.Order
	
}


