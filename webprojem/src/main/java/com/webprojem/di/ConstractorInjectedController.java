package com.webprojem.di;

import com.webprojem.di.service.TicketService;

public class ConstractorInjectedController {
	
	private TicketService ticketService;
	
	
	public ConstractorInjectedController(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	public void sayPrice() {
		System.out.println(ticketService.sayPrice());
	}
	

}
