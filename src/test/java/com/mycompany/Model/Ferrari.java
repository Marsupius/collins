package com.mycompany.Model;

public class Ferrari extends Car implements Colorable{
    public void honk(){
        System.out.println("*honks in ferrari*");
    }
    @Override
    public void color() {
        System.out.println("Red");
    }
}
