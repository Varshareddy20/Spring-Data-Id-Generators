package com.varsha.springprj.idgenerators;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.varsha.springprj.idgenerators.entities.Employee;
import com.varsha.springprj.idgenerators.repose.EmployeeRepository;

@SpringBootTest
class IdgeneratorsApplicationTests {

	@Autowired
	EmployeeRepository er;
	
	@Test
	public void testCreateEmployee() {
		
		Employee employee = new Employee();
		employee.setName("Jay");
		
		er.save(employee);
	}

}
