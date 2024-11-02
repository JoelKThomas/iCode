package com.iLearn.java.animal.impl;

import com.iLearn.java.animal.AnimalInterface;

public class AnimalInterfaceImpl implements AnimalInterface {
    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    @Override
    public void move() {
        System.out.println("Animal is moving");
    }

    @Override
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}