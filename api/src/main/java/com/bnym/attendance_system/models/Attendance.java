package com.bnym.attendance_system.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name= "attendance")
@IdClass(AttendanceId.class)
public class Attendance {
    // { studentId, date } is the primary key

    @Column(name = "student_id", length = 10, nullable = false)
    @Id
    private Long studentId;
    @Column(name = "date", length = 10, nullable = false)
    @Id
    private Date date; 
    @Column(name = "attendance", length = 1, nullable = false)
    private char attendance;
    /**
     * @return the studentId
     */
    public Long getStudentId() {
        return studentId;
    }
    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
     * @return the attendance
     */
    public char getAttendance() {
        return attendance;
    }
    /**
     * @param attendance the attendance to set
     */
    public void setAttendance(char attendance) {
        this.attendance = attendance;
    }
}
