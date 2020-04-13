package com.example.alitababa.action;

import com.example.alitababa.entity.ServiceData;
import com.example.alitababa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/user/{id}")
    public ServiceData find(@PathVariable("id") Long id, HttpServletRequest request, HttpServletResponse response) {
        return userService.query(id, request, response);
    }

}
