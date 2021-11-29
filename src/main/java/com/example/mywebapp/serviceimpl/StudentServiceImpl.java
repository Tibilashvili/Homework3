package com.example.mywebapp.serviceimpl;

import com.example.mywebapp.entity.Student;
import com.example.mywebapp.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    Map<Long, Student> studentMap;


    @Override
    public Collection<Student> readAll() {
        return studentMap.values();
    }

    @Override
    public Student create(Student student) {
        Student student1 = new Student();
        student1.setId(student.getId());
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setPhone(student.getPhone());
        student1.setEmail(student.getEmail());
      //  String userId = UUID.randomUUID().toString();

        if (studentMap == null) {
            studentMap = new HashMap<>();
        }
        studentMap.put(student.getId(), student1);
        return student1;
    }

    @Override
    public Student readOne(long id) {
        return studentMap.get(id);
    }

    @Override
    public Student update(long id, Student student) {
       Student studentFromDatabase = studentMap.get(id);
       studentFromDatabase.setFirstName(student.getFirstName());
       studentFromDatabase.setLastName(student.getLastName());
       studentFromDatabase.setPhone(student.getPhone());
       studentFromDatabase.setEmail(student.getEmail());
      // studentFromDatabase.setGroupId();
       return studentFromDatabase;
    }

    @Override
    public void delete(long id) {
       studentMap.remove(id);
    }
}
