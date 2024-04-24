package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.model.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();


    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);

}
