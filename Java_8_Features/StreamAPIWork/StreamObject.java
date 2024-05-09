package Java_8_Features.StreamAPIWork;

import java.lang.reflect.Array;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //create object of stream
        // 1st way blank stream
        Stream<Object> stream = Stream.empty();

        // 2nd way by creating stream of array, object, collection
        String []arr = {"Harender", "Aakash", "Nishant", "Haresh", "Hitesh", "Deepak"};

        Stream<String> stream1 = Stream.of(arr);

        stream1.forEach(e -> System.out.println(e));
    }
}
