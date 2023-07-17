package com.bnym.attendance_system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bnym.attendance_system.models.Attendance;
import com.bnym.attendance_system.models.AttendanceId;
import com.bnym.attendance_system.models.StudentWithAttendance;


public interface AttendanceRepository extends JpaRepository<Attendance, AttendanceId> {
    List<Attendance> findByStudentId(Long studentIds);

    // Query to fetch student id, first name, last name, class id, date and attendance status 
    // by joining students and attendance table
    final String query = "SELECT s.student_id, s.first_name, s.last_name, s.class_id, s.roll_number, a.a_date, a.attendance_status " +
                            "FROM students s " +
                            "INNER JOIN attendance a " +
                            "ON s.student_id = a.student_id " +
                            "WHERE a.class_id = ?1";

    @Query(value= query, nativeQuery = true)
    List<StudentWithAttendance> getAttendanceByClassId(Long classId);
}
