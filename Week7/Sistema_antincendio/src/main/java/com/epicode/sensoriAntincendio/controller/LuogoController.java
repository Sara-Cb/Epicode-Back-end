package com.epicode.sensoriAntincendio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.epicode.sensoriAntincendio.model.Luogo;
import com.epicode.sensoriAntincendio.repository.LuogoRepository;

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
	public List<Luogo> getLuogo(@RequestBody Luogo luogo) {
		return luogoRepository.findAll();
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Luogo getLuogo(@PathVariable("id") Long id) {
		return luogoRepository.findById(id).orElse(null);
	}
}
