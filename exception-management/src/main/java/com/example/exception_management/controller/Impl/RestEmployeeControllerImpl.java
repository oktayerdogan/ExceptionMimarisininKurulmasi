package com.example.exception_management.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception_management.controller.RestEmployeeController;
import com.example.exception_management.dto.DtoEmployee;
import com.example.exception_management.model.RootEntity;
import com.example.exception_management.service.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController{

    @Autowired
    private IEmployeeService employeeService;

    @Override
    @GetMapping("/list/{id}")
    public RootEntity<DtoEmployee> finDtoEmployeeById(@PathVariable(value = "id") Long id) { 

        return ok(employeeService.findEmployeeById(id));
    }
}