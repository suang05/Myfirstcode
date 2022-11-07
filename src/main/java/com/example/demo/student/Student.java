package com.example.demo.student;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter
public class Student {
    @Id
    /*@SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )*/
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate Dob;
    private String email;
    private Integer age;

    public Student() {
    }

    public Student(Long id, String name, LocalDate Dob, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.Dob = Dob;
        this.email = email;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", thai=" + Dob +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

