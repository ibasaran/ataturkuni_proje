package com.webprojem.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.webprojem.di.TicketController;

@SpringBootTest
public class TicketControllerTest {
	
	@Autowired
	TicketController ticketController;
	
	
	@Test
	void sayPrice() {
		ticketController.sayPrice();
	}

}
