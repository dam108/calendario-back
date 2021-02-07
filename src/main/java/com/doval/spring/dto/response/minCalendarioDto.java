package com.doval.spring.dto.response;

import java.sql.Date;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Data;

@Data
public class minCalendarioDto {
	
	@JMap
	private int calendario;
	
	@JMap
	private Date fecha_creacion;

}
