package com.bigcompany;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAnalyzerTest {

    @Test
    void testSalaryAnalysis() {
        Map<String, Employee> employees = new HashMap<>();
        employees.put("1", new Employee("1", "CEO", "ceo", 50000, null));
        employees.put("2", new Employee("2", "Manager", "manager",10000, "1"));
        employees.put("3", new Employee("3", "Subordinate1","sub1" ,8000, "2"));
        employees.put("4", new Employee("4", "Subordinate2", "sub2",9000, "2"));

        EmployeeAnalyzer analyzer = new EmployeeAnalyzer(employees);
        analyzer.analyzeSalaries();
    }

    @Test
    void testReportingLineAnalysis() {
        Map<String, Employee> employees = new HashMap<>();
        employees.put("1", new Employee("1", "CEO", "ceo",50000, null));
        employees.put("2", new Employee("2", "Manager","manager", 15000, "1"));
        employees.put("3", new Employee("3", "Level 2","level2", 12000, "2"));
        employees.put("4", new Employee("4", "Level 3","level3", 10000, "3"));
        employees.put("5", new Employee("5", "Level 4", "level4",9000, "4"));
        employees.put("6", new Employee("6", "Too Deep", "level5",8000, "5"));

        EmployeeAnalyzer analyzer = new EmployeeAnalyzer(employees);
        analyzer.analyzeReportingLines();
    }
}
