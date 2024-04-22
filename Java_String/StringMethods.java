package Java_String;

public class StringMethods {
    public static void main(String[] args) {
        // CharAt() method
        String str = "Welcome to my profile";
        int strLength = str.length();
        // Fetching first character
        System.out.println("Character at 0 index is: "+ str.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: "+ str.charAt(strLength-1));

        // compareTo() method It compares strings on the basis of the Unicode value of each character in the strings and returns 0, negative and positive value
        // if s1 > s2, it returns positive number
        // if s1 < s2, it returns negative number
        // if s1 == s2, it returns 0
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        String s5="flag";
        System.out.println(s1.compareTo(s2));//0 because both are equal
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"
        System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"

        // contains() method checks first string contains second or not if yes returns true otherwise false
        String name="what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));

        // equals() method compares two given strings if any character not match return false otherwise true
        String str1="Harry";
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());
        sb1.append("java is my favourite language");
        System.out.println(sb1.capacity());
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb2.capacity());
        String str2="Harry";
        String str3="HARRY";
        String str4="Barry";
        System.out.println(sb1.equals(sb2));   //false because equals() in StringBuilder checks reference
        System.out.println(str1.equals(str2)); //true because content and case is same
        System.out.println(str1.equals(str3)); //false because case is not same
        System.out.println(str1.equalsIgnoreCase(str3)); //true because case are ignored
        System.out.println(str1.equals(str4)); //false because content is not same
//        sb1.append("java is my favourite language");
        System.out.println(sb1.capacity());

        // indexOf() method returns the position of first occurrence of specified character or string
        String str6 = "this is index of example";
        //passing substring
        int index1 = str6.indexOf("is"); //returns the index of is substring
        int index2 = str6.indexOf("index"); //returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

        //passing substring with from index
        int index3 = str6.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

        //passing char value
        int index4 = str6.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3

        //split() method splits this string against given regular expression and returns a char array.
        String s6="welcome to split world";
        String s7="welcometosplitworld";
        System.out.println("returning words:");
        for(String w:s6.split("\\s")){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s6.split("\\s",0)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s6.split("\\s",1)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s6.split("\\s",2)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s7.split("o")){
            System.out.println(w);
        }

        //substring() method returns a part of the string.
        String srt1="HelloHoney";
        String substr = srt1.substring(0); // Starts with 0 and goes to end
        System.out.println(substr);
        String substr2 = srt1.substring(5,10); // Starts from 5 and goes to 10
        System.out.println(substr2);
//        String substr3 = srt1.substring(5,15); // Returns Exception

        //trim() method eliminates leading and trailing spaces
        String srt2="  hello trim()   ";
        System.out.println(srt2+"method"); //without trim()
        System.out.println(srt2.trim()+"method"); //with trim()

    }
}
