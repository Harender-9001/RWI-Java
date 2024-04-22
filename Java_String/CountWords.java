package Java_String;

import java.util.Scanner;

public class CountWords {
    public static short countWord(String str){
        short count = 1;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i) == ' '){
                ++count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String str = sc.nextLine();
        System.out.println("Total number of words in given string are :");
        short result = countWord(str);
        System.out.println(result);

    }
}
