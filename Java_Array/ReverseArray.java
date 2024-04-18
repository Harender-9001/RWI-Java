package Java_Array;
import java.util.Scanner;

public class ReverseArray {
    public static void reverseOfArray(int arr[], int n){
        for (int i=n-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The reverse of given array is :");
        reverseOfArray(arr,size);
    }
}
