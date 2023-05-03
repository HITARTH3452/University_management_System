package com.example.UniversityManagementSystem.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer StudentId;
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String firstName;
    private String lastName;
//    @Pattern(regexp = "^[1-9][0-9]$",message = "age is not valid")
    private Integer age;
    @Enumerated
    private Department department;
}
