package com.mycompany.Model;

public class Jeep extends Car implements Colorable{
    public void honk(){
        System.out.println("*honks in jeep*");
    }
    @Override
    public void color() {
        System.out.println("Yellow");
    }
}
