package com.bnym.attendance_system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bnym.attendance_system.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Get students by class id
    @Query(value = "SELECT * FROM students WHERE class_id = ?1", nativeQuery = true)
    List<Student> findByClassId(Long classId);

    @Query(value = "SELECT student_id FROM students WHERE class_id = ?1", nativeQuery = true)
    List<Long> findStudentIdByClassId(Long classId);
}

