package com.bigcompany;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderTest {
    private static final String TEST_FILE_PATH = "src/test/resources/test_employees.csv";

    @BeforeEach
    void setUp() throws IOException {
        // Create a sample CSV file for testing
        File file = new File(TEST_FILE_PATH);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("EmployeeID,Name,Salary,ManagerID\n");
            writer.write("123,Joe,Doe,60000,\n");
            writer.write("124,Martin,Chekov,45000,123\n");
            writer.write("125,Bob,Ronstad,47000,123\n");
            writer.write("300,Alice,Hasacat,50000,124\n");
            writer.write("305,Brett,Hardleaf,34000,300\n");
        }
    }

    @Test
    void testReadEmployeesFromFile() throws IOException {
        Map<String, Employee> employees = CSVReader.readEmployees(TEST_FILE_PATH);

        // Check total employees loaded
        assertEquals(5, employees.size(), "Total employees count mismatch!");

        // Check CEO
        Employee ceo = employees.get("1");
        assertNotNull(ceo, "CEO should exist!");
        assertEquals("Joe", ceo.getFirstName(), "CEO name mismatch!");
        assertEquals(2, ceo.getSubordinates().size(), "CEO should have 2 subordinates!");

        // Check manager Martin has 1 sub-ordinates
        Employee martin = employees.get("2");
        assertNotNull(martin, "martin should exist!");
        assertEquals(1, martin.getSubordinates().size(), "Martin should have 2 subordinates!");

        //check Brett has 0 sub-ordinates
        Employee brett = employees.get("4");
        assertNotNull(brett, "Brett Brown should exist!");
        assertEquals(0, brett.getSubordinates().size(), "Brett should have 0 subordinates!");
    }
}
