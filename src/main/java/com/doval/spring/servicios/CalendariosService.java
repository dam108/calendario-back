package com.doval.spring.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doval.spring.dao.ICalendarioRepository;
import com.doval.spring.dto.response.CalendarioDto;
import com.doval.spring.modelos.Calendario;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;

@Service
public class CalendariosService implements ICalendariosService {

	@Autowired
	private ICalendarioRepository calendarioRepo;
	
	@Autowired
	private JMapperAPI jmapperApi;
	
	@Override
	public List<CalendarioDto> findAll() {
		System.out.println("entrando en el servicio de calendario");
		ArrayList<CalendarioDto> resultado = new ArrayList<CalendarioDto>();
		calendarioRepo.findAll().forEach(r -> resultado.add(converrToDto(r)));
		System.out.println("saliendo por el servicio de calendario");
		return resultado;
	}

	private CalendarioDto converrToDto(Calendario entidad) {
		JMapper<CalendarioDto, Calendario> mapper = new JMapper<>(CalendarioDto.class, Calendario.class, jmapperApi);
		CalendarioDto calendarioDto = mapper.getDestination(entidad);
		return calendarioDto;
	}
}
