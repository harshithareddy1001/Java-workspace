package com.example.BankProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

    static String name = "Harshitha";
    static String password = "1234";
    static double balance = 1000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("............Please select the option..........");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check balance");
            System.out.println("4. Edit profile");
            System.out.println("5. Change password");
            System.out.println("6. Show profile");
            System.out.println("7. EXIT");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit(sc);
                    break;

                case 2:
                    if (verifyPassword(sc)) {
                        withdraw(sc);
                    }
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    if (verifyPassword(sc)) {
                        editProfile(sc);
                    }
                    break;

                case 5:
                    changePassword(sc);
                    break;

                case 6:
                    showProfile();
                    break;

                case 7:
                    System.out.println("Thank you! Visit again.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }

    static boolean verifyPassword(Scanner sc) {
        try {
            System.out.print("Enter password: ");
            String pass = sc.next();

            if (pass.equals(password)) {
                return true;
            } else {
                throw new Exception("Incorrect password!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    static void deposit(Scanner sc) {
        try {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new Exception("Invalid amount!");
            }

            balance += amount;
            System.out.println("Amount deposited successfully.");

        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric value only.");
            sc.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void withdraw(Scanner sc) {
        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                System.out.println("Insufficient balance!");
            }
            else if (balance - amount < 500) {
                throw new MinimumBalanceException("Minimum balance should be 500");
            }
            else {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            }

        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }


    static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    static void editProfile(Scanner sc) {
        System.out.print("Enter new name: ");
        name = sc.next();
        System.out.println("Profile updated successfully.");
    }

    static void changePassword(Scanner sc) {
        System.out.print("Enter old password: ");
        String oldPass = sc.next();

        if (oldPass.equals(password)) {
            System.out.print("Enter new password: ");
            password = sc.next();
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Incorrect old password!");
        }
    }

    static void showProfile() {
        System.out.println("----- Profile Details -----");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
