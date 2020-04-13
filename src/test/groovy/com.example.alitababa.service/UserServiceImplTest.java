package com.example.alitababa.service;

import com.example.alitababa.entity.ServiceData;
import com.example.alitababa.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class UserServiceImplTest {
    @Mock
    UserMapper userMapper;
    @InjectMocks
    UserServiceImpl userServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testQuery() {
        ServiceData result = userServiceImpl.query(Long.valueOf(1), null, null);
        Assertions.assertEquals(new ServiceData(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme