package com.bnym.attendance_system.models;

import java.time.LocalDate;

public interface StudentWithAttendance {
    Long getStudentId();
    LocalDate getDate();
    String getFirstName();
    String getLastName();
    String getStatus();
    Long getClassId();
    String getRollNumber();
}
