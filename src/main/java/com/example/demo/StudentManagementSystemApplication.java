package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    public StudentManagementSystemApplication(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student(1L, "Sachinda", "Mass", "sachinda46@gmail.com");
        Student student2 = new Student(2L, "Mass", "Sachinda", "mass46@gmail.com");
        Student student3 = new Student(3L, "Massss", "Sachindaa", "massaa46@gmail.com");
        studentRepo.save(student1);
        studentRepo.save(student2);
        studentRepo.save(student3);
    }
}
