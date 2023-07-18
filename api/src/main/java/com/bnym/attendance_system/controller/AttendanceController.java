package com.bnym.attendance_system.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnym.attendance_system.dto.AttendanceDTO;
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
    public Attendance markAttendance(@RequestBody Attendance attendance) {
        return attendanceService.markAttendance(attendance);
    }

    @PutMapping("/{studentId}")
    public Attendance updateAttendance(@RequestBody AttendanceDTO attendanceDto) {
        String date = attendanceDto.getDate();

        // Break the date into year, month and day
        String[] dateParts = date.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // Create a new date string in the format yyyy-mm-dd
        LocalDate dateObj = LocalDate.of(year, month, day);

        Attendance attendance = new Attendance(attendanceDto.getStudentId(), dateObj, attendanceDto.getStatus(),
                attendanceDto.getRemarks());
        
        return attendanceService.updateAttendance(attendance);
    }
}
