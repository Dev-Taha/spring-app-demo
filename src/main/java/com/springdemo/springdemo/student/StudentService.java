package com.springdemo.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {

    public List<Student> findAllStudent(){
        return List.of(
                new Student(
                        "Taha",
                        "Shorafa",
                        LocalDate.now(),
                        "taha@boha.com",
                        21
                ),
                new Student(
                        "Ahmed",
                        "Ismail",
                        LocalDate.now(),
                        "ahmed@boha.com",
                        25
                )
        );
    }
}
