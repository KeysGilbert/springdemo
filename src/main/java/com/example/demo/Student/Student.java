package com.example.demo.Student;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class Student {
    private Long id;
    private LocalDate dob;
    private int age;
    private String email;
    private String name;

    public Student() {}

    public Student(Long id, LocalDate dob, int age, String email, String name) {
        this.id = id;
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.name = name;
    }

    public Student(LocalDate dob, int age, String email, String name) {
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    public LocalDate getDob() {
        return dob;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
   public String toString() {
        return "Student {" +
                "id=" + id +
                "name=" + name + '\'' +
                "email=" + email + '\'' +
                "age=" + age +
                "dob=" + dob + '}';

   }
}
