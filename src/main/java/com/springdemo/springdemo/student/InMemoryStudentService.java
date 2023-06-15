package com.springdemo.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InMemoryStudentService implements StudentService{
    private final InMemoryStudentDAO DataAccessObject ;

    public InMemoryStudentService(InMemoryStudentDAO dataAccessObject) {
        DataAccessObject = dataAccessObject;
    }

    @Override
    public Student save(Student student) {
        return DataAccessObject.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return DataAccessObject.findAllStudent();
    }

    @Override
    public Optional<Student> findByEmail(String email) {
        return DataAccessObject.findByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return DataAccessObject.update(student);
    }

    @Override
    public void delete(String email) {
        DataAccessObject.delete(email);
    }
}
