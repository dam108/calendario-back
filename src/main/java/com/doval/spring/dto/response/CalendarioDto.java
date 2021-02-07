package com.doval.spring.dto.response;

import java.io.Serializable;
import java.sql.Date;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Data;

@Data
public class CalendarioDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2564166110182677611L;

	@JMap
	private int calendario;
	
	@JMap
	private String DNI_usuario;
	
	@JMap
	private Date fecha_creacion;
	
	public CalendarioDto() {
		super();
	}

}
