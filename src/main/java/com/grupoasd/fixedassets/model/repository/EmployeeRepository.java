package com.grupoasd.fixedassets.model.repository;

import com.grupoasd.fixedassets.model.crud.EmployeeCrudRepository;
import com.grupoasd.fixedassets.model.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * This class interacts with the Employee table of our database
 */
@Repository
public class EmployeeRepository implements IEmployeeRepository{

    @Autowired
    private EmployeeCrudRepository employeeCrudRepository;

    @Override
    public Optional<Employee> findByEmployee(int idEmployee) {
        return employeeCrudRepository.findById(idEmployee);
    }
}
