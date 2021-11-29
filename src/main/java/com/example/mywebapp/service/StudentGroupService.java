package com.example.mywebapp.service;


import com.example.mywebapp.entity.Student;
import com.example.mywebapp.entity.StudentGroup;

import java.util.Collection;

public interface StudentGroupService {

    StudentGroup create(StudentGroup studentGroup);

    Collection<StudentGroup> readAll();

    StudentGroup readOne(Long id);

    StudentGroup update(Long id, StudentGroup studentGroup);

    void delete (Long id);

}
