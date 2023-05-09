package io.awiya.portAppli;

import io.awiya.model.EmployeeDomain;

import java.util.List;

public interface EmployeePortAppli {

    List<EmployeeDomain> getAllEmployees();

    EmployeeDomain getEmployeeById(Long id);

    EmployeeDomain saveEmployee(EmployeeDomain employeeDomain);

    void deleteEmployee(Long id);
}
