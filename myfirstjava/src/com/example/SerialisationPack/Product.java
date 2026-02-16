package com.example.SerialisationPack;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private int price;
    public Product(){}



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price, int id){
        this.name=name;
        this.price=price;
        this.id=id;

    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
