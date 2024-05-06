package Java_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrayList :");
        int num = sc.nextInt();
        System.out.println("Enter the elements of list :");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Given list is :" + list);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("Maximum value is :" + max);
        System.out.println("Minimum value is :" + min);
    }
}
