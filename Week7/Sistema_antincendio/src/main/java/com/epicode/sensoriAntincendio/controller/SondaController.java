package com.epicode.sensoriAntincendio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.epicode.sensoriAntincendio.model.Luogo;
import com.epicode.sensoriAntincendio.model.Sonda;
import com.epicode.sensoriAntincendio.repository.LuogoRepository;
import com.epicode.sensoriAntincendio.repository.SondaRepository;

@Controller
@RequestMapping("/sonda")
public class SondaController {

	@Autowired
	SondaRepository sondaRepository;

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
