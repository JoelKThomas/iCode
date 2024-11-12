package com.algoexpert.dynamicprogramming.waterarea;

public class WaterArea {
    public static void main(String[] args) {
        int[] heights = new int[]{0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3};
        int[] leftheights = new int[heights.length];
        int[] rightheights = new int[heights.length];
        int maxleft = 0, maxright = 0, totalArea = 0;
        for (int i = 0; i < heights.length; i++) {
            leftheights[i] = maxleft;
            if (maxleft < heights[i]) {
                maxleft = heights[i];
            }
        }
        for (int j = heights.length - 1; j >= 0; j--) {
            rightheights[j] = maxright;
            if (maxright < heights[j]) {
                maxright = heights[j];
            }
        }

        for (int i = 0; i < heights.length; i++) {
            int areaPerUnit = Math.min(leftheights[i], rightheights[i]) - heights[i];
            if (areaPerUnit > 0) {
                totalArea += areaPerUnit;
            }

        }
        System.out.println(totalArea);

    }

}
