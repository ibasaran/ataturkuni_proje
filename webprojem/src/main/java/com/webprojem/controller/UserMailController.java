package com.webprojem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webprojem.domain.UserMail;
import com.webprojem.repository.UserMailRepository;

@Controller
public class UserMailController {
	
	@Autowired
	private UserMailRepository userMailRepository;
	
	
	@RequestMapping(value = "/subscribe", method = RequestMethod.POST)
	public String subscribeEmail(@ModelAttribute("userEmail") UserMail mail) {
		
		
		userMailRepository.save(mail);
		
		return "redirect:/";
	}
	
	

}
