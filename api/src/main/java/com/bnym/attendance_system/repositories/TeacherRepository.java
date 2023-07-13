package com.bnym.attendance_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bnym.attendance_system.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    
}
