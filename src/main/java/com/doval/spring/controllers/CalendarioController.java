package com.doval.spring.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.doval.spring.dto.response.CalendarioDto;
import com.doval.spring.servicios.ICalendariosService;

@RestController
@RequestMapping("/calendarios")
public class CalendarioController {

	@Autowired
	private ICalendariosService serv;
	
	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Iterable<CalendarioDto>> getCalendarios(){
		ArrayList<CalendarioDto> resultado = new ArrayList<CalendarioDto>();
		System.out.println("pasando por el controller de calendarios");
		try {
			resultado = (ArrayList<CalendarioDto>) serv.findAll();
			System.out.println("Se han recuperado los usuarios");
			return new ResponseEntity<Iterable<CalendarioDto>>(resultado, HttpStatus.OK);
		} catch(Exception ex) {
			System.out.println("No Se han recuperado los usuarios");
			return new ResponseEntity<Iterable<CalendarioDto>>(resultado, HttpStatus.NOT_FOUND);
		}
	}
}
