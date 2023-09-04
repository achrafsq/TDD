package com.kata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmloyeeTest {

    @Test
    void testGetEmployeesAllowedOnSundays() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ach", 17));
        employees.add(new Employee("Med", 18));
        employees.add(new Employee("Mar", 15));
        employees.add(new Employee("TEST", 51));

        Employee emp = new Employee();
        List<Employee> allowedEmployees = emp.getEmployeesAllowedOnSundays(employees);

        assertEquals(2, allowedEmployees.size());
        assertEquals("Med", allowedEmployees.get(0).getName());
        assertEquals("TEST", allowedEmployees.get(1).getName());
    }



    @Test
    void testGetEmployeesAllowedOnSundaysSortedByName() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ach", 17));
        employees.add(new Employee("Med", 18));
        employees.add(new Employee("Mar", 15));
        employees.add(new Employee("TEST", 51));

        Employee emp = new Employee();
        List<Employee> allowedEmployees = emp.getEmployeesAllowedOnSundaysSorted(employees);

        assertEquals(2, allowedEmployees.size());
        assertEquals("Med", allowedEmployees.get(0).getName());
        assertEquals("TEST", allowedEmployees.get(1).getName());
    }

    @Test
    void test(){
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee('ddd',11));
        employees.add(new Employee("dd",66));
        Employee emp = new Employee();
        List<Employee> allwed = emp.getEmployeeAllowed(employees)
    }

    @Test
    void testGetEmployeesAllowedOnSundaysSortedByNameCapitalized() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ach", 17));
        employees.add(new Employee("Med", 18));
        employees.add(new Employee("Mar", 15));
        employees.add(new Employee("test", 51));

        Employee emp = new Employee();


        List<String> allowedEmployees = emp.getEmployeesAllowedOnSundaysCapitalized(employees);

        assertEquals(2, allowedEmployees.size());
        assertEquals("TEST", allowedEmployees.get(0)); // Capitalized
        assertEquals("MED", allowedEmployees.get(1));
    }

    @Test
    void testGetEmployeesAllowedOnSundaysSortedByNameCapitalizedDesc() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ach", 17));
        employees.add(new Employee("Med", 18));
        employees.add(new Employee("Mar", 15));
        employees.add(new Employee("test", 51));

        Employee emp = new Employee();


        List<String> allowedEmployees = emp.getEmployeesAllowedOnSundaysCapitalizedDesc(employees);

        assertEquals(2, allowedEmployees.size());
        assertEquals("TEST", allowedEmployees.get(0));
        assertEquals("MED", allowedEmployees.get(1));
    }


    @Test
    public void testAdd(){
//        given
        int result = new Employee().add(2,3);
        assertEquals(5,result);

    }

}
