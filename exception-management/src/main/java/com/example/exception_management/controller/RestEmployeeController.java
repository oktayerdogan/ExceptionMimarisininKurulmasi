package com.example.exception_management.controller;

import com.example.exception_management.dto.DtoEmployee;
import com.example.exception_management.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> finDtoEmployeeById(Long id);
}
