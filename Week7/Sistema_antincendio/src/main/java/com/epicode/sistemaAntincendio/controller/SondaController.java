package com.epicode.sistemaAntincendio.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.epicode.sistemaAntincendio.model.Sonda;
import com.epicode.sistemaAntincendio.repository.SondaRepository;

@Controller
@RequestMapping("/sonda")
public class SondaController {

	private final SondaRepository sondaRepository;

	@Autowired
	public SondaController(SondaRepository sondaRepository) {
		this.sondaRepository = sondaRepository;
	}

	@GetMapping
	@ResponseBody
	public List<Sonda> getSonde() {
		return sondaRepository.findAll();
	}
	
	@PostMapping
	@ResponseBody
	public Sonda creaSonda(@RequestBody Sonda sonda) {
		return sondaRepository.save(sonda);
	}


	@GetMapping("/{id}")
	@ResponseBody
	public Sonda getSonda(@PathVariable("id") Long id) {
		return sondaRepository.findById(id).orElse(null);
	}

}
