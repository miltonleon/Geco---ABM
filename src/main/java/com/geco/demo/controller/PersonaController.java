package com.geco.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.geco.demo.entity.Persona;
import com.geco.demo.service.IPersonaService;


@Controller
public class PersonaController {
	@Autowired
	private IPersonaService personaService;
	
	
	@GetMapping(value="/agendaRuta")
	
	public String index(Model model) {
		List<Persona>personas=personaService.findAll();
		model.addAttribute("personas",personas);
	
		System.out.println("asdsadsaddsasddasdsada");
		System.out.println(personas.toString());
		System.out.println("asdsadsaddsasddasdsada");
		
		return "index";
	}
	
	@RequestMapping(value= {"/listar ","/agendaRuta" } )
	public String listar(Model model) {
		List<Persona>personas=personaService.findAll();
		model.addAttribute("personas",personas);
	
		System.out.println("asdsadsaddsasddasdsada");
		System.out.println(personas.toString());
		System.out.println("asdsadsaddsasddasdsada");
		
		return "index";
		

	}
	
	
	
	@GetMapping(value="agendarRuta")
	public String formulario() {
		return "formulario";
	}
	
	@RequestMapping( value={"/new" })
	public String agregar(Model model) {
		model.addAttribute("persona",new Persona("","",0,"",0));
		
		return "formulario";
		
	}
	
	
	@PostMapping(value= {"/save"})
	public String nuevoPersona(Model model , Persona persona) {
		personaService.save(persona);
		
		
		return "redirect:/agendaRuta";
		
	}
	
	
	@RequestMapping( value={"/editar/{dni}" })
	public String editar(Model model , @PathVariable(value = "dni") Integer dni) {
		Persona persona= personaService.findOne(dni);
		model.addAttribute("persona", persona);
		
		
		return "formulario";
		
	}
	
	
	@RequestMapping( value={"/eliminar/{dni}" })
	public String eliminar(Model model , @PathVariable(value = "dni") Integer dni) {
		 personaService.delete(dni);
	
		
		
		return "redirect:/agendaRuta";
		
	}
	


	
	
	
	

	
	
}
