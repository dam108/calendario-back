package com.doval.spring.dto.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.doval.spring.modelos.Calendario;
import com.googlecode.jmapper.annotations.JMap;

import lombok.Data;

@Data
public class UsuarioDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6023177204208239625L;

	@JMap
	private String DNI_usuario;
	
	@JMap
	private String nombre_completo;
    
	@JMap
	private String email;
    
	@JMap
	private String contraseña;
    
	@JMap
	private String poblacion;

	@JMap
	private String portal;
	
	@JMap
	private String codigo_postal;
    
	@JMap
	private LocalDate fecha_nacimiento;
	
//	@JMap
//	private List<Calendario> calendarios;
	
	public UsuarioDto() {
		super();
	}
	
}
