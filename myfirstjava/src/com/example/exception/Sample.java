package com.example.exception;

public class Sample {
    public static void main(String[] args){
        try{
            int x=0;
            int y=10;
            int z=y/x;//runtime exception
            System.out.println(z);
            int[] num=new int[5];
            num[5]=100;
        }catch (ArithmeticException e){
            System.out.println("cant divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("Array issue");
            System.out.println(x.getMessage());
        }catch(Exception x){
            System.out.println(x.getMessage());
        }finally {
            System.out.println("I will execute no matter what");
        }
    }
}
