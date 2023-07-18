package com.bnym.attendance_system.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance")
@IdClass(AttendanceId.class)
public class Attendance {

	@Id
	@Column(name = "student_id")
	private Long studentId;

	@Id
	@Column(name = "a_date")
	private LocalDate date;

	@Column(name = "status")
	private String status;

	@Column(name = "remarks")
	private String remarks;

	/**
	 * 
	 */
	public Attendance() {
	}

	/**
	 * @param studentId
	 * @param date
	 * @param status
	 * @param remarks
	 */
	public Attendance(Long studentId, LocalDate date, String status, String remarks) {
		this.studentId = studentId;
		this.date = date;
		this.status = status;
		this.remarks = remarks;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
