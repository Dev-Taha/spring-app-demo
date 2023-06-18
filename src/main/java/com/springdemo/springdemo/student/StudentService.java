package com.springdemo.springdemo.student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student save(Student student);
    List<Student> findAllStudent();
    Student findByEmail(String email);
    Student update(Student student);
    void delete (String email);
}
