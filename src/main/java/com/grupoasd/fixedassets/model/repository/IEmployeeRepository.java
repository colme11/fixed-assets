package com.grupoasd.fixedassets.model.repository;

import com.grupoasd.fixedassets.model.entity.Employee;

import java.util.Optional;

public interface IEmployeeRepository {

    Optional<Employee> findByEmployee(int idEmployee);
}
