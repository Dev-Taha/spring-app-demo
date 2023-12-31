package com.springdemo.springdemo.Service;

import com.springdemo.springdemo.Models.Student;
import com.springdemo.springdemo.Repository.StudentRepository;
import com.springdemo.springdemo.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // TODO: OR USE @Primary rather than from @Qualifier in Controller
public class DBStudentService implements StudentService {
    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }
    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public void delete(String email) {
        repository.deleteByEmail(email);
    }
}
