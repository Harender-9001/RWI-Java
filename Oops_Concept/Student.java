package Oops_Concept;
// it is good practice to use the getter and setter instead of using public modifier
public class Student {

    private String name = "Harender";   //private access specifier/modifier
    int rollNumber;
    public Student() {
        name = "Harender";
        rollNumber  = 9001;
    }
    public Student(String n, int num) {
        name = n;
        rollNumber = num;
    }
    public Student(String n) {
        name = n;
    }

    public void print() {
        System.out.println("Name = " + name + " " + "Roll Number = " + rollNumber);
    }

    public String getName() {    // getter() to get private value
        return name;
    }

    public void setName(String name) {   // setter() to set the value of private variable
        this.name = name;   // here this keyword is the reference of current object
    }
}
