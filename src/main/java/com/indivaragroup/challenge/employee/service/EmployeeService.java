package com.indivaragroup.challenge.employee.service;

import com.indivaragroup.challenge.employee.dto.EmployeeDTO;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public static void  sortByName(List<EmployeeDTO> listEmployee) {
        // pake built-in function sort buat ngurutin listEmployee nya terus isinya dicompare deh pake Comparator, habis itu dapet namanya dari getName di DTO
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getName));
    }

    public static void sortByAddress(List<EmployeeDTO> listEmployee) {
        // sama kek yang atas cuman ini pake getAddress karena buat nyortir alamat
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getAddress));
    }

    public static Map<String, Integer> countCity(List<EmployeeDTO> listEmployee) {
        // pake hash map biar cepet gua gabutuh data yang ditampilin urut kan cuman ngitung jumlah doang
        // string buat nyimpen nama kotanya sedangkan integer buat ngitung orangnya ada berapa yang address tuh di kota itu
        Map<String, Integer> cityMap = new HashMap<>();
        listEmployee.forEach(employees -> cityMap.merge(employees.getAddress(), 1, Integer::sum));
        return cityMap;
    }

    public static void sortBySalary(List<EmployeeDTO> listEmployee) {
        // sama kek method sort-sort diatas cuman bedanya ambil getSalary buat bisa nyortir gaji nya si pegawai
        listEmployee.sort(Comparator.comparing(EmployeeDTO::getSalary));
    }

    public static Map<Character, Integer> countGender(List<EmployeeDTO> listEmployee) {
        // hashmap biar cepet
        // Character buat jenis kelaminnya, Integer buat ngitung orangnya
        Map<Character, Integer> genderMap = new HashMap<>();
        listEmployee.forEach(employees -> genderMap.merge(employees.getGender(), 1, Integer::sum));
        return genderMap;
    }
}
