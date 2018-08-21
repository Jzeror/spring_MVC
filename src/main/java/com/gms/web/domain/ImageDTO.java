package com.gms.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ImageDTO {
	private String imgSeq, //얘가 pk
				imgName,
				extension,
				memId;
}