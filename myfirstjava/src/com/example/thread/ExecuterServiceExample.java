package com.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecuterServiceExample {
    static void main(String[] args) {
        ExecutorService eServe1= Executors.newFixedThreadPool(10);
        Future f1 =eServe1.submit(()->{
                System.out.println("I make a triangle, I am a runnable");
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Runnable ending....");
    });
        Future <Integer> f2=eServe1.submit(()->{
            System.out.println("I Printed a summation,I am callable");
            return 100+100+300;
        });
        try{
            Integer result=f2.get(5, TimeUnit.SECONDS);
            System.out.println("The Summation is"+result);
            somefunnyTask("having fun!");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            eServe1.shutdown();
        }
    }
    private static void somefunnyTask(String funnyname){
        System.out.println("I'M Not from ExecutorService"+funnyname);
    }
}
