package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private LocalDate dob;
    private Integer age;
    private String Email;

    public Student(Long id, String name, LocalDate dob, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        Email = email;
    }

    public Student() {
    }

    public Student(String name, LocalDate dob, Integer age, String email) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        Email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", Email='" + Email + '\'' +
                '}';
    }
}
