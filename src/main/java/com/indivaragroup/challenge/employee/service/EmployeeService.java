package com.indivaragroup.challenge.employee.service;

import com.indivaragroup.challenge.employee.dto.EmployeeDTO;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    public static void  sortByName(List<EmployeeDTO> listEmployee) {
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getName));
    }

    public static void sortByAddress(List<EmployeeDTO> listEmployee) {
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getAddress));
    }

    public static void sortBySalary(List<EmployeeDTO> listEmployee) {
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getSalary));
    }
}
