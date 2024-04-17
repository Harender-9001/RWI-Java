package Oops_Concept;

public interface Bank {
    float rateOfInterest();
}

class SBI implements Bank{
    public float rateOfInterest(){ return 9.04f; }
}
class PNB implements Bank{
    public float rateOfInterest(){return 9.7f;}
}
class BankUse {
    public static void main(String[] args) {
        Bank emp1 = new SBI();
        SBI emp2 = new SBI();
        Bank emp3 = new PNB();
        PNB emp4 = new PNB();
        System.out.println("Rete of Interest :" + emp1.rateOfInterest());
        System.out.println("Rete of Interest :" + emp2.rateOfInterest());
        System.out.println("Rete of Interest :" + emp3.rateOfInterest());
        System.out.println("Rete of Interest :" + emp4.rateOfInterest());
    }
}
