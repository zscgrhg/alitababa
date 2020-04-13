package com.example.alitababa.service;

import com.example.alitababa.entity.ServiceData;
import com.example.alitababa.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;

public interface UserService {
    ServiceData query(Long id, HttpServletRequest request, HttpServletResponse response);
}
