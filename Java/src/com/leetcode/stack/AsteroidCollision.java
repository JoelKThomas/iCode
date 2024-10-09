package com.leetcode.stack;

import java.util.*;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top = 0;

        int index = 0;

        while (index < asteroids.length) {
            int newAsteroids = asteroids[index];
            if (newAsteroids > 0) {
                stack[top++] = newAsteroids;
            }
            else {
                while (top != 0 && stack[top - 1] > 0 && Math.abs(newAsteroids) > stack[top - 1]) {
                    top--;
                }
                if (top != 0 && Math.abs(newAsteroids) == stack[top - 1]) {
                    top--;
                }
                else if (top == 0 || stack[top - 1] < 0) {
                    stack[top++] = newAsteroids;
                }
            }
            index++;
        }

        int[] result = new int[top];

        for (int i = 0; i < top; i++) {
            result[i] = stack[i];
        }

        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision ac = new AsteroidCollision();
        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {10, 2, -5};

        System.out.println(Arrays.toString(ac.asteroidCollision(asteroids1))); // Output: [5, 10]
        System.out.println(Arrays.toString(ac.asteroidCollision(asteroids2))); // Output: []
        System.out.println(Arrays.toString(ac.asteroidCollision(asteroids3))); // Output: [10]
    }
}
