package com.example.exception_management;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.exception_management.dto.DtoEmployee;
import com.example.exception_management.service.IEmployeeService;

@SpringBootTest(classes = {ExceptionManagementApplication.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	public void beforeEach(){
		System.out.println("Before each çalıştı");
	}

	@Test
	public void testFindEmployeeById(){
		DtoEmployee employee = employeeService.findEmployeeById(2L);
		if(employee!=null){
			System.out.println("isim :" + employee.getName());
		}
		assertEquals(2,employee.getId());
	}

	@AfterEach
	public void afterEach(){
		System.out.println("afterEach");
	}
}
