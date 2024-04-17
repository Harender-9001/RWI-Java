package Java_Array;
import java.util.Scanner;

public class MaxOfArray {
    public static int maxOfArray(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
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

        int max = maxOfArray(number);
        System.out.println("Maximum value in array is :"+ max);
    }
}
