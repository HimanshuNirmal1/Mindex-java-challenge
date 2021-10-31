package com.mindex.challenge.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.CompensationService;

@Service
public class CompensationImpl implements CompensationService{

	private static final Logger LOG = LoggerFactory.getLogger(CompensationImpl.class);

    @Autowired
    private CompensationRepository compensationRepository;
    
	@Override
	public Compensation create(Compensation cmp) {
		// TODO Auto-generated method stub
		compensationRepository.insert(cmp);
		return cmp;
	}

	@Override
	public Compensation read(String employeeId) {
		// TODO Auto-generated method stub
		 Compensation compensation = compensationRepository.findByEmployeeId(employeeId);

	        if (compensation == null) {
	            throw new RuntimeException("Invalid employeeId: " + employeeId);
	        }

		return compensation;
	}

}
