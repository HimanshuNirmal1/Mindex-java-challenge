package com.mindex.challenge.service;

import org.springframework.stereotype.Service;

import com.mindex.challenge.data.Compensation;

@Service
public interface CompensationService {

		Compensation create(Compensation cmp);
		Compensation read(String employeeId);
		
		
}
