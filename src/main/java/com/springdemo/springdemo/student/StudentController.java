package com.springdemo.springdemo.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);
    }
    @GetMapping("/{email}")
    public Optional<Student> findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }
    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudent();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.update(student);
    }
    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email){
        service.delete(email);
    }

}
