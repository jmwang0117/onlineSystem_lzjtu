package com.wjm.Test;

import com.wjm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:Spring/spring-dao.xml");
        UserService as = (UserService) ac.getBean("userService");
        as.findAll();

    }
}
