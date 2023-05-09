package io.awiya.portInfra;

import io.awiya.model.EmployeeDomain;

import java.util.List;

public interface EmployeePortInfra {
    List<EmployeeDomain> getAllEmployees();

    EmployeeDomain getEmployeeById(Long id);

    EmployeeDomain saveEmployee(EmployeeDomain employeeDomain);

    void deleteEmployee(Long id);
}
