package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
/**/
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student suang = new Student(
                    2L,
                    "Suang",
                    LocalDate.of(1987, Month.DECEMBER, 5),
                    "suangphy@gmail.com",
                    34
            );

            Student josslyn = new Student(
                    3L,
                    "josslyn",
                    LocalDate.of(1987, Month.DECEMBER, 5),
                    "josslyn@outlook.com",
                    26
            );

            repository.saveAll(
                    List.of(suang, josslyn)
            );
        };
    }
}
