package com.example.IO;

import java.io.*;

public class ReadExample {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("My.txt");
            BufferedReader br=new BufferedReader(fr);//for faster Reading

            int data;

            while ((data = fr.read()) != -1) {

                System.out.print((char) data);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

