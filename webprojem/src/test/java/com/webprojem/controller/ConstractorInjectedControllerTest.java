package com.webprojem.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.webprojem.di.ConstractorInjectedController;
import com.webprojem.di.service.TicketServiceImpl;

public class ConstractorInjectedControllerTest {
	
	ConstractorInjectedController constractorInjectedController;
	
	@BeforeEach
	void setUp() {
		constractorInjectedController = new ConstractorInjectedController(new TicketServiceImpl());
	}
	
	@Test
	void sayPrice() {
		constractorInjectedController.sayPrice();
	}

}
