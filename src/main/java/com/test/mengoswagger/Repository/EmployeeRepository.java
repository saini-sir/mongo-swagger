package com.test.mengoswagger.Repository;

import com.test.mengoswagger.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
