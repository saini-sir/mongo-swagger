package com.test.mengoswagger.Service;

import com.test.mengoswagger.Repository.EmployeeRepository;
import com.test.mengoswagger.entity.Employee;
import com.test.mengoswagger.payload.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    private final EmployeeRepository employeeRepository ;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createData(EmployeeDto employeeDto) {
        Employee emp = new Employee();
        emp.setId(employeeDto.getId());
        emp.setName(employeeDto.getName());
        emp.setAddress(employeeDto.getAddress());
        Employee saveEmp = employeeRepository.save(emp);

        EmployeeDto dto = new EmployeeDto();
        dto.setId(saveEmp.getId());
        dto.setName(saveEmp.getName());
        dto.setAddress(saveEmp.getAddress());
        return dto;
    }

    @Override
    public List<EmployeeDto> getAllData() {
        List<Employee> emp = employeeRepository.findAll();
        List<EmployeeDto> dto = emp.stream().map(p->mapToDto(p)).collect(Collectors.toList());
        return dto;
    }
    EmployeeDto mapToDto (Employee emp){
        EmployeeDto dto = new EmployeeDto();
        dto.setId(emp.getId());
        dto.setName(emp.getName());
        dto.setAddress(emp.getAddress());
        return dto;
    }
     Employee mapToEntity(EmployeeDto employeeDto){
        Employee emp = new Employee();
        emp.setId(employeeDto.getId());
        emp.setName(employeeDto.getName());
        emp.setAddress(employeeDto.getAddress());
        return emp;
     }
}
