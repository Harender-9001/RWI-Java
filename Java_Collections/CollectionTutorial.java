package Java_Collections;

import java.util.*;
class Demo{
    int id;
    String name;
    double salary;
    public Demo(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

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
        ll.add(3, 5);
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
        ArrayList<Integer> sl = new ArrayList<>(arrl.subList(1, 4));
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
        for (int i = 1; i <= 5; i++) {
            st.add(i * 2);
        }
        st.add(0, 2);
        Iterator<Integer> itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println("Stack elements are :" + itr.next());
        }
//        System.out.println("Stack is :" + st);
        System.out.println("peak element is :" + st.peek());
        st.push(12);
        System.out.println("New stack is :" + st);
        st.pop();
        System.out.println("Stack after pop :" + st);
        System.out.println();


        //Queue InterFace
        //PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer("Harender");
        queue.add("Aakash");
        queue.add("Nishant");
        queue.offer("Ravi");
        System.out.println("PriorityQueue head:" + queue.element());
        System.out.println("PriorityQueue peak:" + queue.peek());
        System.out.println("iterating the queue elements :");
        for (String s : queue) {
            System.out.println(s);
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println();

        //DeQueue InterFace
        //ArrayDequeue
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("Harender");
        deque.add("Karan");
        deque.add("Aakash");
        deque.offer("Mahender");
        System.out.println("ArrayDequeue peak :" + deque.peek());
        //Traversing elements
        for (String str : deque) {
            System.out.println("ArrayDequeue elements :" + str);
        }
        System.out.println();
        //LinkedList

        //Set InterFace
        //HashSet
        System.out.println("HashSet :");
        HashSet<Demo> hs = new HashSet<>();
        Demo d1 = new Demo(121,"Harender", 85000.0);
        Demo d2 = new Demo(130,"Aakash", 75000.0);
        Demo d3 = new Demo(127,"Kirti", 80000.0);
        Demo d4 = new Demo(130,"Aakash",75000.0);
        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);
        for(Demo d:hs) {
            System.out.println("Employee id :" + d.id + "\n" + "Employee Name :" + d.name + "\n" + "Employee Salary :" + d.salary);
        }
        System.out.println();

        //LinkedHashSet
        System.out.println("LinkedHashSet :");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(23);
        lhs.add(34);
        lhs.add(65);
        lhs.add(12);
        lhs.add(34);
        System.out.println("All values :" + lhs);
        System.out.println();

        //SortedSet InterFace
        //TreeSet
        System.out.println("SortedSet :");
        SortedSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(12);
        ts.add(65);
        ts.add(54);
        ts.add(12);
        ts.add(65);
        System.out.println(ts);
        for(Integer el : ts) {
            System.out.println(el);
        }
        System.out.println();

        //Map InterFace
        //AbstractMap
        //HashMap
        //EnumMap
        //SortedMap InterFace
        //NavigableMap
        //TreeMap
    }
}
