package Java_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.Vector;
import java.util.Stack;

public class CollectionTutorial {
    public static void main(String[] args) {
        //Package
        //Interface
        //Class
        //Wrapper class
        //Generics
        //Object
        //Iterator
        //Collection
        //Arrays
        //Comparator

        //List Interface
        //LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(34);
        ll.add(12);
        ll.add(32);
        ll.add(8);
        ll.add(3,5);
        System.out.println("Size of LinkedList :" + ll.size());
        System.out.println("LinkedList :" + ll);
        System.out.println("Value at index :" + ll.get(4));
        ll.remove(3);
        System.out.println(ll);
        System.out.println();

        //ArrayList
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(2);
        arrl.add(8);
        arrl.add(6);
        arrl.add(29);
        arrl.add(10);
        System.out.println("ArrayList is :" + arrl);
        arrl.sort(Comparator.reverseOrder());
        System.out.println("Reverse ArrayList is :" + arrl);
        ArrayList<Integer> sl = new ArrayList<>(arrl.subList(1,4));
        System.out.println(sl);
        System.out.println();

        //Vector
        Vector<Character> v1 = new Vector<>();
        v1.add('H');
        v1.add('a');
        v1.add('r');
        v1.add('r');
        v1.add('y');
        System.out.println("Vector is :" + v1);
        System.out.println("Vector internal capacity is :" + v1.capacity());
        System.out.println("Check is vector empty or not :" + v1.isEmpty());
        v1.clear();
        System.out.println("Vector after clear :" + v1);
        System.out.println();

        //Stack
        Stack<Integer> st = new Stack<>();
        for (int i=1;i<=5;i++){
            st.add(i*2);
        }
        st.add(0,2);
        System.out.println("Stack is :" + st);
        System.out.println("peak element is :" + st.peek());
        st.push(12);
        System.out.println("New stack is :" + st);
        st.pop();
        System.out.println("Stack after pop :" + st);
        System.out.println();


        //Queue InterFace
        //PriorityQueue

        //DeQueue InterFace
        //ArrayDequeue
        //LinkedList

        //Set InterFace
        //HashSet
        //LinkedHashSet
        //SortedSet InterFace
        //TreeSet

        //Map InterFace
        //AbstractMap
        //HashMap
        //EnumMap
        //SortedMap InterFace
        //NavigableMap
        //TreeMap
    }
}
