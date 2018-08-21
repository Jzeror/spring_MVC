package com.gms.web.domain;

import lombok.Data;

@Data
public class MemberDTO {
	private String memId,
					ssn, 
					name, 
					roll, 
					teamId, 
					password, 
					age,  
					gender;
}