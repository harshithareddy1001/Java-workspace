package com.example.thread.shareddata;

public  class PrintNum {
    static int i;
    public synchronized void printNum(){
        for(i=0;i<=20;i++){
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}