package com.bnym.attendance_system.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnym.attendance_system.models.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @GetMapping("/")
    public List<Student> getAllStudents() {
        return List.of(new Student());
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable(value = "id") Long studentId) {
        return new Student();
    }

    @PostMapping("/")
    public Student createStudent(@RequestBody Student student) {
        return new Student();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable(value = "id") Long studentId, @RequestBody Student studentDetails) {
        return new Student();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") Long studentId) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/class/{id}")
    public List<Student> getStudentsByClassId(@PathVariable(value = "id") Long classId) {
        return List.of(new Student());
    }
}

