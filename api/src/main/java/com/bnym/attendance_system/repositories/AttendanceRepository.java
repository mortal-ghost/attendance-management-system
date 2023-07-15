package com.bnym.attendance_system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnym.attendance_system.models.Attendance;
import com.bnym.attendance_system.models.AttendanceId;

public interface AttendanceRepository extends JpaRepository<Attendance, AttendanceId> {
    List<Attendance> findByStudentId(Long studentIds);
}
