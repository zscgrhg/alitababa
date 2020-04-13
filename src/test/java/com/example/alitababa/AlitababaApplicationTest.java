package com.example.alitababa;

import com.example.alitababa.service.ServiceLocator;
import com.example.alitababa.service.ServiceLocatorLocator;
import com.example.alitababa.service.UserServiceImpl;
import com.example.alitababa.service.WeatherService;
import com.zte.sputnik.builder.SputnikUTFactory;
import lombok.SneakyThrows;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = AlitababaApplication.class)
@AutoConfigureMockMvc
public class AlitababaApplicationTest {


    @Autowired
    private MockMvc mvc;
    @Rule
    public final SputnikUTFactory watchman = new SputnikUTFactory()
            .subject(UserServiceImpl.class)
            .mockFieldsHasAnnotation(Autowired.class)
            .mockClass(ServiceLocatorLocator.class,
                    ServiceLocator.class,
                    WeatherService.class,
                    HttpServletRequest.class,
                    HttpSession.class,
                    HttpServletResponse.class);


    //@Test
    @SneakyThrows
    public void test() {
        mvc.perform(MockMvcRequestBuilders
                .get("/query/1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
    @Test
    @SneakyThrows
    public void test2() {
        mvc.perform(MockMvcRequestBuilders
                .get("/query/2")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @SneakyThrows
    public void test3() {
        mvc.perform(MockMvcRequestBuilders
                .get("/user/1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
    @Test
    @SneakyThrows
    public void test4() {
        mvc.perform(MockMvcRequestBuilders
                .get("/user/2")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
