package com.adm.jpr.employee;

public class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	// construtor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// retorna o nome
	public String getFirstName() {
		return firstName;
	}

	// retorna o sobrenome
	public String getLastName() {
		return lastName;
	}

	// retorna o número do seguro social
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	// retorna a representação de String do objeto Employee
	@Override
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber());
	}

	// O método abstract deve ser sobrescrito pelas subclasses concretas
	public double earnings() {
		return 0;
	}
}
