package com.springdemo.springdemo.ServiceInMemory;

import com.springdemo.springdemo.Models.Student;
import com.springdemo.springdemo.Service.StudentService;
import com.springdemo.springdemo.Repository.InMemoryStudentDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {
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
    public Student findByEmail(String email) {
//        return DataAccessObject.findByEmail(email);
        Student s = new Student();
        // refactor later
        return s;
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
