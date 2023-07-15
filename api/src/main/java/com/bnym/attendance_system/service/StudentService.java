package com.bnym.attendance_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnym.attendance_system.models.Student;
import com.bnym.attendance_system.repositories.StudentRepository;

@Service
public class StudentService {
	
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.isPresent() ? student.get() : null;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Long deleteStudentById(Long id) {
        try {
            studentRepository.deleteById(id);
            return id;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // Get students by class id
    public List<Student> getStudentsByClassId(Long classId) {
        return studentRepository.findByClassId(classId);
    }
}
