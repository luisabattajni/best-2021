package org.generation.italy.controller;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

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

		if(nameParam == null) {
			nameParam = "Default";
		}

		model.addAttribute("name", "Luisa");

		return "index";
	}
	
	//titoli da liste online
	
	@GetMapping("/movies")
	public String movies(Model model) {

		model.addAttribute("movies", Arrays.asList("76 Days", "Drive my car", "Quo Vadis, Aida?", "Slalom", "The worst person in the world"));
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {

		model.addAttribute("songs", Arrays.asList("Easy on me", "Montero", "transparent soul", "To Be Loved", "'All Too Well"));
		return "songs";
	}
	

}
