package Java_8_Features;

interface sayble {
    void say(String msg);
    //methods of object class
    int hashCode();
    String toString();
    boolean equals(Object obj);
    default int add(int a, int b) {
        return a+b;
    }
}
public class FunctionalInterfaceDemo implements sayble {
    public void say(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterfaceDemo obj1 = new FunctionalInterfaceDemo();
        obj1.say("Hello Honey");
        int result = obj1.add(12,43);
        System.out.println(result);
    }
}
