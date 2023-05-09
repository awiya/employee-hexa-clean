package io.awiya.service;

import io.awiya.model.EmployeeDomain;

import java.util.List;

public interface EmployeeService {
     List<EmployeeDomain> getAllEmployees();
     EmployeeDomain getEmployeeById(Long id);
     EmployeeDomain saveEmployee(EmployeeDomain employeeDomain);
     void deleteEmployee(Long id);

}
