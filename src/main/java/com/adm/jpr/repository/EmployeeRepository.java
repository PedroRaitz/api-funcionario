package com.adm.jpr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adm.jpr.domain.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
	
}
