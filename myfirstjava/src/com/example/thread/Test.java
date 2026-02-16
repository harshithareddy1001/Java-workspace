package com.example.thread;

public class Test {
    static void main() {

        MyThread t1 = new MyThread();
        t1.start();
        MyTask my = new MyTask();
        Thread t2 = new Thread(my);
        t2.start();
    }

}
