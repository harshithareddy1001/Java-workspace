package com.example.stringops;

public class StringExample {
    public static void main(String[] args) {
        String name="Harshi";
        name="hello"+name;
        // string is immutable so whenever you try to update name it creates new object everytime
        StringBuffer sb = new StringBuffer("Java");

        sb.insert(0, "I love ");

        System.out.println(sb);

    }
}
