package com.mycompany.Model;

public class Car implements Colorable{
    //super class

    public void honk(){
        System.out.println("Car sound");
    }

    @Override
    public void color() {
        System.out.println("Default car color");
    }
}
