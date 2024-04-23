package com.example.studentmanagementsystem.services.impl;

import com.example.studentmanagementsystem.model.entities.Student;
import com.example.studentmanagementsystem.repositories.StudentRepository;
import com.example.studentmanagementsystem.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
