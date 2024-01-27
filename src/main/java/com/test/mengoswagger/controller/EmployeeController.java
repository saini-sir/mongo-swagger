package com.test.mengoswagger.controller;

import com.test.mengoswagger.Service.EmployeeService;
import com.test.mengoswagger.payload.EmployeeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private  final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeDto> createData(@RequestBody EmployeeDto employeeDto ){
       EmployeeDto dto =  employeeService.createData(employeeDto);
       return  new ResponseEntity<>(dto , HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<List<EmployeeDto>> getAllData(){
        List<EmployeeDto> dto = employeeService.getAllData();
        return  new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
