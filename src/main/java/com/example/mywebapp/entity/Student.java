package com.example.mywebapp.entity;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

// @Entity
public class Student {

    private long id;

    private String firstName;

    private String lastName;

  //  private String speciality;

    private String phone;

    private String email;

    private long groupId;
    // https://stackoverflow.com/questions/8165908/return-a-list-of-objects-when-using-jax-rs


   // private StudentGroup studentGroup;
}
