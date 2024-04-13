package Oops_Concept;

public class StudentUse {
    public static void main(String[] args) {
        Student s1;    // create the reference s1 in stack
        s1 = new Student();  // create object with all properties in heap
        Student s2 = new Student();   // create reference s2 in stack that reference to the object with all properties in heap
        System.out.println(s2);       // print memory address of s1
        System.out.println(s1.getName() + " " + s1.rollNumber);
        s2.setName("Kirti");  // set value to private variable
        s2.rollNumber = 9007;
        System.out.println(s2.getName() + " " + s2.rollNumber);
    }
}
