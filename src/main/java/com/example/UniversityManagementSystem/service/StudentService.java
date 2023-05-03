package com.example.UniversityManagementSystem.service;

import com.example.UniversityManagementSystem.models.Department;
import com.example.UniversityManagementSystem.models.Event;
import com.example.UniversityManagementSystem.models.Student;
import com.example.UniversityManagementSystem.repository.IEventRepo;
import com.example.UniversityManagementSystem.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private IStudentRepo studentRepo;

    public Iterable<Student> getAllStudents() {
        Iterable<Student> allStudents = studentRepo.findAll();
        return allStudents;
    }

    public Student getStudentById(Integer id) {
        Student studentsById = studentRepo.findById(id).get();
        return studentsById;
    }

    public String addStudents(Iterable<Student> studentsList) {
        studentRepo.saveAll(studentsList);
        return "added";
    }

    public String updateStudentDepartment(Integer id ,String department) {
        Student student = studentRepo.findById(id).get();
        student.setDepartment(Department.valueOf(department));
        return "updated";
    }
    public String deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
        return "deleted";
    }


    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }
}
