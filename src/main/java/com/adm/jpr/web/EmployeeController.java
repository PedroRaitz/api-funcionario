package com.adm.jpr.web;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adm.jpr.employee.BasePlusCommissionEmployee;
import com.adm.jpr.employee.CommissionEmployee;
import com.adm.jpr.employee.Employee;
import com.adm.jpr.employee.HourlyEmployee;
import com.adm.jpr.employee.SalariedEmployee;

@RestController
public class EmployeeController {

	private ArrayList<Employee> employeesList;

	public EmployeeController() {
		employeesList = new ArrayList<Employee>();
	}

	@GetMapping("/mensagem")
	public String testMensagem() {
		return "Vamos retornar uma mensagem quando a gente acessar esse cara via browser.";
	}

	/*
	 curl -H "Content-Type: application/json" --request POST --data \
	 '{"firstName":"Joao","lastName":"Raitz","socialSecurityNumber":"123","wage":5.5,"hours":40}' \
      http://localhost:8080/criahourlyemployee
	 */
	@PostMapping("/criahourlyemployee")
	public ResponseEntity<?> create(@RequestBody HourlyEmployee he1) {
		if (he1 == null) {
			return new ResponseEntity<>("HourlyEmployee invalido", HttpStatus.BAD_REQUEST);
		}
		employeesList.add(he1);
		return new ResponseEntity<>(he1, HttpStatus.CREATED);
	}

	/*
	 curl -H "Content-Type: application/json" --request POST --data \
	 '{"firstName":"Joao","lastName":"Raitz","socialSecurityNumber":"123","wage":5.5,"hours":40}' \
	 http://localhost:8080/criacommisionemployee
	*/
	@PostMapping("/criacommisionemployee")
	public ResponseEntity<?> create(@RequestBody CommissionEmployee he1) {
		if (he1 == null) {
			return new ResponseEntity<>("CommisionEmployee invalido", HttpStatus.BAD_REQUEST);
		}
		employeesList.add(he1);
		return new ResponseEntity<>(he1, HttpStatus.CREATED);
	}

	/*
	curl -H "Content-Type: application/json" --request POST --data \
		 '{"firstName":"Joao","lastName":"Raitz","socialSecurityNumber":"123","weeklySalary":500.5}' \
		 http://localhost:8080/criasalariedemployee
		 */
	@PostMapping("/criasalariedemployee")
	public ResponseEntity<?> create(@RequestBody SalariedEmployee he1) {
		if (he1 == null) {
			return new ResponseEntity<>("SalariedEmployee invalido", HttpStatus.BAD_REQUEST);
		}
		employeesList.add(he1);
		return new ResponseEntity<>(he1, HttpStatus.CREATED);
	}

	/*
	curl -H "Content-Type: application/json" --request POST --data \
		 '{"firstName":"Joao","lastName":"Raitz","socialSecurityNumber":"123","grossSales":"5500.0","commissionRate":"100.0","baseSalary":"300.0"}' \
		 http://localhost:8080/criabasepluscommisionemployee
		 */
	@PostMapping("/criabasepluscommisionemployee")
	public ResponseEntity<?> create(@RequestBody BasePlusCommissionEmployee he1) {
		if (he1 == null) {
			return new ResponseEntity<>("BasePlusCommisionEmployee invalido", HttpStatus.BAD_REQUEST);
		}
		employeesList.add(he1);
		return new ResponseEntity<>(he1, HttpStatus.CREATED);
	}

	// curl http://localhost:8080/employeelist
	@GetMapping("/employeelist")
	public ArrayList<Employee> retornaListEmployee() {
		return employeesList;
	}

}
