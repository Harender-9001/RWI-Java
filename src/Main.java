import work.lambda.SumInter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//        MyInter obj = new MyInterImple();
//        obj.say();
//
        //using our interface with help of anonymous class
//        MyInter obj1 = new MyInter() {
//            @Override
//            public void say() {
//                System.out.println("My first anonymous class");
//            }
//        };
//        obj1.say();
//
//        MyInter obj2 = new MyInter() {
//            @Override
//            public void say() {
//                System.out.println("My second anonymous class");
//            }
//        };
//        obj2.say();

        //using our interface with help of lambda
//        MyInter obj3 = () -> System.out.println("this is lambda ");
//        obj3.say();

        SumInter sumInter = (a, b) -> a + b;

        int res = sumInter.sum(4,6);
        System.out.println("The sum is :" + res);
        res = sumInter.sum(12,65);
        System.out.println("The new sum is :" + res);
    }
}