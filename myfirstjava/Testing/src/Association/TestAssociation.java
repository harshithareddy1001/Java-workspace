package Association;

class Restaurant {
    Chef chef;       // Association
    Waiter waiter;   // Association

    Restaurant(Chef chef, Waiter waiter) {
        this.chef = chef;
        this.waiter = waiter;
    }

    void openRestaurant() {
        chef.cookFood();
        waiter.serveFood();
        System.out.println("Restaurant is open for customers");
    }
}

public class TestAssociation {
    public static void main(String[] args) {
        Chef c = new Chef();
        Waiter w = new Waiter();

        Restaurant r = new Restaurant(c, w);
        r.openRestaurant();
    }
}
