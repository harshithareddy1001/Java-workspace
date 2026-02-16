package oops;
public class cardemo {
    public static void main(String[] args) {
        car c1 = new car("Red", "Toyota Camry", 2020, 25000.0);
        vehicle v1 = new car();
        vehicle v2 = new vehicle();
        c1.displayInfo();
        v1.start();
        v2.start();

    }
}
