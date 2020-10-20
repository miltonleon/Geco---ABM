package com.geco.demo.service;

import java.util.List;

import com.geco.demo.entity.Persona;

public interface IPersonaService {
	
	public List<Persona> findAll();
	
	public void save(Persona persona);
	
	public Persona findOne(Integer dni);
	
	public void delete(Integer dni);
	

}
