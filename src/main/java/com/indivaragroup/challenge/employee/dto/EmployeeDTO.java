package com.indivaragroup.challenge.employee.dto;

public class EmployeeDTO {
    private String name;
    private String address;
    private char gender;
    private int salary;

    public EmployeeDTO(String name, String address, char gender, int salary) {
        this.name = name;
        this.address = address;
        this.gender = Character.toUpperCase(gender);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public char getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }
}
