package com.test.mengoswagger.Service;

import com.test.mengoswagger.payload.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createData(EmployeeDto employeeDto);



   List<EmployeeDto> getAllData();
}
