package com.example.Streams1;

public class Test {
    public static void main(String[] args) {
        sample obj=new sample();
        obj.setX(10);
        obj.incrementX();
        obj.show();
        new sample().setX(100).incrementX().show();
    }
}

