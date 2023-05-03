package com.example.UniversityManagementSystem.repository;

import com.example.UniversityManagementSystem.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {

}
