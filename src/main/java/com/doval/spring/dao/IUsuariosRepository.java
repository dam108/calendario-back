package com.doval.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doval.spring.modelos.Usuario;


public interface IUsuariosRepository extends JpaRepository<Usuario, Integer> {

}
