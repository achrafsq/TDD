package com.kata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Builder.Default
    private String name="tst";
    @Builder.Default
    private int age=0;



    public List<Employee> getEmployeesAllowedOnSundays(List<Employee> employees) {
        List<Employee> allowedEmployees = employees.stream()
                .filter(employee -> employee.getAge() >= 18)
                .collect(Collectors.toList());
        return allowedEmployees;
    }

    public List<Employee> getEmployeeAllowed(List<Employee>  employees){
        List<Employee> allowedEm = employees.stream()
                .filter(employee -> employee.getAge() >= 18)
                .collect(Collectors.toList());
        return allowedEm;

    }
    public List<Employee> getEmployeesAllowedOnSundaysSorted(List<Employee> employees) {
        List<Employee> allowedEmployees = employees.stream()
                .filter(employee -> employee.getAge() >= 18)
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());

        return allowedEmployees;
    }

    public List<String> getEmployeesAllowedOnSundaysCapitalized(List<Employee> employees) {
        List<String> allowedEmployees = employees.stream()
                .filter(employee -> employee.getAge() >= 18)
                .sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
                .map(employee -> employee.getName().toUpperCase())
                .collect(Collectors.toList());

        return allowedEmployees;
    }

    public List<String> getEmployeesAllowedOnSundaysCapitalizedDesc(List<Employee> employees) {
        List<String> allowedEmployees = employees.stream()
                .filter(employee -> employee.getAge() >= 18)
                .sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
                .map(employee -> employee.getName().toUpperCase())
                .collect(Collectors.toList());

        return allowedEmployees;
    }

    public  int add( int a , int b ){
        return a+b;
    }

}



