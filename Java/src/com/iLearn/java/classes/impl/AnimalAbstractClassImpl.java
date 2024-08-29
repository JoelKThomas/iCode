package com.iLearn.java.animal.impl;

import com.iLearn.java.animal.AnimalAbstract;

public class AnimalAbstractClassImpl extends AnimalAbstract {
    @Override
    public void move() {
        System.out.println("Animal is moving");
    }

    @Override
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}