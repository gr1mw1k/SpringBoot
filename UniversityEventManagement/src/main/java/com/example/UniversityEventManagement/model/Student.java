package com.example.UniversityEventManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;

}
