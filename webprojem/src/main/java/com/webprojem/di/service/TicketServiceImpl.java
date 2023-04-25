package com.webprojem.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TicketServiceImpl implements TicketService {

	@Override
	public String sayPrice() {
		return "1500";
	}

	@Override
	public String getSuitableVechiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
