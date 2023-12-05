package org.example;

import javax.naming.CannotProceedException;
import javax.naming.Name;

public class Dog {


    private String name;
    private String color;
    private int old;
    public Dog(String name,String color,int old){
        this.name = name;
        this.color = color;
        this.old = old;
    }

    public Dog(String name,String color){
        this.name = name;
        this.color = color;
    }
    public Dog(String name){
        this.name = name;
    }

    public void bark() {
        System.out.println("wen~wen~");
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getOld() {
        return this.old;
    }
}
