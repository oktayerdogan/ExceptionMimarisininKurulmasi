package com.example.exception_management.controller;

import com.example.exception_management.dto.DtoEmployee;

public interface RestEmployeeController {

    public DtoEmployee finDtoEmployeeById(Long id);
}
