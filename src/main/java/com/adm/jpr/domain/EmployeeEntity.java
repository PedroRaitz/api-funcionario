package com.adm.jpr.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;

	private String socialSecurityNumber;

	private Double grossSales; 

	private Double commissionRate; 

	private Double baseSalary; 

	private Double wage; 

	private Double hours; 

	private Double weeklySalary;

}
