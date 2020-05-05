package com.nn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName One
 * @Author nn
 * @Date 2020/5/5 14:58
 */
public class One {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-2.xml");
        System.out.println("服务提供者启动成功:21880");
        System.in.read();
    }
}
