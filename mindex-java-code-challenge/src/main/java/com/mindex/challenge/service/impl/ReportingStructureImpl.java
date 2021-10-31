package com.mindex.challenge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;

@Service
public class ReportingStructureImpl implements ReportingStructureService{

	@Autowired
	private EmployeeRepository employeeRepository;
	 
	@Override
	public ReportingStructure reportingStructure(String id) {
		// TODO Auto-generated method stub
		
		Employee emp = employeeRepository.findByEmployeeId(id);
		
		int count = getEmployeeDirectReports(emp);
		
		ReportingStructure rpo = new ReportingStructure();
		rpo.setEmployee(emp);
		rpo.setNumberOfReports(count);
		
		return rpo;
	}
	
	public int getEmployeeDirectReports(Employee emp) {
		List<Employee> dirRpt = emp.getDirectReports();
		
		int count = 0;
		
		int directEmp = dirRpt.size();
		if(directEmp > 0) {
			count += directEmp;
			for(int i=0; i<directEmp; i++) {
				if(employeeRepository.findByEmployeeId(dirRpt.get(i).getEmployeeId()).getDirectReports() != null){
						count += getEmployeeDirectReports(employeeRepository.findByEmployeeId(dirRpt.get(i).getEmployeeId()));
				}
			}
		}
		return count;
	}

}
