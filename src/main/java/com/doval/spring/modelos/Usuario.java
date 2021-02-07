package com.doval.spring.modelos;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
    @NotNull
	private String DNI_usuario;
	
    @NotNull
	private String nombre_completo;
    
    @NotNull
	private String email;
    
    @NotNull
	private String contraseña;
    
    @NotNull
	private String poblacion;

	private String portal;
	
    @NotNull
	private String codigo_postal;
    
    @NotNull
	private LocalDate fecha_nacimiento;
    
    @OneToMany(mappedBy="usuario",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Calendario> calendarios;

}
