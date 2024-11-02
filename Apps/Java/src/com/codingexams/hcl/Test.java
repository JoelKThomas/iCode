package com.codingexams.hcl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list1 = list.stream().map(i -> i + 1).collect(Collectors.toList());

        list1.forEach(System.out::println);
    }

}