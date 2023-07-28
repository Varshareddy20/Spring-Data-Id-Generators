package com.varsha.springprj.idgenerators.repose;

import org.springframework.data.repository.CrudRepository;

import com.varsha.springprj.idgenerators.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
