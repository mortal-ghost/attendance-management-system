package com.bnym.attendance_system.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Table(name= "teacher")
public class Teacher {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    @Column(name = "birth_day", length = 2, nullable = false)
    private int birthDay;
    @Column(name = "birth_month", length = 2, nullable = false)
    private int birthMonth;
    @Column(name = "birth_year", length = 4, nullable = false)
    private int birthYear;
    @Column(name = "contact_number", length = 10, nullable = false)
    private String contactNumber;
    @Column(name = "class_id", length = 10, nullable = false)
    private Long classId;

    
    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }
    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
    /**
     * @return the birthDay
     */
    public int getBirthDay() {
        return birthDay;
    }
    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    /**
     * @return the birthMonth
     */
    public int getBirthMonth() {
        return birthMonth;
    }
    /**
     * @param birthMonth the birthMonth to set
     */
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
    /**
     * @return the birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }
    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
