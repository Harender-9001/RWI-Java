package Oops_Concept;

public class Student1 {
    final int rollNumber;
    String name;
    double cgpa;
     static final double conversionFactor = 0.9;
    static int studentCount;  // static keyword make the variable or methods and class member not an object member that mean all tha object of class can share the same value of static variable

    Student1(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        System.out.println("Name :" + this.name + "\n" + "Roll Number :" + this.rollNumber);
        Student1.studentCount++;
        System.out.println("Number of Students :" + Student1.studentCount);
    }
    public static void main(String[] args) {
//        System.out.println(Student1.studentCount);
        Student1 s1 = new Student1("Harender", 9001);

        s1.name = "Deepak";
        System.out.println("Name :" + s1.name);
    //    s1.rollNumber = 9002;   this will show an error: cannot assign a value to final variable rollNumber
        System.out.println("Roll Number :" + s1.rollNumber);

        Student1 s2 = new Student1("Aakash", 9003);
        Student1 s3 = new Student1("Kirti", 9007);
    }
}
