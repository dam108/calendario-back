package com.doval.spring.servicios;

import java.util.List;

import com.doval.spring.dto.response.UsuarioDto;

public interface IUsuariosService {

	public List<UsuarioDto> findAll();
}
