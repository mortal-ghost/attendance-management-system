package com.bnym.attendance_system.models;

import java.time.LocalDate;

public class StudentWithAttendance {
    private Long studentId;
    private LocalDate date;
    private String firstName;
    private String lastName;
    private String status;
    private Long classId;
    private int rollNumber;
    
    /**
     * @param studentId
     * @param date
     * @param firstName
     * @param lastName
     * @param status
     * @param classId
     */
    public StudentWithAttendance(Long studentId, LocalDate date, String firstName, String lastName, String status,
    Long classId, int rollNumber) {
        this.studentId = studentId;
        this.date = date;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.classId = classId;
        this.rollNumber = rollNumber;
    }
    
    /**
     * @return the rollNumber
     */
    public int getRollNumber() {
        return rollNumber;
    }
    /**
     * @param rollNumber the rollNumber to set
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
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
    public LocalDate getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @return the classId
     */
    public Long getClassId() {
        return classId;
    }
    /**
     * @param classId the classId to set
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }
}
