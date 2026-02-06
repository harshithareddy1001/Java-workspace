package oops;

class BankAccount {
    private double balance = 5000;   // data hidden

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }
}

public class encapuslation_demo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(7000);
        System.out.println(acc.getBalance());
    }
}

