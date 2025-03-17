package com.bigcompany;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private double salary;
    private String managerId;
    private List<Employee> subordinates = new ArrayList<>();

    public Employee(String id, String firstName, String lastName,double salary, String managerId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.managerId = managerId;
    }

    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getSalary() { return salary; }
    public String getManagerId() { return managerId; }
    public List<Employee> getSubordinates() { return subordinates; }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }
}
