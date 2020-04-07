package com.example.alitababa;

import com.example.alitababa.action.UserController;
import com.example.alitababa.entity.Order;
import com.example.alitababa.entity.User;
import com.example.alitababa.service.UserService;
import com.zte.sputnik.builder.SputnikWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlitababaApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private UserController userController;
    @Rule
    public final TestRule watchman = new SputnikWatcher();

   // @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.selectBatchIds(Collections.singletonList(1L));
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    //@Test
    public void testSelect2() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.selectBatchIds(Collections.singletonList(1L));
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    //@Test
   /* public void testSelect3() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.selectBatchIds(Collections.singletonList(1L));
        userService.modify(userList,"haha");
        List<User> m = userService.selectBatchIds(Collections.singletonList(1L));
        assert m.stream().allMatch(u->"haha".equals(u.getName()));
    }*/
    //@Test
    public void testSelect4() {
        System.out.println(("----- selectAll method test ------"));
        User user = new User();
        user.setId(1L);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userController.modify(userList,"haha",userService);
        assert 1==1;
    }
    @Test
    public void testChain() {
        System.out.println(("----- selectAll method test ------"));

        Order order = userService.testChain(1L);
        assert 1==1;
    }
}
