package com.algoexpert.array;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Employee {
    String id;
    String name;
    String dept;

    Integer salary;

    Employee(String id, String name, String dept, Integer salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    String getDept() {
        return this.dept;
    }

    String getName() {
        return this.name;
    }

    Integer getSalary() {
        return this.salary;
    }

}
public class StreamComparator {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("1", "ABC","CS", 100));
        empList.add(new Employee("2", "DEF","EC", 200));
        empList.add(new Employee("3", "GHI","EC", 300));
        empList.add(new Employee("4", "XYZ","EC", 100));

        Comparator<Employee> c = Comparator.comparing(Employee::getName);
        empList.stream().sorted(c.reversed()).forEach(emp -> System.out.println(emp.getName()));

    }
}

