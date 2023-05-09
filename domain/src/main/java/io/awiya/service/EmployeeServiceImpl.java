package io.awiya.service;

import io.awiya.model.EmployeeDomain;
import io.awiya.portInfra.EmployeePortInfra;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeePortInfra employeePortInfra;

    public EmployeeServiceImpl(EmployeePortInfra employeePortInfra) {
        this.employeePortInfra = employeePortInfra;
    }

    @Override
    public List<EmployeeDomain> getAllEmployees() {
        return employeePortInfra.getAllEmployees();
    }

    @Override
    public EmployeeDomain getEmployeeById(Long id) {
        return employeePortInfra.getEmployeeById(id);
    }

    @Override
    public EmployeeDomain saveEmployee(EmployeeDomain employeeDomain) {
        return employeePortInfra.saveEmployee(employeeDomain);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeePortInfra.deleteEmployee(id);
    }
}
