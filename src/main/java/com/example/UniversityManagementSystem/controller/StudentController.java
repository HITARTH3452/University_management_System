package com.example.UniversityManagementSystem.controller;

import com.example.UniversityManagementSystem.models.Student;
import com.example.UniversityManagementSystem.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "getStudent/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "getAll")
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("add-one-student")
    public Student addStudent1(@Valid @RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping(value = "addStudent")
    public String addStudents(@Valid @RequestBody Iterable<Student> studentsList) {
        return studentService.addStudents(studentsList);
    }

    @PutMapping(value = "updateStudent/{id}/{Department}")
    public String updateStudentDepartment(@PathVariable Integer id ,@PathVariable String Department) {
        return studentService.updateStudentDepartment(id ,Department);
    }

    @DeleteMapping(value = "deleteStudent/{Id}")
    public String deleteStudentById(@PathVariable Integer id) {
        return studentService.deleteStudentById(id);
    }
}