package com.example.alitababa.service

import spock.lang.Specification;
import com.fasterxml.jackson.core.type.TypeReference;


/**
*
*/
class UserServiceImpl20200403085404selectBatchIdsN1Spec extends Specification {
void verifyselectBatchIds() {
given:
def subject = new com.example.alitababa.service.UserServiceImpl()
    subject.userMapper=Mock(com.example.alitababa.mapper.UserMapper){
    1 * selectById(INPUTS4[0]) >> RETURNED4 
    1 * selectById(INPUTS3[0]) >> RETURNED3 
    1 * selectById(INPUTS2[0]) >> RETURNED2 
    1 * selectById(INPUTS6[0]) >> RETURNED6 
    1 * selectById(INPUTS7[0]) >> RETURNED7 
    1 * selectById(INPUTS5[0]) >> RETURNED5 
    1 * selectById(INPUTS8[0]) >> RETURNED8 
    1 * selectById(INPUTS10[0]) >> RETURNED10 
    1 * selectById(INPUTS9[0]) >> RETURNED9 
    }
when:
def ret=subject.selectBatchIds(*INPUTS1)
then:
ret == RETURNED1
}


    static final def INPUTS1= [
        		[
        			1
        		].reconstruction(new TypeReference<java.util.Collection<java.lang.Long>>(){})
    ]
    static final def INPUTS2= [
        		4
    ]
    static final def INPUTS3= [
        		8
    ]
    static final def INPUTS4= [
        		6
    ]
    static final def INPUTS5= [
        		3
    ]
    static final def INPUTS6= [
        		2
    ]
    static final def INPUTS7= [
        		1
    ]
    static final def INPUTS8= [
        		9
    ]
    static final def INPUTS9= [
        		7
    ]
    static final def INPUTS10= [
        		5
    ]

    static final def OUTPUTS1= [
        		[
        			1
        		].reconstruction(new TypeReference<java.util.Collection<java.lang.Long>>(){})
    ]
    static final def OUTPUTS2= [
        		4
    ]
    static final def OUTPUTS3= [
        		8
    ]
    static final def OUTPUTS4= [
        		6
    ]
    static final def OUTPUTS5= [
        		3
    ]
    static final def OUTPUTS6= [
        		2
    ]
    static final def OUTPUTS7= [
        		1
    ]
    static final def OUTPUTS8= [
        		9
    ]
    static final def OUTPUTS9= [
        		7
    ]
    static final def OUTPUTS10= [
        		5
    ]

    static final def RETURNED1=         		[
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

    static final def RETURNED2=         		[
        			id:4,
        			name:'Sandy',
        			age:21,
        			email:'test4@baomidou.com'
        		] as com.example.alitababa.entity.User

    static final def RETURNED3=         		null

    static final def RETURNED4=         		null

    static final def RETURNED5=         		[
        			id:3,
        			name:'Tom',
        			age:28,
        			email:'test3@baomidou.com'
        		] as com.example.alitababa.entity.User

    static final def RETURNED6=         		[
        			id:2,
        			name:'Jack',
        			age:20,
        			email:'test2@baomidou.com'
        		] as com.example.alitababa.entity.User

    static final def RETURNED7=         		[
        			id:1,
        			name:'Jone',
        			age:18,
        			email:'test1@baomidou.com'
        		] as com.example.alitababa.entity.User

    static final def RETURNED8=         		null

    static final def RETURNED9=         		null

    static final def RETURNED10=         		[
        			id:5,
        			name:'Billie',
        			age:24,
        			email:'test5@baomidou.com'
        		] as com.example.alitababa.entity.User

}


