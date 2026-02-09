package com.example.LambdaExpression;

public class Test {
    public static void main(String[] args){
        Greetings g=new Greetings() {

            @Override
            public void greet() {

            }


        };
        Greetings g1=()->{System.out.println("hello");};
       g1.greet();
       notable n=(String x)->{
           System.out.println(x);
       };
       n.note("physics");
       washable w=(String b)->{return "washing"+b;};
        System.out.println(w.wash("shirt"));
    }
    //Lambda exp =works only with functional interface

}
