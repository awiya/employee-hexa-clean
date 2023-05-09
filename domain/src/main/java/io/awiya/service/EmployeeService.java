package io.awiya.service;

import io.awiya.model.Employee;

import java.util.List;

public interface EmployeeService {
     List<Employee> getAllEmployees();
     Employee getEmployeeById(Long id);
     Employee saveEmployee(Employee employee);
     void deleteEmployee(Long id);

}
