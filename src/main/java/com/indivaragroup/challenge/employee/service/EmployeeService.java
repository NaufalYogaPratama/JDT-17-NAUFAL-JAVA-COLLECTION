package com.indivaragroup.challenge.employee.service;

import com.indivaragroup.challenge.employee.dto.EmployeeDTO;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public static void  sortByName(List<EmployeeDTO> listEmployee) {
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getName));
    }

    public static void sortByAddress(List<EmployeeDTO> listEmployee) {
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getAddress));
    }

    public static Map<String, Integer> countCity(List<EmployeeDTO> listEmployee) {
        Map<String, Integer> cityMap = new HashMap<>();
        listEmployee.forEach(employees -> cityMap.merge(employees.getAddress(), 1, Integer::sum));
        return cityMap;
    }

    public static void sortBySalary(List<EmployeeDTO> listEmployee) {
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getSalary));
    }

    public static Map<Character, Integer> countGender(List<EmployeeDTO> listEmployee) {
        Map<Character, Integer> genderMap = new HashMap<>();
        listEmployee.forEach(employees -> genderMap.merge(employees.getGender(), 1, Integer::sum));
        return genderMap;
    }
}
