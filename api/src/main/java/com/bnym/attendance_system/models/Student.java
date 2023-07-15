package com.bnym.attendance_system.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;
    
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;
    
    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;
    
    @Column(name = "middle_name", length = 50, nullable = false)
    private String middleName;
    
    @Column(name = "roll_number", length = 3, nullable = false)
    private int rollNumber;
    
//    @Column(name = "class_id", length = 10, nullable = false)
//    private Long classId;
    
    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classObj;
    
	@Column(name = "phone_number", length = 10, nullable = false)
    private String phoneNumber;
    
	@Column(name = "email", length = 50, nullable = true)
    private String email;
    
    /**
     * @return the id
     */
    public Long getStudentId() {
        return studentId;
    }
    /**
     * @param id the id to set
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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
    
    public String getMiddleName() {
		return middleName;
	}
    
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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
	
    public Class getClassObj() {
		return classObj;
	}
    
	public void setClassObj(Class classObj) {
		this.classObj = classObj;
	}
    
    public String getPhoneNumber() {
		return phoneNumber;
	}
    
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
