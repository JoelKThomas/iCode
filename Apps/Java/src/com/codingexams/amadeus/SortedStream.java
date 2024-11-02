package com.codingexams.amadeus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        int getAge() {
            return this.age;
        }
    }
    static class Base {
        void method() throws Exception {
            System.out.println("SuperClass");
        }
    }

    static class SubClass extends Base {
        void method() throws RuntimeException {
            System.out.println("SubClass");
        }
    }

    public static void main(String[] args) throws Exception {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("A", 28));
        persons.add(new Person("B", 29));
        persons.add(new Person("C", 12));
        persons.add(new Person("D", 22));

        persons= persons.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());

        for(Person person: persons){
             System.out.println(person.name +": " +person.age);
        }

        Base s = new SubClass();
        s.method();
    }



}
