package com.doval.spring.modelos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="calendarios")
public class Calendario {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int calendario;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name="DNI_usuario")
	private Usuario usuario;
	
	@NotNull
	private Date fecha_creacion;
	

}
