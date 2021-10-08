package com.codingexams.mercedesbenz.q2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFilter {
    static class Employee {
        String name;
        int age;

        Employee(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList();
        Employee e1 = new Employee("Joel", 12);
        Employee e2 = new Employee("Alvin", 13);
        emp.add(e1);
        emp.add(e2);
        //emp.stream().filter(e -> e.age > 12).map(Employee::getName).collect(Collectors.toList());
        emp.stream().filter(e -> e.age > 12).forEach(employee -> System.out.println(employee.getName()));
    }
}
