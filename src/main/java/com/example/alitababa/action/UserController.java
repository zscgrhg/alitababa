package com.example.alitababa.action;

import com.example.alitababa.entity.User;
import com.example.alitababa.service.UserService;
import moc.etz.zunit.parse.annotation.TestSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@TestSubject
public class UserController {
    @Autowired

    UserService userService;

    @GetMapping("/user/{id}")
    public List<User> find(@PathVariable("id") Long id){
        return userService.selectBatchIds(Collections.singletonList(id));
    }
}
