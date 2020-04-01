package com.example.alitababa.service;

import com.example.alitababa.entity.User;
import com.example.alitababa.mapper.UserMapper;
import moc.etz.zunit.parse.annotation.TestSubject;
import moc.etz.zunit.parse.annotation.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
@Service
@TestSubject
public class UserServiceImpl implements UserService {
    @Autowired
    @Trace
    private UserMapper userMapper;
    @Override
    public List<User> selectBatchIds(Collection<Long> idList) {
        return userMapper.selectBatchIds(idList);
    }
}
