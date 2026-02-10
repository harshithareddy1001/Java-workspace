package oops;
public class car extends vehicle {
    String color;
    String model;
    int year;
    double price;
    public car() {
    }
    public car(String color, String model, int year, double price) {
        this.color = color;
    }
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Car Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
   void start() {
        System.out.println("Car is starting");
    }
    
}
