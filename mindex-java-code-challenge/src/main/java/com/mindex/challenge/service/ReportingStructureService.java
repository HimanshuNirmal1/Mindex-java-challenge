package com.mindex.challenge.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;

@Service
public interface ReportingStructureService {
	
	ReportingStructure reportingStructure(String id);
	
}
