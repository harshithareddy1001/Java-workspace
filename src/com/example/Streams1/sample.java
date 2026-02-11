package com.example.Streams1;

public class sample {
    int x;
    public sample setX(int a)
    {
        this.x=a;
        return this;
    }
    public sample incrementX(){
        this.x++;
        return this;
    }
    public void show()
    {
        System.out.println(this.x);
    }
}

