package com.bnym.attendance_system.dto;

public class AttendanceDTO {
    private Long studentId;
    private String status;
    private String remarks;
    public String date;
    /**
     * @param studentId
     * @param status
     * @param remarks
     * @param date
     */
    public AttendanceDTO(Long studentId, String status, String remarks, String date) {
        this.studentId = studentId;
        this.status = status;
        this.remarks = remarks;
        this.date = date;
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
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }
    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
}
