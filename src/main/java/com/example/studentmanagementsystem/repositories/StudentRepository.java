package com.example.studentmanagementsystem.repositories;

import com.example.studentmanagementsystem.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
