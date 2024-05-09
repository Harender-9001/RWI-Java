package Java_8_Features.StreamAPIWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        //create a list of numbers and filter all even numbers from the list
        List<Integer> list1 = List.of(2,4,6,3,7,4,78,5,34,56,43);

        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(45);
        list2.add(8);
        list2.add(56);
        list2.add(76);
        list2.add(89);

        List<Integer> list3 = Arrays.asList(23,45,34,54,5,45,64,34,6,5,3);

        //EvenList without stream
        List<Integer> evenList = new ArrayList<>();

        for (Integer i : list1) {
            if (i%2 == 0) {
                evenList.add(i);
            }
        }

        System.out.println("List1 :" + list1);
        System.out.println("All even in list1 :" + evenList);

        //EvenList using stream
        Stream<Integer> stream = list2.stream();
        List<Integer> evenList2 = stream.filter(i -> i%2 == 0).toList();
        System.out.println("List2 :" + list2);
        System.out.println("ALl even in list2 :" + evenList2);

        List<Integer> evenList3 = list3.stream().filter(integer -> integer%2 == 0).toList();
        System.out.println("List3 :" + list3);
        System.out.println("All even in list3" + evenList3);

        //get all numbers greater than 20 in list3
        System.out.println("ALl numbers greater than 20 in list3" + list3.stream().filter(integer -> integer>20).toList());
    }
}
