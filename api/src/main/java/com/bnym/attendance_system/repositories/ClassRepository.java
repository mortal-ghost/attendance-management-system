package com.bnym.attendance_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bnym.attendance_system.models.Class;

public interface ClassRepository extends JpaRepository<Class, Long> {    
}
