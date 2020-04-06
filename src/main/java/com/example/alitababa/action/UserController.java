package com.example.alitababa.action;

import com.example.alitababa.entity.User;
import com.example.alitababa.service.UserService;

import com.zte.sputnik.parse.annotation.TestSubject;
import com.zte.sputnik.parse.annotation.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@TestSubject
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/user/{id}")
    public List<User> find(@PathVariable("id") Long id,UserService userService){
        return userService.selectBatchIds(Collections.singletonList(id));
    }


    public void modify(List<User> users,@PathVariable("name") String name,@Trace UserService userService){

         userService.modify(users,name);
         if(!users.stream().allMatch(u->"haha".equals(u.getName()))){
             throw new RuntimeException("oops");
         }
        users=null;
    }
}
