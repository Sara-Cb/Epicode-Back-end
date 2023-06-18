package com.epicode.sistemaAntincendio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.epicode.sistemaAntincendio.model.Luogo;
import com.epicode.sistemaAntincendio.repository.LuogoRepository;

@Controller
@RequestMapping("/luoghi")
public class LuogoController {

	private final LuogoRepository luogoRepository;

	@Autowired
	public LuogoController(LuogoRepository luogoRepository) {
		this.luogoRepository = luogoRepository;
	}

	@PostMapping
	@ResponseBody
	public Luogo creaLuogo(@RequestBody Luogo luogo) {
		return luogoRepository.save(luogo);
	}

	@GetMapping
	@ResponseBody
	public List<Luogo> getLuoghi() {
		return luogoRepository.findAll();
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Luogo getLuogo(@PathVariable("id") Long id) {
		return luogoRepository.findById(id).orElse(null);
	}
}
