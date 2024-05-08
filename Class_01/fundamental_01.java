package Class_01;

public class fundamental_01 {
    fundamental_01(String name){
        System.out.println("Consrtuctor 1 " + name);
    }

    fundamental_01(String name, int agg){
        System.out.println("Constructor 2 " + name + " " + agg);
    }

    fundamental_01(long salary){
        System.out.println("Constructor 3 " + salary);
    }
}

class use {
    public static void main(String[] args) {
        fundamental_01 s4 = new fundamental_01("Harender", 9001);
        fundamental_01 s5 = new fundamental_01(80);
    }
}

