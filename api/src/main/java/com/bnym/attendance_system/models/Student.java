package com.bnym.attendance_system.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name= "student")
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;
    @Column(name = "email", length = 50, nullable = true)
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
    @Column(name = "roll_number", length = 3, nullable = false)
    private int rollNumber;
    @Column(name = "attendance", length = 3, nullable = false)
    private int attendance;
    @Column(name = "division_id", length = 10, nullable = false)
    private Long divisionId;
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
     * @return the attendance
     */
    public int getAttendance() {
        return attendance;
    }
    /**
     * @param attendance the attendance to set
     */
    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
    /**
     * @return the divisionId
     */
    public Long getDivisionId() {
        return divisionId;
    }
    /**
     * @param divisionId the divisionId to set
     */
    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }
}
