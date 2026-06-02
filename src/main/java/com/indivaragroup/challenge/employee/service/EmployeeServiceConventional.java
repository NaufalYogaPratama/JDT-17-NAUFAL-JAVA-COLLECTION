package com.indivaragroup.challenge.employee.service;

import com.indivaragroup.challenge.employee.dto.EmployeeDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceConventional {
    public static void sortByNameConventional(List<EmployeeDTO> listEmployeeConventional) {
        int n = listEmployeeConventional.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listEmployeeConventional.get(j).getName().compareToIgnoreCase(listEmployeeConventional.get(j+1).getName()) > 0) {
                    EmployeeDTO temp = listEmployeeConventional.get(j);

                    listEmployeeConventional.set(j, listEmployeeConventional.get(j+1));
                    listEmployeeConventional.set(j + 1, temp);
                }
            }
        }
    }

    public static void sortByAddressConventional(List<EmployeeDTO> listEmployeeConventional) {
        int n = listEmployeeConventional.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listEmployeeConventional.get(j).getAddress().compareToIgnoreCase(listEmployeeConventional.get(j+1).getAddress()) > 0) {
                    EmployeeDTO temp = listEmployeeConventional.get(j);

                    listEmployeeConventional.set(j, listEmployeeConventional.get(j+1));
                    listEmployeeConventional.set(j + 1, temp);
                }
            }
        }
    }

    public static void countCity(List<EmployeeDTO> listEpmloyeeConventional) {
        java.util.Map<String, Integer> cityMap = new java.util.HashMap<>();

        for (EmployeeDTO pegawai : listEpmloyeeConventional) {
            String kota = pegawai.getAddress();
            cityMap.put(kota, cityMap.getOrDefault(kota, 0) + 1);
        }

        System.out.println("--- Rekap Jumlah Pegawai per Kota ---");
        for (java.util.Map.Entry<String, Integer> entry : cityMap.entrySet()) {
            System.out.println("Kota " + entry.getKey() + " : " + entry.getValue() + " pegawai");
        }
    }

    public static void sortBySalaryConventional(List<EmployeeDTO> listEmployeeConventional) {
        int n = listEmployeeConventional.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listEmployeeConventional.get(j).getSalary() > listEmployeeConventional.get(j+1).getSalary()) {
                    EmployeeDTO temp = listEmployeeConventional.get(j);

                    listEmployeeConventional.set(j, listEmployeeConventional.get(j+1));
                    listEmployeeConventional.set(j + 1, temp);
                }
            }
        }
    }

    public static void countGender(List<EmployeeDTO> listEmployeeConventional) {
        int countLakiLaki = 0;
        int countPerempuan = 0;

        for (EmployeeDTO pegawai : listEmployeeConventional) {
            if (pegawai.getGender() == 'L') {
                countLakiLaki++;
            } else if (pegawai.getGender() == 'P') {
                countPerempuan++;
            }
        }

        System.out.println("--- Rekap Jumlah Pegawai per Gender ---");
        System.out.println("Laki-laki (L) : " + countLakiLaki + " pegawai");
        System.out.println("Perempuan (P) : " + countPerempuan + " pegawai");
    }
}
