package Java_8_Features.StreamAPIWork;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class StreamObject {
    public static void main(String[] args) {

        //create object of stream
        // 1st way blank stream
        Stream<Object> stream = Stream.empty();
        System.out.println(stream);

        // 2nd way by creating stream of array, object, collection
        String []arr = {"Harender", "Aakash", "Nishant", "Haresh", "Hitesh", "Deepak"};

        Stream<String> stream1 = Stream.of(arr);

        stream1.filter(e -> e.startsWith("H")).forEach(e -> System.out.println(e));

        // 3rd
        Stream<Object> objectStream = Stream.builder().build();

        // 4th
        IntStream stream2 = Arrays.stream(new int[] {1,2,34,53,2,4,2,34,35,42,35,2});
        stream2.forEach(e -> System.out.println(e));

        // 5 most important
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(43);
        integerList.add(52);
        integerList.add(91);

        Stream<Integer> stream3 = integerList.stream();
        stream3.forEach(e -> System.out.println(e));
    }
}
