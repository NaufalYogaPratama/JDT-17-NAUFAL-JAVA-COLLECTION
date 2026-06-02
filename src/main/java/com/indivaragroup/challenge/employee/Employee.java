package com.indivaragroup.challenge.employee;

import com.indivaragroup.challenge.employee.data.SeedDataEmployee;
import com.indivaragroup.challenge.employee.dto.EmployeeDTO;
import com.indivaragroup.challenge.employee.service.EmployeeService;
import com.indivaragroup.challenge.employee.service.EmployeeServiceConventional;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        System.out.println("========== DATA AWAL (BELUM DIURUTKAN) ==========");
        List<EmployeeDTO> earlyData = SeedDataEmployee.seedingDataEmployee();
        showData(earlyData);

        System.out.println("\n========== TEST MODERN SERVICE ==========");
        List<EmployeeDTO> dataFromModernService = SeedDataEmployee.seedingDataEmployee();
        System.out.println("--- Sort By Name (Modern) ---");
        EmployeeService.sortByName(dataFromModernService);
        showData(dataFromModernService);

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
}
