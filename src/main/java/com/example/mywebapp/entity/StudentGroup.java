package com.example.mywebapp.entity;


import lombok.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

// @Entity
public class StudentGroup {

    private Long id;
    private String firstName;
    private String lastName;


}

/*    //  private Integer numberOfGroup;

  //  @OneToMany
    private static List<Student> students;

    static {
        students = new ArrayList<>();
    //    students.add(new Student(1,"Jeremy", "Dalton", "777-77", "Jeremy@gmail.com" ));
     //   students.add(new Student(2,"Michael", "Rensing", "555-55", "Rensing@gmail.com" ));
    } */

