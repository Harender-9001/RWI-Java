package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrayList :");
        int num = sc.nextInt();
        System.out.println("Enter the elements of list :");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Given list is :" + list);

        Collections.reverse(list);
        System.out.println("Reverse List is :" + list);
    }
}
