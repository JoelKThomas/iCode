package com.iLearn.java.animal.impl;

import com.iLearn.java.animal.AnimalFunctionalInterface;

public class AnimalFunctionalInterfaceImpl implements AnimalFunctionalInterface {
    @Override
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}