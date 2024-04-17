package Java_Array;
import java.util.Scanner;

public class MinOfArray {
    public static int minOfArray(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        int min = minOfArray(number);
        System.out.println("Minimum value in array is :"+ min);
    }
}
