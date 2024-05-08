package Java_8_Features;

import Java_8_Features.LambdaWork.*;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");

        MyInter obj = (MyInter) new MyInterImple();
        obj.say();

//        using our interface with help of anonymous class
        MyInter obj1 = new MyInter() {
            @Override
            public void say() {
                System.out.println("My first anonymous class");
            }
        };
        obj1.say();

        MyInter obj2 = new MyInter() {
            @Override
            public void say() {
                System.out.println("My second anonymous class");
            }
        };
        obj2.say();

//        using our interface with help of lambda
        MyInter obj3 = () -> System.out.println("this is lambda ");
        obj3.say();

        //Addition using lambda
        SumInter sumInter = (a, b) -> a + b;
        int res = sumInter.sum(4,6);
        System.out.println("The sum is :" + res);
        res = sumInter.sum(12,65);
        System.out.println("The new sum is :" + res);

        //get length of given string using lambda
        LenInter lenInter = str -> str.length();
        System.out.println("The length of given string is :" + lenInter.getLength("Hello my name is Harender"));

        //check if a given number is even or odd using lambda
        EvenOddInter evenOddInter = num -> {
            if(num%2 == 0){
                System.out.println("The given number " + num + " is a even number");
            }else {
                System.out.println("The given number " + num + " is a odd number");
            }
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        evenOddInter.getEvenOdd(num);
    }
}