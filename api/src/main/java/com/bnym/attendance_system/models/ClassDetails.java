package com.bnym.attendance_system.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "class_details")
public class ClassDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "grade_text", length = 2, nullable = false)
    private String gradeText;
    @Column(name = "division_text", length = 1, nullable = false)
    private String divisionText;
    @Column(name = "teacher_id", length = 10, nullable = false)
    @OneToOne  // One teacher can have only one class
    private Long teacherId;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the gradeText
     */
    public String getGradeText() {
        return gradeText;
    }
    /**
     * @param gradeText the gradeText to set
     */
    public void setGradeText(String gradeText) {
        this.gradeText = gradeText;
    }
    /**
     * @return the divisionText
     */
    public String getDivisionText() {
        return divisionText;
    }
    /**
     * @param divisionText the divisionText to set
     */
    public void setDivisionText(String divisionText) {
        this.divisionText = divisionText;
    }
    /**
     * @return the teacherId
     */
    public Long getTeacherId() {
        return teacherId;
    }
    /**
     * @param teacherId the teacherId to set
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
