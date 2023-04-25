package com.webprojem.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.webprojem.di.SetterInjectedController;
import com.webprojem.di.service.TicketServiceImpl;

public class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;
	
	@BeforeEach
	void setUp() {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setTicketService(new TicketServiceImpl());
	}
	
	@Test
	void sayPrice() {
		setterInjectedController.sayPrice();
	}

}
