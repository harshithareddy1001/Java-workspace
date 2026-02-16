package com.example.thread.shareddata;

public class Thread2 extends Thread {
    PrintNum obj;

    public Thread2(PrintNum obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printNum();//this will execute the thread
    }
}
