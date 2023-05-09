package io.awiya.api;

import io.awiya.model.Employee;
import io.awiya.portAppli.EmployeePortAppli;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EmployeeRessource {


    EmployeePortAppli employeePortAppli;

    public EmployeeRessource(EmployeePortAppli employeePortAppli) {
        this.employeePortAppli = employeePortAppli;
    }

    public List<Employee> getAllEmployees(){
        return employeePortAppli.getAllEmployees();
    }

    Employee getEmployeeById(Long id){
        return employeePortAppli.getEmployeeById(id);
    }

    Employee saveEmployee(Employee employee){
        return employeePortAppli.saveEmployee(employee);
    }

    void deleteEmployee(Long id){

    }


}
