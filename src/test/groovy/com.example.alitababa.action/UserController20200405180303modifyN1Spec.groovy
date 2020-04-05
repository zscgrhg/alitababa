package com.example.alitababa.action

import spock.lang.Specification;
import com.fasterxml.jackson.core.type.TypeReference;
import org.codehaus.groovy.runtime.InvokerHelper


/**
 *
 */
class UserController20200405180303modifyN1Spec extends Specification {
	void verifymodify() {
		given:
			def subject = new com.example.alitababa.action.UserController()
			subject.userService = Mock(com.example.alitababa.service.UserService) {
				1 * modify(INPUTS2[0], INPUTS2[1]) >> { arg0, arg1 ->
					OUTPUTS2[0].copyDirtyPropsTo(arg0)
					OUTPUTS2[1].copyDirtyPropsTo(arg1)
					return RETURNED2
				}
			}
		when:
			def ret = subject.modify(*INPUTS1)
		then:
			ret == RETURNED1
	}
	
	
	static final def INPUTS1 = [
			[
					[
							id   : 1,
							name : null,
							age  : null,
							email: null
					]
			].reconstruction(new TypeReference<java.util.List<com.example.alitababa.entity.User>>() {}),
			'haha'
	]
	static final def INPUTS2 = [
			[
					[
							id   : 1,
							name : null,
							age  : null,
							email: null
					]
			].reconstruction(new TypeReference<java.util.List<com.example.alitababa.entity.User>>() {}),
			'haha'
	]
	
	static final def OUTPUTS1 = [
			[
					[
							id   : 1,
							name : 'haha',
							age  : null,
							email: null
					]
			].reconstruction(new TypeReference<java.util.List<com.example.alitababa.entity.User>>() {}),
			'haha'
	]
	static final def OUTPUTS2 = [
			[
					[
							id   : 1,
							name : 'haha',
							age  : null,
							email: null
					]
			].reconstruction(new TypeReference<java.util.List<com.example.alitababa.entity.User>>() {}),
			'haha'
	]
	
	static final def RETURNED1 = null
	
	static final def RETURNED2 = null
	
}


