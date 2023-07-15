package com.bnym.attendance_system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bnym.attendance_system.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Get students by class id
    List<Student> findByClassId(Long classId);

    List<Long> findStudentIdByClassId(Long classId);
}

