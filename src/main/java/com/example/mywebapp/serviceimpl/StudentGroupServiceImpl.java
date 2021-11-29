package com.example.mywebapp.serviceimpl;

import com.example.mywebapp.entity.Student;
import com.example.mywebapp.entity.StudentGroup;
import com.example.mywebapp.service.StudentGroupService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

 @Service
public class StudentGroupServiceImpl implements StudentGroupService {

    Map<Integer, StudentGroup> studentGroupMap;

    @Override
    public Collection<StudentGroup> readAll() {
        return studentGroupMap.values();
    }

    @Override
    public StudentGroup create(StudentGroup studentGroup) {
        return null;
    }

    @Override
    public StudentGroup readOne(Long id) {
        return null;
    }

    @Override
    public StudentGroup update(Long id, StudentGroup studentGroup) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
