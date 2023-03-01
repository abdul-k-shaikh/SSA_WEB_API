package com.abd.service;

import org.springframework.stereotype.Service;

@Service
public class SsaService {
	
	public String fetchStateName(String ssn) {
		String stateName=null;
		
		if(ssn.startsWith("4")) {
			stateName="New Jersey"; 
		}
		else if(ssn.startsWith("5")) {
			stateName="Rohde Island";
		}
		else if(ssn.startsWith("6")) {
			stateName="Kentuccky";
		}
		else if(ssn.startsWith("7")) {
			stateName="Ohio";
		}
		else {
			stateName="Invalid SSN";
		}
		
		return stateName;
	}
}
