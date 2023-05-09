package com.webprojem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AboutController {
	
	
	@RequestMapping("/about")
	public String aboutPage(@RequestParam Boolean showTeam , Model model) {
		
		model.addAttribute("showTeam", showTeam);
		
		return "about";
	}
	

}
