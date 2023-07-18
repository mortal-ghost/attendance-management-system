package com.bnym.attendance_system.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bnym.attendance_system.models.Attendance;
import com.bnym.attendance_system.models.AttendanceId;
import com.bnym.attendance_system.models.StudentWithAttendance;

import jakarta.transaction.Transactional;


public interface AttendanceRepository extends JpaRepository<Attendance, AttendanceId> {
    List<Attendance> findByStudentId(Long studentIds);

    // Query to fetch student id, first name, last name, class id, date and attendance status 
    // by joining students and attendance table
    final String query = "SELECT s.student_id as studentId, s.first_name as firstName, s.last_name as lastName, s.class_id as classId, s.roll_number as rollNumber, a.a_date as date, a.status " +
                            "FROM students s " +
                            "INNER JOIN attendance a " +
                            "ON s.student_id = a.student_id " +
                            "WHERE (s.class_id = ?1)";

    @Query(value= query, nativeQuery = true)
    List<StudentWithAttendance> getAttendanceByClassId(Long classId);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO attendance (student_id, a_date, status, remarks) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    void saveAttendance(Long studentId, LocalDate date, String status, String remarks);
}
