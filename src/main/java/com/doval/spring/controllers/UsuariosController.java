package com.doval.spring.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.doval.spring.dto.response.UsuarioDto;
import com.doval.spring.servicios.IUsuariosService;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private IUsuariosService serv;
	
	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Iterable<UsuarioDto>> getUsuarios(){
		ArrayList<UsuarioDto> resultado = new ArrayList<UsuarioDto>();
		System.out.println("pasando por el controler");
		try {
			resultado = (ArrayList<UsuarioDto>) serv.findAll();
			System.out.println("Se han recuperado los usuarios");
			return new ResponseEntity<Iterable<UsuarioDto>>(resultado, HttpStatus.OK);
		} catch(Exception ex) {
			System.out.println("No Se han recuperado los usuarios");
			return new ResponseEntity<Iterable<UsuarioDto>>(resultado, HttpStatus.NOT_FOUND);
		}
	}

}
