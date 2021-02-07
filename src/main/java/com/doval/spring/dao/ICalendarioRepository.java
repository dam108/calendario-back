package com.doval.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doval.spring.modelos.Calendario;

public interface ICalendarioRepository extends JpaRepository<Calendario, Integer> {

}
