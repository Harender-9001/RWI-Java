package com.springCore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class JavaConfig {
    @Bean(name="id1")
    public  Employee getEmp()
    {
        AddressBean addressBean = new AddressBean(154,"Hodal","Haryana");

        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empId, empName, salary and designation");
        int id = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        String designation = sc.next();

        employee.setEmpId(id);
        employee.setEmpName(name);
        employee.setDesignation(designation);
        employee.setSalary(salary);
        employee.setAddress(addressBean);

        return employee;

    }

}
