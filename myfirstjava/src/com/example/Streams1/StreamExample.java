package com.example.Streams1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args){
        List<Product> prodList=new ArrayList<Product>();
        prodList.add(new Product(1001,"TV",95000,1,"Apple",0));
        prodList.add(new Product(1002,"Tripod",7000,2,"Digitech",100));
        prodList.add(new Product(1003,"CCTV Camera",4500,5,"Mi",150));
        prodList.add(new Product(1004,"Mobile",50000,1,"Samsung",0));
        prodList.add(new Product(1005,"Monitor",16000,4,"Dell",100));
        prodList.add(new Product(1006,"Mouse",1200,15,"logitech",50));
    // find out all the names of products with zero delivery charges
        //using List
        List<String> names=prodList.stream().filter(p->p.deliveryCharges==0).map(p->p.name).collect(Collectors.toList());
        //
        List<String> names1=prodList.stream().filter(p->p.deliveryCharges==0)
                .filter(p->p.name.equals("Samsung"))
                .map(p->p.name) .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(names1);
        //using set
        Set<String> nameset=prodList.stream().filter(p->p.deliveryCharges==0) .map(p -> p.name)
                .collect(Collectors.toSet());

        System.out.println(nameset);
        Map<Integer, String> nameMap = prodList.stream()
                .collect(Collectors.toMap(p -> p.prodId, p -> p.name));

        System.out.println(nameMap);
        prodList.stream().forEach(p-> System.out.println(p));
        long count=prodList.stream().map(p->p.quantity).reduce(0,Integer::sum);
        System.out.println(count);



    }
}
