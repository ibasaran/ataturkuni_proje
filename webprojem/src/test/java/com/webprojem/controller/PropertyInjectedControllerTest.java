package com.webprojem.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.webprojem.di.PropertyInjectedController;
import com.webprojem.di.service.TicketServiceImpl;

public class PropertyInjectedControllerTest {
	
	PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	void setUp() {
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.ticketService = new TicketServiceImpl();
	}
	
	
	@Test
	void sayPrice() {
		propertyInjectedController.sayPrice();
	}
	

}
