package com.bnym.attendance_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnym.attendance_system.models.ClassDetails;


public interface ClassRepository extends JpaRepository<ClassDetails, Long> {    
}
