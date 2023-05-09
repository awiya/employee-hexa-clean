package io.awiya.api;

import io.awiya.dto.EmployeeDto;
import io.awiya.mapper.EmployeeMapper;
import io.awiya.model.Employee;
import io.awiya.portAppli.EmployeePortAppli;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeeRessource {


    EmployeePortAppli employeePortAppli;
    EmployeeMapper mapper ;

    public EmployeeRessource(EmployeePortAppli employeePortAppli) {
        this.employeePortAppli = employeePortAppli;
        this.mapper = new EmployeeMapper();
    }


    @GetMapping
    public List<EmployeeDto> getAllEmployees(){
        return employeePortAppli.getAllEmployees().stream().map(mapper :: assemble).collect(Collectors.toList());

    }

    @GetMapping("/{id}")
    EmployeeDto getEmployeeById(@PathVariable Long id){
        return mapper.assemble(employeePortAppli.getEmployeeById(id));
    }

    @PostMapping
    EmployeeDto saveEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee = new Employee();
        mapper.mergeDtoIntoModel(employeeDto, employee);
        //changed
        Employee savedEmployee = employeePortAppli.saveEmployee(employee);
        return mapper.assemble(savedEmployee);
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Long id){
        employeePortAppli.deleteEmployee(id);
    }


}
