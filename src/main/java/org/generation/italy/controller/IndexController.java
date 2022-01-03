package org.generation.italy.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String index(Model model, @RequestParam(name="name", defaultValue="Default") String nameParam) {
		// logica applicativa

		
		if(nameParam == null) {
			nameParam = "Default";
		}
		
		// passo la logica alla view col Model
		model.addAttribute("name", "Luisa");

		
		// restituisco la view
		return "index";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
//		List<String> movieList = new ArrayList<String>();
		
		
		model.addAttribute("movies", Arrays.asList("Film1", "Film2", "Film3", "Film4", "Film5"));
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
//		List<String> songList = new ArrayList<String>();
		
		
		model.addAttribute("songs", Arrays.asList("S1", "S2", "S3", "S4", "S5"));
		return "songs";
	}
	

}
