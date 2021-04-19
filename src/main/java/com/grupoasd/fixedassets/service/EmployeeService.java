package com.grupoasd.fixedassets.service;

import com.grupoasd.fixedassets.model.repository.IEmployeeRepository;
import com.grupoasd.fixedassets.service.dto.EmployeeDTO;
import com.grupoasd.fixedassets.service.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Autowired
    EmployeeMapper mapper;

    public Optional<EmployeeDTO> findByEmployee(int idEmployee){
        return employeeRepository.findByEmployee(idEmployee).map(employee -> mapper.toEmployeeDto(employee));
    }
}
