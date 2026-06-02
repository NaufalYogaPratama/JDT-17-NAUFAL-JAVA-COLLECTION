package com.indivaragroup.challenge.employee.data;

import com.indivaragroup.challenge.employee.dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;

public class SeedDataEmployee {
    public static List<EmployeeDTO> seedingDataEmployee() {
        List<EmployeeDTO> listEmployee = new ArrayList<>();
        listEmployee.add(new EmployeeDTO("Budi", "Jakarta", 'L', 5000000));
        listEmployee.add(new EmployeeDTO("Andi", "Bandung", 'l', 4500000));
        listEmployee.add(new EmployeeDTO("Citra", "Surabaya", 'P', 7000000));
        listEmployee.add(new EmployeeDTO("Galih", "Jakarta", 'L', 6000000));
        listEmployee.add(new EmployeeDTO("Galuh", "Bandung", 'l', 6500000));
        listEmployee.add(new EmployeeDTO("Siti", "Surabaya", 'P', 10000000));
        listEmployee.add(new EmployeeDTO("Dewi", "Semarang", 'P', 8500000));
        listEmployee.add(new EmployeeDTO("Eko", "Yogyakarta", 'L', 4000000));

        return listEmployee;
    }
}
