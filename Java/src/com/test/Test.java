package com.test;


import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String id;
    String name;
    String dept;

    Integer salary;
    Employee(String id, String name, String dept, Integer salary){
        this.id = id;
        this.name= name;
        this.dept = dept;
        this.salary = salary;
    }

    String getDept(){
        return this.dept;
    }
}

public class Test {


    public static void main(String[] args) {
        System.out.println("Test");
//        Map<String, List<String>> hashMap = new HashMap<String, List<String>>();
//        hashMap.put("1", Arrays.asList("a", "b", "c"));
//        hashMap.put("2", Arrays.asList("d", "b", "c"));
//        hashMap.put("3", Arrays.asList("a", "b", "c"));
//
//        for(Map.Entry k : hashMap.entrySet()){
//            System.out.println(k.getKey() + ":" + k.getValue());
//        }
      List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("1", "ABC","CS", 100));
        empList.add(new Employee("2", "DEF","EC", 200));
        empList.add(new Employee("3", "GHI","CS", 300));
        empList.add(new Employee("4", "XYZ","EC", 100));

        empList.stream().collect(Collectors.groupingBy(Employee::getDept));


    }
}


