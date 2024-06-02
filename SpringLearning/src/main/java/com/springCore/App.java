package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springCore.collections.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context1.getBean("student1");
        Student student2 = (Student) context1.getBean("student2");
        Student student3 = (Student) context1.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
