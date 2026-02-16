package oops;

interface Payment {
    void pay();   // abstract method
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment using UPI");
    }
}

public class interface_demo {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
    }
}
