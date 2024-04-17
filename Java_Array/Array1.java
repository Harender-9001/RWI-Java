package Java_Array;
import java.util.Scanner;

public class Array1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter element of an array :");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("The array is : ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}
