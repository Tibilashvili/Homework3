package com.example.mywebapp.controller;


import com.example.mywebapp.entity.StudentGroup;
import com.example.mywebapp.serviceimpl.StudentGroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("group")
public class StudentGroupController {

    @Autowired
    StudentGroupServiceImpl studentGroupServiceImpl = new StudentGroupServiceImpl();

    @GetMapping
    public ResponseEntity<Collection<StudentGroup>> getUsers() {

        return new ResponseEntity<>(studentGroupServiceImpl.readAll(), HttpStatus.OK);
    }
   // @GetMapping("/")
  // private List<StudentGroup> getStudentGroup()
   //{
     //  return booksService.getAllBooks();
  // }
}
