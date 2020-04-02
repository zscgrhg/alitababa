package com.example.alitababa;

import com.example.alitababa.entity.User;
import com.example.alitababa.service.UserService;
import moc.etz.zunit.builder.ZUnitWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlitababaApplicationTests {
    @Autowired
    private UserService userService;
    @Rule
    public final TestRule watchman = new ZUnitWatcher();

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.selectBatchIds(Collections.singletonList(1L));
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelect2() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.selectBatchIds(Collections.singletonList(1L));
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
