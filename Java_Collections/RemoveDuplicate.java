package Java_Collections;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrayList :");
        int num = sc.nextInt();
        System.out.println("Enter the elements of list :");
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<num;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Given list is :" + list);

        //using HashSet
        System.out.println("Using HashSet");
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("List after removing duplicates :" + list);

        //using Java 8 Stream API

        //using a for loop and temporary list
        System.out.println("Using for loop and temporary list :");
        List<Integer> distinctList = new ArrayList<>();
        for (Integer element : list) {
            if (!distinctList.contains(element)) {
                distinctList.add(element);
            }
        }
        System.out.println("List after removing duplicates :" + distinctList);
    }
}
