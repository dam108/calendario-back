package com.doval.spring.servicios;

import java.util.List;

import com.doval.spring.dto.response.CalendarioDto;

public interface ICalendariosService {
	
	public List<CalendarioDto> findAll();

}
