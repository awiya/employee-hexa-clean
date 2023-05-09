package io.awiya.service;

import io.awiya.model.Employee;
import io.awiya.portInfra.EmployeePortInfra;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeePortInfra employeePortInfra;

    @Override
    public List<Employee> getAllEmployees() {
        return employeePortInfra.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeePortInfra.getEmployeeById(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeePortInfra.saveEmployee(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeePortInfra.deleteEmployee(id);
    }
}
