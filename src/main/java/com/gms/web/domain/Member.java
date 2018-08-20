package com.gms.web.domain;

import lombok.Data;

@Data
public class Member {
	private String memId,
					ssn, 
					name, 
					roll, 
					teamId, 
					password, 
					age,  
					gender;
}
