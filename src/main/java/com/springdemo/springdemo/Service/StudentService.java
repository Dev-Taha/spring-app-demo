package com.springdemo.springdemo.Service;

import com.springdemo.springdemo.Models.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);
    List<Student> findAllStudent();
    Student findByEmail(String email);
    Student update(Student student);
    void delete (String email);
}
