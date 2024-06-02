package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionsConfig.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
    }
}
