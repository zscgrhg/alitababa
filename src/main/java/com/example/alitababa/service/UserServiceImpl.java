package com.example.alitababa.service;

import com.example.alitababa.entity.ServiceData;
import com.example.alitababa.entity.User;
import com.example.alitababa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public ServiceData query(Long id, HttpServletRequest request, HttpServletResponse response) {
        User user = userMapper.selectById(id);
        HttpSession session = request.getSession();
        Object attribute = session.getAttribute(user.getName());
        if (attribute != null && attribute instanceof ServiceData) {
            return (ServiceData) attribute;
        }
        String weather = "unkown";
        if (ServiceLocatorLocator.compute(id.intValue(), 1)) {
            weather=  IntStream.range(1,4).parallel().mapToObj(x->
                    ServiceLocatorLocator.findServiceLocator().findWeatherService().getWeather())
                    .collect(Collectors.joining());
        }
        ServiceData ret = new ServiceData();
        ret.setData(user);
        ret.setWeather(weather);
        session.setAttribute(user.getName(), user);
        response.setStatus(200);
        return ret;
    }
}
