package com.example.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Samplecompiletime {

        public static void main(String[] args){
            try{
                int x=2;
                int y=10;
                int z=y/x;//runtime exception
                System.out.println(z);
                int[] num=new int[5];
                num[4]=100;
                //compile time exception -you must include catch block/exception handler
                FileReader fr= new FileReader("Text1.txt");
            }catch (ArithmeticException e){
                System.out.println("cant divide by zero");
            }
            catch(FileNotFoundException x){

                System.out.println(x.getMessage());
            }

            finally {
                System.out.println("I will execute no matter what");
            }
        }
    }


