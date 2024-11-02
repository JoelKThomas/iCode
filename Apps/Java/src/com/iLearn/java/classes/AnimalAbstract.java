package com.iLearn.java.animal;

public abstract class AnimalAbstract {
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public abstract void move();
    public abstract void sound();
}
