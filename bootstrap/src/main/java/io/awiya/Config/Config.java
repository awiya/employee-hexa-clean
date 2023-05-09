package io.awiya.Config;

import io.awiya.adapter.EmployeeAdapter;
import io.awiya.portAppli.EmployeePortAppli;
import io.awiya.portAppli.EmployeePortAppliImpl;
import io.awiya.portInfra.EmployeePortInfra;
import io.awiya.repository.EmployeeRepository;
import io.awiya.service.EmployeeService;
import io.awiya.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Autowired
    EmployeeRepository employeeRepository;


    @Bean
    EmployeePortAppli employeeAppliPort(EmployeeService employeeService){
        return new EmployeePortAppliImpl(employeeService);
    }

    @Bean
    EmployeePortInfra employeePortInfra(){
        return new EmployeeAdapter(this.employeeRepository);
    }

    @Bean
    EmployeeService employeeService(EmployeePortInfra employeePortInfra){
        return new EmployeeServiceImpl(employeePortInfra);
    }
}
