package com.bnym.attendance_system.models;

import java.io.Serializable;
import java.sql.Date;

public class AttendanceId implements Serializable {
    private Long studentId;
    private Date date;
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

    public AttendanceId(Long studentId, Date date) {
        this.studentId = studentId;
        this.date = date;
    }
}
