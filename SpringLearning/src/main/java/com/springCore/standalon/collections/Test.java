package com.springCore.standalon.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("standalonConfig.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
        System.out.println(employee1.getAddresses().getClass().getName());

        Employee employee2 = (Employee) context.getBean("employee2");
        System.out.println(employee2);
    }
}
