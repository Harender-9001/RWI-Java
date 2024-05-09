package Java_8_Features.StreamAPIWork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    int rollNo;
    String add;
    public Student(int id, String name, int rollNo, String add) {
        super();
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.add = add;
    }
}

public class StreamDemo {
    public static void main(String[] args) {

        List<Student> studentData = new ArrayList<Student>();
        studentData.add(new Student(1, "Harender", 9001, "Hodal"));
        studentData.add(new Student(2, "Aakash", 9003, "Bhiwani"));
        studentData.add(new Student(3, "Nishant", 3080, "Hodal"));
        studentData.add(new Student(4, "Hitesh", 3048, "Palwal"));
        studentData.add(new Student(5, "Deepak", 3030, "Rewari"));
        studentData.add(new Student(6, "Shekhar", 3041, "Hodal"));
        studentData.add(new Student(7, "Jai Bharat", 3046, "Hodal"));
        studentData.add(new Student(8, "Vipul", 3054, "Hisar"));

        List<String> usefulData = studentData.stream()
                .filter(student -> student.add.equals("Hodal"))
                .map(student -> student.name).toList();
        System.out.println(usefulData);
    }
}
