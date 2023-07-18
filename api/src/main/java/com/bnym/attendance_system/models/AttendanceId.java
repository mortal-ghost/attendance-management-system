package com.bnym.attendance_system.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class AttendanceId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long studentId;

    private Date date;

    public AttendanceId(Long studentId, Date date) {
		super();
		this.studentId = studentId;
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceId other = (AttendanceId) obj;
		return Objects.equals(date, other.date) && studentId == other.studentId;
	}

    @Override
	public int hashCode() {
		return Objects.hash(date, studentId);
	}
}
