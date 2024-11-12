package com.algoexpert.hashmap.calender;

import java.util.TreeMap;

class MyCalendar {
    TreeMap<Integer, Integer> calendar;

    MyCalendar() {
        calendar = new TreeMap();
    }

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start),
                next = calendar.ceilingKey(start);
        if ((prev == null || calendar.get(prev) <= start) &&
                (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}

public class Calender {
    public static void main(String[] args) {
     MyCalendar obj = new MyCalendar();
     int[][] input = {{10, 20}, {15, 25}, {20, 30}};
        for (int i = 0; i < input.length; i++) {
                System.out.println( obj.book(input[i][0],input[i][1]));
            }
    }

}
