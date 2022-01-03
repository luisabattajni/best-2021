package org.generation.italy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String index(Model model, @RequestParam(name="titolo", defaultValue="Default") String titoloParam) {
		// logica applicativa

		
		if(titoloParam == null) {
			titoloParam = "Default";
		}
		
		// passo la logica alla view col Model
		model.addAttribute("name", "Luisa");

		
		// restituisco la view
		return "index";
	}

}
