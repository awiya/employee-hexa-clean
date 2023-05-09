package io.awiya.portAppli;

import io.awiya.model.Employee;

import java.util.List;

public interface EmployeePortAppli {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Long id);
}
