package com.example.mywebapp.service;

import com.example.mywebapp.entity.Student;
import com.example.mywebapp.entity.StudentGroup;

import java.util.Collection;

public interface StudentService {

    Student create(Student student);

    Collection<Student> readAll();

    Student readOne(long id);

    Student update(long id, Student student);

    void delete (long id);


}
