package com.mindex.challenge.data;
import java.time.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.EmployeeRepository;

@Service
public class Compensation {
	//private Employee employee;
	private int salary;
	private LocalDate effectiveDate;
	private String employeeId;

	@Autowired
	private EmployeeRepository employeeRepository;
	
    public Compensation() {
    }

	public Compensation(String employeeId, int salary, LocalDate date) {
		super();
		
		//this.employee = employeeRepository.findByEmployeeId(employeeId);
		this.salary = salary;
		this.effectiveDate = date;
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        //this.employee = employeeRepository.findByEmployeeId(employeeId);
        this.employeeId = employeeId;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate date) {
        this.effectiveDate = date;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
