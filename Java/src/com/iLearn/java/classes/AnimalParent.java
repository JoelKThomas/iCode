package com.iLearn.java.animal;

import com.iLearn.java.animal.impl.AnimalAbstractClassImpl;
import com.iLearn.java.animal.impl.AnimalFunctionalInterfaceImpl;
import com.iLearn.java.animal.impl.AnimalInterfaceImpl;

public class AnimalParent {

    public static void main(String[] args) {
        System.out.println("Animal");

        AnimalAbstractClassImpl animalAbstractClassImpl = new AnimalAbstractClassImpl();

        AnimalFunctionalInterfaceImpl animalFunctionalInterfaceImpl = new AnimalFunctionalInterfaceImpl();

        AnimalInterfaceImpl animalInterfaceImpl = new AnimalInterfaceImpl();

        AnimalAbstract animalAbstract = new AnimalAbstract() {
            @Override
            public void move() {
                System.out.println("Animal is moving");
            }

            @Override
            public void sound() {
                System.out.println("Animal is making a sound");
            }
        };

    }
}
