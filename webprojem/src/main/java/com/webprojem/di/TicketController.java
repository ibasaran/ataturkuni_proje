package com.webprojem.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.webprojem.di.service.TicketService;

@Controller
public class TicketController {

// Property Injected
	@Autowired
	@Qualifier("trainTicketService")
	TicketService ticketService;

	
// Constructor Injected
//	TicketService ticketService;
//	
//	public TicketController(TicketService ticketService) {
//		this.ticketService = ticketService;
//	}
	
	// Setter based Injected
//	private TicketService ticketService;
//	
//	
//	@Autowired
//	public void setTicketService(@Qualifier("trainTicketService")  TicketService ticketService) {
//		this.ticketService = ticketService;
//	}
	
	
	public void sayPrice() {
		System.out.println(ticketService.sayPrice());
	}
	

}
