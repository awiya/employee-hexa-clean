package io.awiya.portAppli;

import io.awiya.model.EmployeeDomain;
import io.awiya.service.EmployeeService;

import java.util.List;

public class EmployeePortAppliImpl implements EmployeePortAppli {

    EmployeeService employeeService;

    public EmployeePortAppliImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public List<EmployeeDomain> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @Override
    public EmployeeDomain getEmployeeById(Long id) {
        return employeeService.getEmployeeById(id);
    }

    @Override
    public EmployeeDomain saveEmployee(EmployeeDomain employeeDomain) {
        return employeeService.saveEmployee(employeeDomain);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeService.deleteEmployee(id);
    }
}
