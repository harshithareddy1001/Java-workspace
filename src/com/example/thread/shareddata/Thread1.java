package com.example.thread.shareddata;

public class Thread1 extends Thread{
    PrintNum obj;
    public Thread1(PrintNum obj) {
        this.obj = obj;
    }
public void run(){
    obj.printNum();
}

}