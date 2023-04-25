package com.webprojem.di;

import com.webprojem.di.service.TicketService;

public class SetterInjectedController {

	private TicketService ticketService;
	
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	public void sayPrice() {
		System.out.println(ticketService.sayPrice());
	}
	
	
}
