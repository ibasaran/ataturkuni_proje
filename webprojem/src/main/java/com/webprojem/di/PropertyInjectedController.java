package com.webprojem.di;

import com.webprojem.di.service.TicketService;

public class PropertyInjectedController {
	
	public TicketService ticketService;
	
	
	
	public void sayPrice() {
		System.out.println(ticketService.sayPrice());
	}

}
