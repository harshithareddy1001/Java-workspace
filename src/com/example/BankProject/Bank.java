package com.example.BankProject;

import java.util.Scanner;

public class Bank {
    static String name="Harshitha";
    static String password="12345";
    static double balance=1000;

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Please Select The Option");
            System.out.println("1:Deposit");
            System.out.println("2:Withdraw");
            System.out.println("3:Check Balance");
            System.out.println("4:Edit Profile");
            System.out.println("5:Change Password");
            System.out.println("6:Exit");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
            }

        }while(choice!=6)
        static void deposit(Scanner sc){

        }
    }
}
