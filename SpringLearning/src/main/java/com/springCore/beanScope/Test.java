package com.springCore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("scopeConfig.xml");
        // Using singleton scope
        Hello obj1 = (Hello) context.getBean("beanScope1");
        obj1.setMessage("I'm object A");
        obj1.getMessage();

        Hello obj2 = (Hello) context.getBean("beanScope1");
        obj2.getMessage();

        // Using prototype scope
        Hello obj3 = (Hello) context.getBean("beanScope2");
        obj3.setMessage("I'm object A");
        obj3.getMessage();

        Hello obj4 = (Hello) context.getBean("beanScope2");
        obj4.getMessage();
    }
}
