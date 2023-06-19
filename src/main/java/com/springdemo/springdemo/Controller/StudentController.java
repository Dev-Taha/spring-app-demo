package com.springdemo.springdemo.Controller;

import com.springdemo.springdemo.Models.Student;
import com.springdemo.springdemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    // @Autowired
    // constructor injection with studentController using @Autowired
    // without @Autowired is already injected suing initiation constructor
    private StudentService service; // field injection with studentController using @Autowired
    public StudentController(
            @Qualifier("DBStudentService") StudentService service){
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
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
