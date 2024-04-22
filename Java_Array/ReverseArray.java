package Java_Array;
import java.util.Scanner;

public class ReverseArray {
    public static void printArray(){

    }
    // Using Loop
    public static int[] reverseOfArray(int[] arr, int n){
        int left = 0;
        int right = n-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The reverse of given array is :");
        System.out.println(reverseOfArray(arr, size));
    }
}
