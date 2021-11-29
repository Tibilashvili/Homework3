package com.example.mywebapp.controller;


import com.example.mywebapp.entity.Student;
import com.example.mywebapp.entity.StudentGroup;
import com.example.mywebapp.serviceimpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService = new StudentServiceImpl();

    @GetMapping
    public ResponseEntity<Collection<Student>> getUsers() {

        return new ResponseEntity<>(studentService.readAll(), HttpStatus.OK);
    }

}
