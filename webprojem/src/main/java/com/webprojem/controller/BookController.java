package com.webprojem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webprojem.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRespository;
	
	@RequestMapping("/books")
	public String getBooks(Model model) {
		
		model.addAttribute("books", bookRespository.findAll());
		
		return "books";
		
	}
	
	
	@RequestMapping("/")
	public String getTest(Model model) {
		
		model.addAttribute("books", "merhaba");
		
		return "test";
		
	}

}
