package com.geco.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.geco.demo.entity.Persona;
@Repository
public interface IPersonaDao extends CrudRepository<Persona,Integer>{
	
	
	
	/*@Query("SELECT nombre , apellido , telefono, dni, mail FROM persona WHERE dni LIKE %?1%")
	public List<Persona> busquedaDni(Integer dni); */

}
