package com;

import com.nn.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName Test
 * @Author nn
 * @Date 2020/5/5 14:38
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-2.xml");
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        userService.queryOrderById(1);
        System.in.read();
    }
}
