package io.awiya.portAppli;

import io.awiya.model.Employee;
import io.awiya.service.EmployeeService;

import java.util.List;

public class EmployeePortAppliImpl implements EmployeePortAppli {

    EmployeeService employeeService;
    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
