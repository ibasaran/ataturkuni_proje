package com.webprojem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webprojem.domain.UserMail;
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
	public String homePage(Model model) {
		
		model.addAttribute("books", bookRespository.findAll());
		
		UserMail userMail = new UserMail();
		
		model.addAttribute("userEmail", userMail);
		
		return "index";
	}
	
	@RequestMapping("/contact")
	public String contactPage(Model model) {
		return "contact";
	}
	
	
	
//	@RequestMapping("/")
//	public String getTest(Model model) {
//		
//		model.addAttribute("books", "merhaba");
//		
//		return "test";
//		
//	}
	
	
//	@RequestMapping("/book-detail")
//	public String bookDetailPage(@RequestParam Long id,Model model) {
//		
//		model.addAttribute("book", bookRespository.findById(id).get());
//		
//		return "book_detail";
//	}
	
	@RequestMapping("/book-detail/{id}")
	public String bookDetailPage(@PathVariable Long id,Model model) {
		
		model.addAttribute("book", bookRespository.findById(id).get());
		
		return "book_detail";
	}
	
	

}
