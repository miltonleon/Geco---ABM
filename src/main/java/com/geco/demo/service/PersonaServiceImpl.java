package com.geco.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geco.demo.dao.IPersonaDao;
import com.geco.demo.entity.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {
	@Autowired
	private IPersonaDao personaDao;

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public void save(Persona persona) {
		
		personaDao.save(persona);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona findOne(Integer dni) {
		// TODO Auto-generated method stub
		return personaDao.findById(dni).orElse(null) ;
	}

	@Override
	public void delete(Integer dni) {
		
		personaDao.deleteById(dni);
		// TODO Auto-generated method stub
		
	}
	
	

}
