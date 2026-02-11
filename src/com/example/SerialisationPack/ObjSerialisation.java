package com.example.SerialisationPack;

import java.io.*;

public class ObjSerialisation {
    public static void main(String[] args){
  try {
      //Serialization = Object ➜ File
      //Deserialization = File ➜ Object
        Product p1=new Product("TV",100,2000);
        FileOutputStream fos=new FileOutputStream("myobject.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        FileInputStream fis=new FileInputStream("myobject.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        oos.writeObject(p1);//This line converts the object into bytes and stores it in myobject.txt.This is called Serialization.
        System.out.println("Object is serialized");
        System.out.println("Strat deserialisation");
        Product prod=(Product)ois.readObject();//Reads the object from file and converts it back into a Product object.This is called Deserialization.
        System.out.println(prod);

    }
        catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
