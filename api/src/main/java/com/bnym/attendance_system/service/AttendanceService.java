package com.bnym.attendance_system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bnym.attendance_system.models.Attendance;
import com.bnym.attendance_system.repositories.AttendanceRepository;
import com.bnym.attendance_system.repositories.StudentRepository;

public class AttendanceService {
    private final AttendanceRepository attendanceRepository;
    private final StudentRepository studentRepository;

    @Autowired
    public AttendanceService(AttendanceRepository attendanceRepository, StudentRepository studentRepository) {
        this.attendanceRepository = attendanceRepository;
        this.studentRepository = studentRepository;
    }

    List<Attendance> getAttendanceByClassId(Long classId) {
        List<Long> studentIds = studentRepository.findStudentIdByClassId(classId);
        
        List<Attendance> attendanceList = new ArrayList<Attendance>();
        for (Long studentId : studentIds) {
            attendanceList.addAll(attendanceRepository.findByStudentId(studentId));
        }

        return attendanceList;
    }

    List<Attendance> getAttendanceByStudentId(Long studentId) {
        return attendanceRepository.findByStudentId(studentId);
    }

    Attendance markAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    Attendance updateAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    Long deleteAttendance(Attendance attendance) {
        try {
            attendanceRepository.delete(attendance);
            return attendance.getStudentId();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
