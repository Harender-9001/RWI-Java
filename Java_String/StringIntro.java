package Java_String;

public class StringIntro {
    public static void main(String[] args) {
        //array of character declaration of string
        char[] arr = {'H','a','r','e','n','d','e','r'};

        // literals declaration of string
        String str1 = "Hello";
        String str2 = "Harender";
        String str3 = "Hello";

        // find length of given string
        System.out.println(str2.length());

        //concatenation of two strings
        System.out.println(str3 + "Honey");

        System.out.println(str3 + str2);

        str1 = str1.concat(str2);
        System.out.println(str1);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Harender");
        System.out.println(sb.toString());


        // return true or false based on equality
        System.out.println(str1.equals(str3));

        // compareTo method compare two strings lexicographically mean Unicode value of each character, it returns 0 for equal, otherwise subtraction of Unicode values
        System.out.println(str1.compareTo(str3));

        // check first string contains other or not
        System.out.println(str2.contains("end"));

        // return substring from 1 to 3, exclude end index
        System.out.println(str2.substring(1,4));

        // return char value at index 3
        System.out.println(str2.charAt(3));


        String[] arr1 = str2.split("e");
        for(String w : arr1){
            System.out.println(w);
        }

        // String split method split the given string based in regular expression and limit of words, and returns array of string
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s",3);  //splits the string based on whitespace, it returns array of String
        //using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }
        System.out.println(words.length);
    }
}
