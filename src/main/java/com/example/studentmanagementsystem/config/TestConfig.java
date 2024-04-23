package com.example.studentmanagementsystem.config;

import com.example.studentmanagementsystem.model.entities.Student;
import com.example.studentmanagementsystem.repositories.StudentRepository;
import com.example.studentmanagementsystem.services.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        Student s1 = new Student("Luiz", "Silva", "luizotavio@gmail.com");
        studentRepository.save(s1);

        Student s2 = new Student("Maria", "Santos", "maria.santos@example.com");
        studentRepository.save(s2);

        Student s3 = new Student("João", "Souza", "joao.souza@example.com");
        studentRepository.save(s3);

        Student s4 = new Student("Ana", "Ferreira", "ana.ferreira@example.com");
        studentRepository.save(s4);

        Student s5 = new Student("Pedro", "Oliveira", "pedro.oliveira@example.com");
        studentRepository.save(s5);


    }
}
