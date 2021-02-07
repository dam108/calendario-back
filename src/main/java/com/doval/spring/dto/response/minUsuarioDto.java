package com.doval.spring.dto.response;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Data;

@Data
public class minUsuarioDto {
	
	@JMap
	private String DNI_usuario;
	
	@JMap
	private String nombre_completo;
	
	@JMap
	private String email;
}
