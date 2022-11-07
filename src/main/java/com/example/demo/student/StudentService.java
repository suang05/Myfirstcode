package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();


        /*return List.of(
                new Student(
                        1L,
                        "Suang",
                        LocalDate.of(1987, Month.DECEMBER, 5),
                        "uangphy@gmail.com",
                        21
                ),
                new Student(
                        2L,
                        "CHALERMCHAI",
                        LocalDate.of(1987, Month.DECEMBER, 5),
                        "josslyn@outlook.com",
                        34
                )
        );*/
    }
}
