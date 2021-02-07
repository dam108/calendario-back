package com.doval.spring.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doval.spring.dao.IUsuariosRepository;
import com.doval.spring.dto.response.UsuarioDto;
import com.doval.spring.modelos.Usuario;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;

@Service
public class UsuariosService implements IUsuariosService {
	
	@Autowired
	private IUsuariosRepository usuariosRepo;
	
	@Autowired
	private JMapperAPI jmapperApi;

	@Override
	public List<UsuarioDto> findAll() {
		ArrayList<UsuarioDto> resultado = new ArrayList<UsuarioDto>();
		usuariosRepo.findAll().forEach(r -> resultado.add(converrToDto(r)));
		System.out.println("pasando por el servicio");
		return resultado;
	}
	
	
	private UsuarioDto converrToDto(Usuario entidad) {
		JMapper<UsuarioDto, Usuario> mapper = new JMapper<>(UsuarioDto.class, Usuario.class, jmapperApi);
		UsuarioDto usuarioDto = mapper.getDestination(entidad);
		return usuarioDto;
	}

}
