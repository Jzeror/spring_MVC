package com.gms.web.domain;

import org.springframework.stereotype.Controller;

import lombok.Data;

@Controller
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