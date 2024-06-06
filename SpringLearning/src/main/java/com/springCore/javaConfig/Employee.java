package com.springCore.javaConfig;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private String designation;
    //Dependency inject in the form of object
    private AddressBean address;
    public Employee() {
        super();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public void printEmp(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(salary);
        System.out.println(designation);
        System.out.println(address);}

}
