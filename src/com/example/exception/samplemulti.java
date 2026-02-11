package com.example.exception;

public class samplemulti {
    public static void main(String[] args) {
        try {
            int x = 2;
            int y = 10;
            int z = y / x;
            System.out.println(z);
            int[] num = new int[5];
            num[5] = 100;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
