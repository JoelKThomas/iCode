package com.codingexams.amadeus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {


    // Main driver method
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Joel", 54);
        hashMap.put("Kiran", 80);
        hashMap.put("Anoop", 82);

        Iterator iterator = hashMap.entrySet().iterator();
        System.out.println("Method 1");
        while (iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) iterator.next();
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
        }
        System.out.println("Method 2");
        hashMap.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("Method 3");
        for(Map.Entry entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }
}

