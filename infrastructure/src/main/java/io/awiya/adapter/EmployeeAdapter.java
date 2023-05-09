package io.awiya.adapter;

import io.awiya.entities.EmployeeEntity;
import io.awiya.mapper.EmployeeMapper;
import io.awiya.model.EmployeeDomain;
import io.awiya.portInfra.EmployeePortInfra;
import io.awiya.repository.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAdapter implements EmployeePortInfra {

    EmployeeRepository employeeRepository;
    EmployeeMapper employeeMapper;


    public EmployeeAdapter(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = new EmployeeMapper();
    }

    @Override
    public List<EmployeeDomain> getAllEmployees() {
         return employeeRepository.findAll().stream().map(employeeMapper::assemble).collect(Collectors.toList());
    }

    @Override
    public EmployeeDomain getEmployeeById(Long id) {
        return employeeMapper.assemble(employeeRepository.findById(id).get());
    }

    @Override
    public EmployeeDomain saveEmployee(EmployeeDomain employeeDomain) {
        EmployeeEntity employee = new EmployeeEntity();
        employeeMapper.mergeDtoIntoModel(employeeDomain,employee);
        //changed
        return employeeMapper.assemble(employeeRepository.save(employee));
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
