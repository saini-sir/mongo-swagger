package com.test.mengoswagger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ComanyEmployee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
 @Id
    private String id;
     private String name;
     private  String address;

}
