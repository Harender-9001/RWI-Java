package Java_String;

import java.util.Scanner;

public class PrintString {
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String str = sc.nextLine();
        System.out.println("The given string is :");
        print(str);
    }
}
