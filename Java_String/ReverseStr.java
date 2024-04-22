package Java_String;

//import com.github.weisj.jsvg.S;

import java.util.Scanner;

public class ReverseStr {
    //using char Array
//    public static String reverseString(String str){
//        char[] charArray = str.toCharArray();
//        int i = 0;
//        int j = str.length() - 1;
//        while (j > i){
//            char temp = charArray[j];
//            charArray[j] = charArray[i];
//            charArray[i] = temp;
//            i++;
//            j--;
//        }
//        String reverseStr = new String(charArray);
//        return reverseStr;
//    }

    //using StringBuilder
//    public static void reverseString(String str){
//        StringBuilder sb = new StringBuilder(str);
//        String reverseStr = sb.reverse().toString();
//        System.out.println(reverseStr);
//    }

    //using recursion
    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String str = sc.nextLine();
        System.out.println("The reverse string is :");

//        System.out.println(reverseString(str));

//        reverseString(str);

        String reverseStr = reverseString(str);
        System.out.println(reverseStr);
    }
}
