package com.springdemo.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    // @Autowired
    // constructor injection with studentController using @Autowired
    // without @Autowired is already injected suing initiation constructor
    private StudentService service; // field injection with studentController using @Autowired

    public StudentController(StudentService service){
        this.service = service;
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudent();
    }

}
