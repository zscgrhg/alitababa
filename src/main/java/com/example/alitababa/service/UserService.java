package com.example.alitababa.service;

import com.example.alitababa.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

public interface UserService {
    List<User> selectBatchIds(@Param("coll") Collection<Long> idList);
}
