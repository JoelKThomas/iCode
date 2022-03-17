package com.iLearn.designpatterns.strategypattern;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}