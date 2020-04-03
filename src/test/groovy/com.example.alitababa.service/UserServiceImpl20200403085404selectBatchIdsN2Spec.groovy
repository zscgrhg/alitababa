package com.example.alitababa.service

import spock.lang.Specification;
import com.fasterxml.jackson.core.type.TypeReference;


/**
*
*/
class UserServiceImpl20200403085404selectBatchIdsN2Spec extends Specification {
void verifyselectBatchIds() {
given:
def subject = new com.example.alitababa.service.UserServiceImpl()
    subject.userMapper=Mock(com.example.alitababa.mapper.UserMapper){
    1 * selectById(INPUTS32[0]) >> RETURNED32 
    1 * selectById(INPUTS33[0]) >> RETURNED33 
    1 * selectById(INPUTS34[0]) >> RETURNED34 
    1 * selectById(INPUTS36[0]) >> RETURNED36 
    1 * selectById(INPUTS35[0]) >> RETURNED35 
    1 * selectById(INPUTS37[0]) >> RETURNED37 
    1 * selectById(INPUTS38[0]) >> RETURNED38 
    1 * selectById(INPUTS39[0]) >> RETURNED39 
    1 * selectById(INPUTS40[0]) >> RETURNED40 
    }
when:
def ret=subject.selectBatchIds(*INPUTS31)
then:
ret == RETURNED31
}


    static final def INPUTS33= [
        		6
    ]
    static final def INPUTS34= [
        		1
    ]
    static final def INPUTS35= [
        		2
    ]
    static final def INPUTS36= [
        		8
    ]
    static final def INPUTS37= [
        		4
    ]
    static final def INPUTS38= [
        		7
    ]
    static final def INPUTS39= [
        		5
    ]
    static final def INPUTS40= [
        		9
    ]
    static final def INPUTS31= [
        		[
        			1
        		].reconstruction(new TypeReference<java.util.Collection<java.lang.Long>>(){})
    ]
    static final def INPUTS32= [
        		3
    ]

    static final def OUTPUTS33= [
        		6
    ]
    static final def OUTPUTS34= [
        		1
    ]
    static final def OUTPUTS35= [
        		2
    ]
    static final def OUTPUTS36= [
        		8
    ]
    static final def OUTPUTS37= [
        		4
    ]
    static final def OUTPUTS38= [
        		7
    ]
    static final def OUTPUTS39= [
        		5
    ]
    static final def OUTPUTS40= [
        		9
    ]
    static final def OUTPUTS31= [
        		[
        			1
        		].reconstruction(new TypeReference<java.util.Collection<java.lang.Long>>(){})
    ]
    static final def OUTPUTS32= [
        		3
    ]

    static final def RETURNED33=         		null

    static final def RETURNED34=         		[
        			id:1,
        			name:'Jone',
        			age:18,
        			email:'test1@baomidou.com'
        		] as com.example.alitababa.entity.User

    static final def RETURNED35=         		[
        			id:2,
        			name:'Jack',
        			age:20,
        			email:'test2@baomidou.com'
        		] as com.example.alitababa.entity.User

    static final def RETURNED36=         		null

    static final def RETURNED37=         		[
        			id:4,
        			name:'Sandy',
        			age:21,
        			email:'test4@baomidou.com'
        		] as com.example.alitababa.entity.User

    static final def RETURNED38=         		null

    static final def RETURNED39=         		[
        			id:5,
        			name:'Billie',
        			age:24,
        			email:'test5@baomidou.com'
        		] as com.example.alitababa.entity.User

    static final def RETURNED40=         		null

    static final def RETURNED31=         		[
        			[
        				id:1,
        				name:'Jone',
        				age:18,
        				email:'test1@baomidou.com'
        			],
        			[
        				id:2,
        				name:'Jack',
        				age:20,
        				email:'test2@baomidou.com'
        			],
        			[
        				id:3,
        				name:'Tom',
        				age:28,
        				email:'test3@baomidou.com'
        			],
        			[
        				id:4,
        				name:'Sandy',
        				age:21,
        				email:'test4@baomidou.com'
        			],
        			[
        				id:5,
        				name:'Billie',
        				age:24,
        				email:'test5@baomidou.com'
        			]
        		].reconstruction(new TypeReference<java.util.List<com.example.alitababa.entity.User>>(){})

    static final def RETURNED32=         		[
        			id:3,
        			name:'Tom',
        			age:28,
        			email:'test3@baomidou.com'
        		] as com.example.alitababa.entity.User

}


