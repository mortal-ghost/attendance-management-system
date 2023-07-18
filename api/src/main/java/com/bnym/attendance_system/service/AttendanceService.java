package com.bnym.attendance_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnym.attendance_system.models.Attendance;
import com.bnym.attendance_system.models.StudentWithAttendance;
import com.bnym.attendance_system.repositories.AttendanceRepository;

@Service
public class AttendanceService {
    @Autowired
    private final AttendanceRepository attendanceRepository;

    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    public List<StudentWithAttendance> getAttendanceByClassId(Long classId) {
        return attendanceRepository.getAttendanceByClassId(classId);
    }

    public List<Attendance> getAttendanceByStudentId(Long studentId) {
        return attendanceRepository.findByStudentId(studentId);
    }

    public Attendance markAttendance(Attendance attendance) {
        
        System.out.println(attendance.getStudentId());
        System.out.println(attendance.getDate());
        System.out.println(attendance.getStatus());
        System.out.println(attendance.getRemarks());
        
        attendanceRepository.saveAttendance(attendance.getStudentId(), attendance.getDate(),
                attendance.getStatus(), attendance.getRemarks());

        return attendance;
    }

    public Attendance updateAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    // Long deleteAttendance(Attendance attendance) {
    // try {
    // attendanceRepository.delete(attendance);
    // return attendance.getStudentId();
    // } catch (Exception e) {
    // System.out.println(e.getMessage());
    // }
    // return null;
    // }
}
