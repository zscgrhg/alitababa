package com.example.alitababa.service;

import com.example.alitababa.entity.User;
import com.example.alitababa.mapper.UserMapper;
import moc.etz.zunit.parse.annotation.TestSubject;
import moc.etz.zunit.parse.annotation.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@TestSubject
public class UserServiceImpl implements UserService {
    @Autowired
    @Trace
    private UserMapper userMapper;
    @Override
    public List<User> selectBatchIds(Collection<Long> idList) {
        List<User> users = IntStream.range(1, 10).parallel().mapToObj(x -> userMapper.selectById(x))
                .filter(Objects::nonNull).collect(Collectors.toList());
        return users;
    }

    @Override
    public void    modify(List<User> users, String name) {
        for (User user : users) {
            user.setName(name);
            userMapper.updateById(user);
        }
        Long id = users.get(0).getId();

    }
}
