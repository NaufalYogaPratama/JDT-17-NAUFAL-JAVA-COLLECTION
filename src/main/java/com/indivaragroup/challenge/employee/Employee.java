package com.indivaragroup.challenge.employee;

import com.indivaragroup.challenge.employee.data.SeedDataEmployee;
import com.indivaragroup.challenge.employee.dto.EmployeeDTO;
import com.indivaragroup.challenge.employee.service.EmployeeService;
import com.indivaragroup.challenge.employee.service.EmployeeServiceConventional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {
        System.out.println("========== DATA AWAL (BELUM DIURUTKAN) ==========");
        List<EmployeeDTO> earlyData = SeedDataEmployee.seedingDataEmployee();
        showData(earlyData);

        System.out.println("\n========== TEST MODERN SERVICE ==========");
        List<EmployeeDTO> dataFromModernService = SeedDataEmployee.seedingDataEmployee();
        System.out.println("\n========== MENGURUTKAN BERDASARKAN NAMA (MODERN) ==========");
        EmployeeService.sortByName(dataFromModernService);
        showData(dataFromModernService);

        System.out.println("\n========== MENGURUTKAN BERDASARKAN ALAMAT (MODERN) ==========");
        EmployeeService.sortByAddress(dataFromModernService);
        showData(dataFromModernService);

        System.out.println("\n========== REKAPITULASI KOTA (MODERN)==========");
        Map<String, Integer> countCityResult = EmployeeService.countCity(dataFromModernService);
        showCityData(countCityResult);

        System.out.println("\n========== MENGURUTKAN BERDASARKAN GAJI (MODERN) ==========");
        EmployeeService.sortBySalary(dataFromModernService);
        showData(dataFromModernService);

        System.out.println("\n========== REKAPITULASI KOTA (MODERN)==========");
        Map<Character, Integer> countGenderResult = EmployeeService.countGender(dataFromModernService);
        showGenderData(countGenderResult);



        System.out.println("\n========== TEST CONVENTIONAL SERVICE ==========");
        List<EmployeeDTO> dataFromConventionalService = SeedDataEmployee.seedingDataEmployee();
        System.out.println("--- Sort By Name (Conventional) ---");
        EmployeeServiceConventional.sortByNameConventional(dataFromConventionalService);
        showData(dataFromConventionalService);

        System.out.println("\n========== MENGURUTKAN BERDASARKAN ALAMAT ==========");
        EmployeeServiceConventional.sortByAddressConventional(dataFromConventionalService);
        showData(dataFromConventionalService);

        System.out.println("\n========== MENGURUTKAN BERDASARKAN GAJI ==========");
        EmployeeServiceConventional.sortBySalaryConventional(dataFromConventionalService);
        showData(dataFromConventionalService);

        System.out.println("\n========== REKAPITULASI KOTA ==========");
        EmployeeServiceConventional.countCity(dataFromConventionalService);

        System.out.println("\n========== REKAPITULASI GENDER ==========");
        EmployeeServiceConventional.countGender(dataFromConventionalService);
    }

    public static void showData(List<EmployeeDTO> listEmployee) {
        for (EmployeeDTO employees : listEmployee) {
            System.out.printf("Nama: %-10s | Alamat: %-10s | Gender: %c | Gaji: Rp %,d %n",
                    employees.getName(),
                    employees.getAddress(),
                    employees.getGender(),
                    employees.getSalary()
            );
        }
    }

    public static void showCityData(Map<String, Integer> cityMap) {
        cityMap.forEach((city, amount) -> System.out.println("Kota: " + city + " : " + amount + " pegawai"));
    }

    public static void showGenderData(Map<Character, Integer> genderMap) {
        System.out.println("Laki-laki: " + genderMap.getOrDefault('L', 0) + " pegawai");
        System.out.println("Perempuan: " + genderMap.getOrDefault('P', 0) + " pegawai");
    }
}
