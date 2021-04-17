package com.grupoasd.fixedassets.model.crud;

import com.grupoasd.fixedassets.model.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeCrudRepository extends CrudRepository<Employee, Integer> {
}
