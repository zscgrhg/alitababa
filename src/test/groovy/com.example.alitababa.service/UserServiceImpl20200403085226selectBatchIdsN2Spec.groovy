package com.example.alitababa.service

import spock.lang.Specification;
import com.fasterxml.jackson.core.type.TypeReference;


/**
 *
 */
class UserServiceImpl20200403085226selectBatchIdsN2Spec extends Specification {
	void verifyselectBatchIds() {
		given:
			def subject = new com.example.alitababa.service.UserServiceImpl()
			subject.userMapper = Mock(com.example.alitababa.mapper.UserMapper) {
				1 * selectById(INPUTS24[0]) >> RETURNED24
				1 * selectById(INPUTS22[0]) >> RETURNED22
				1 * selectById(INPUTS23[0]) >> RETURNED23
				1 * selectById(INPUTS25[0]) >> RETURNED25
				1 * selectById(INPUTS27[0]) >> RETURNED27
				1 * selectById(INPUTS26[0]) >> RETURNED26
				1 * selectById(INPUTS29[0]) >> RETURNED29
				1 * selectById(INPUTS28[0]) >> RETURNED28
				1 * selectById(INPUTS30[0]) >> RETURNED30
			}
		when:
			def ret = subject.selectBatchIds(*INPUTS21)
		then:
			ret == RETURNED21
	}
	
	
	static final def INPUTS22 = [
			5
	]
	static final def INPUTS23 = [
			8
	]
	static final def INPUTS24 = [
			6
	]
	static final def INPUTS25 = [
			2
	]
	static final def INPUTS26 = [
			3
	]
	static final def INPUTS27 = [
			1
	]
	static final def INPUTS28 = [
			9
	]
	static final def INPUTS29 = [
			4
	]
	static final def INPUTS30 = [
			7
	]
	static final def INPUTS21 = [
			[
					1
			].reconstruction(new TypeReference<java.util.Collection<java.lang.Long>>() {})
	]
	
	static final def OUTPUTS22 = [
			5
	]
	static final def OUTPUTS23 = [
			8
	]
	static final def OUTPUTS24 = [
			6
	]
	static final def OUTPUTS25 = [
			2
	]
	static final def OUTPUTS26 = [
			3
	]
	static final def OUTPUTS27 = [
			1
	]
	static final def OUTPUTS28 = [
			9
	]
	static final def OUTPUTS29 = [
			4
	]
	static final def OUTPUTS30 = [
			7
	]
	static final def OUTPUTS21 = [
			[
					1
			].reconstruction(new TypeReference<java.util.Collection<java.lang.Long>>() {})
	]
	
	static final def RETURNED22 = [
			id   : 5,
			name : 'Billie',
			age  : 24,
			email: 'test5@baomidou.com'
	] as com.example.alitababa.entity.User
	
	static final def RETURNED23 = null
	
	static final def RETURNED24 = null
	
	static final def RETURNED25 = [
			id   : 2,
			name : 'Jack',
			age  : 20,
			email: 'test2@baomidou.com'
	] as com.example.alitababa.entity.User
	
	static final def RETURNED26 = [
			id   : 3,
			name : 'Tom',
			age  : 28,
			email: 'test3@baomidou.com'
	] as com.example.alitababa.entity.User
	
	static final def RETURNED27 = [
			id   : 1,
			name : 'Jone',
			age  : 18,
			email: 'test1@baomidou.com'
	] as com.example.alitababa.entity.User
	
	static final def RETURNED28 = null
	
	static final def RETURNED29 = [
			id   : 4,
			name : 'Sandy',
			age  : 21,
			email: 'test4@baomidou.com'
	] as com.example.alitababa.entity.User
	
	static final def RETURNED30 = null
	
	static final def RETURNED21 = [
			[
					id   : 1,
					name : 'Jone',
					age  : 18,
					email: 'test1@baomidou.com'
			],
			[
					id   : 2,
					name : 'Jack',
					age  : 20,
					email: 'test2@baomidou.com'
			],
			[
					id   : 3,
					name : 'Tom',
					age  : 28,
					email: 'test3@baomidou.com'
			],
			[
					id   : 4,
					name : 'Sandy',
					age  : 21,
					email: 'test4@baomidou.com'
			],
			[
					id   : 5,
					name : 'Billie',
					age  : 24,
					email: 'test5@baomidou.com'
			]
	].reconstruction(new TypeReference<java.util.List<com.example.alitababa.entity.User>>() {})
	
}


