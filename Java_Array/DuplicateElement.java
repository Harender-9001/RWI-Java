package Java_Array;
import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of test cases :");
//        int t = sc.nextInt();

//        for(int i=1;i<=t;i++){
            System.out.println("Enter size of an array :");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the elements of an array :");
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            System.out.println("The duplicate element in the given array is :");
            int r = 0;
            for(int k=0;k<=n-1;k++){
                for(int j=k;j<=n-1;j++){
                    if(arr[k]==arr[j] && k!=j){
                        r = arr[k];
                        System.out.println(r);
                        break;
                    }
                }
//            }
        }
    }
}
