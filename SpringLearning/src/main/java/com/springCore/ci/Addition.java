package com.springCore.ci;public class Addition {
    private int num1;
    private int num2;

    public Addition(int num1, int num2) {
        System.out.println("Constructor int, int called");
        this.num1 = num1;
        this.num2 = num2;
    }

    public Addition(double num1, double num2) {
        System.out.println("Constructor double, double called");
        this.num1 = (int)num1;
        this.num2 = (int)num2;
    }

    public Addition(String num1, String num2) {
        System.out.println("Constructor String, String called");
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
    }

    public void getSum() {
        System.out.println("num1: " + this.num1);
        System.out.println("num2: " + this.num2);
        System.out.println("Sum: " + (this.num1 + this.num2));
    }
}
