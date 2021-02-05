package com.adm.jpr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adm.jpr.domain.EmployeeEntity;
import com.adm.jpr.employee.BasePlusCommissionEmployee;
import com.adm.jpr.employee.CommissionEmployee;
import com.adm.jpr.employee.HourlyEmployee;
import com.adm.jpr.employee.SalariedEmployee;
import com.adm.jpr.repository.EmployeeRepository;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	private EmployeeEntity convertSalariedEmployeeToEmployeeEntity(SalariedEmployee salariedEmployee) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setFirstName(salariedEmployee.getFirstName());
		entity.setWeeklySalary(salariedEmployee.getWeeklySalary());
		entity.setLastName(salariedEmployee.getLastName());
		entity.setSocialSecurityNumber(salariedEmployee.getSocialSecurityNumber());
		return entity;
	}

	public void saveSalariedEmployee(SalariedEmployee salariedEmployee) {
		employeeRepository.saveAndFlush(convertSalariedEmployeeToEmployeeEntity(salariedEmployee));
	}

//	public void saveSalariedEmployee(SalariedEmployee salariedEmployee) {
//	EmployeeEntity e = convertSalariedEmployeeToEmployeeEntity(salariedEmployee);
//	employeeRepository.saveAndFlush(e);
//}

	private EmployeeEntity convertBasePlusCommissionEmployee(BasePlusCommissionEmployee basePlusCommissionEmployee) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setFirstName(basePlusCommissionEmployee.getFirstName());
		entity.setLastName(basePlusCommissionEmployee.getLastName());
		entity.setSocialSecurityNumber(basePlusCommissionEmployee.getSocialSecurityNumber());
		entity.setBaseSalary(basePlusCommissionEmployee.getBaseSalary());
		return entity;
	}

	public void saveBasePlusCommissionEmployee(BasePlusCommissionEmployee basePlusCommissionEmployee) {
		employeeRepository.saveAndFlush(convertBasePlusCommissionEmployee(basePlusCommissionEmployee));
	}

	private EmployeeEntity convertCommissionEmployee(CommissionEmployee commissionEmployee) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setFirstName(commissionEmployee.getFirstName());
		entity.setLastName(commissionEmployee.getLastName());
		entity.setSocialSecurityNumber(commissionEmployee.getSocialSecurityNumber());
		entity.setGrossSales(commissionEmployee.getGrossSales());
		entity.setCommissionRate(commissionEmployee.getCommissionRate());
		return entity;
	}

	public void saveCommissionEmployee(CommissionEmployee commissionEmployee) {
		employeeRepository.saveAndFlush(convertCommissionEmployee(commissionEmployee));
	}

	private EmployeeEntity convertHourlyEmployee(HourlyEmployee hourlyEmployee) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setFirstName(hourlyEmployee.getFirstName());
		entity.setLastName(hourlyEmployee.getLastName());
		entity.setSocialSecurityNumber(hourlyEmployee.getSocialSecurityNumber());
		entity.setWage(hourlyEmployee.getWage());
		entity.setHours(hourlyEmployee.getHours());
		return entity;
	}

	public void saveHourlyEmployee(HourlyEmployee hourlyEmployee) {
		employeeRepository.saveAndFlush(convertHourlyEmployee(hourlyEmployee));
	}

}
