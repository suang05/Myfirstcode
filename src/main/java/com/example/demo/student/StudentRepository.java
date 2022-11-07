package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Autowired
    @Query(
            value = "SELECT * FROM public.student u WHERE u.name like %?1",
            nativeQuery = true)
    List<Student> findByName(String name);
}
