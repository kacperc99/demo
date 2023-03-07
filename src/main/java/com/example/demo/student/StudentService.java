package com.example.demo.student;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public static List<Student> GetStudents() {
        return List.of(new Student(
                1L,
                "Kacper",
                LocalDate.of(1999, Month.SEPTEMBER, 21),
                23,
                "ogryz30@onet.pl"
        ));
    }
}
