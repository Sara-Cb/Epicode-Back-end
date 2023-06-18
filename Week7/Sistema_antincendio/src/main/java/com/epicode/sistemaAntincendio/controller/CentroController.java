package com.epicode.sistemaAntincendio.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.epicode.sistemaAntincendio.model.CentroDiControllo;
import com.epicode.sistemaAntincendio.repository.CentroRepository;

@Controller
@RequestMapping("/centri")
public class CentroController {

	private final CentroRepository centroRepository;

	@Autowired
	public CentroController(CentroRepository centroRepository) {
		this.centroRepository = centroRepository;
	}

	@PostMapping
	@ResponseBody
	public CentroDiControllo creaCentro(@RequestBody CentroDiControllo centro) {
		return centroRepository.save(centro);
	}

	@GetMapping
	@ResponseBody
	public List<CentroDiControllo> getCentri() {
		return centroRepository.findAll();
	}

	@GetMapping("/{id}")
	@ResponseBody
	public CentroDiControllo getCentro(@PathVariable("id") Long id) {
		return centroRepository.findById(id).orElse(null);
	}
}
