package Oops_Concept;

public abstract class Vehicle {
    abstract void demo();
}
class Car extends Vehicle{
    void demo(){
        System.out.println("Car start with power button");
    }
}

class Scooter extends Vehicle{
    void demo(){
        System.out.println("Scooter start by self");
    }

    public static void main(String[] args) {
        Car Thar = new Car();
        Thar.demo();
        Scooter chetak = new Scooter();
        chetak.demo();
    }
}
