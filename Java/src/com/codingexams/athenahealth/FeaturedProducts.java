package com.codingexams.athenahealth;

import java.util.*;
import java.util.stream.Collectors;

class FeaturedProducts {
    public static void main(String[] args) {

        List<String> list  = new ArrayList<>();

        list.add("redPants");
        list.add("blueShirt");
        list.add("yellowTie");
        list.add("yellowTie");
        list.add("yellowTie");
        list.add("yellowTie");
        list.add("yellowTie");
        list.add("redPants");
        list.add("orangeFrock");
        list.add("purplelace");
        list.add("redPants");
        list.add("redPants");
        list.add("redPants");

        String r = findMax(list);
        System.out.println(r);
    }

    public static String findMax(List<String> productList) {
        List<String> list = new ArrayList<String>();

        Map<String, Long> collect = productList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        int max = collect.values().stream().mapToInt(Math::toIntExact).filter(stringLongEntry -> stringLongEntry >= 0).max().orElse(0);

        collect.entrySet().forEach(stringLongEntry -> {
            if (stringLongEntry.getValue() == max) {
                list.add(stringLongEntry.getKey());
            }
        });

        return list.stream().sorted().collect(Collectors.toList()).get(list.size() - 1);

    }
}