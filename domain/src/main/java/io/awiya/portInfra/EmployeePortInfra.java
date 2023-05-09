package io.awiya.portInfra;

import io.awiya.model.Employee;

import java.util.List;

public interface EmployeePortInfra {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Long id);
}
