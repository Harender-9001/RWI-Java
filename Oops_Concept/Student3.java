package Oops_Concept;

public class Student3{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student3(){
        System.out.println("Constructor Called");
    }

    Student3(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(this.name + this.age);
    }
}
class Constructor {
    public static void main(String[] args) {
        Student3 obj1 = new Student3("Harender", 24);
        obj1.printInfo();
    }
}
