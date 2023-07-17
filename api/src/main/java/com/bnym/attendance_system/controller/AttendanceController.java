package com.bnym.attendance_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnym.attendance_system.models.Attendance;
import com.bnym.attendance_system.models.StudentWithAttendance;
import com.bnym.attendance_system.service.AttendanceService;

@RestController
@RequestMapping("/v1/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/{classId}")
    public List<StudentWithAttendance> getAttendanceByClassId(@PathVariable Long classId) {
        return attendanceService.getAttendanceByClassId(classId);
    }

    @PostMapping
    public Attendance markAttendance(Attendance attendance) {
        return attendanceService.markAttendance(attendance);
    }

    @PutMapping("/{studentId}")
    public Attendance updateAttendance(Attendance attendance) {
        return attendanceService.updateAttendance(attendance);
    }
}
