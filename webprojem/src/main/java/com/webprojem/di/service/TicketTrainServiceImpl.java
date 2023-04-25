package com.webprojem.di.service;

import org.springframework.stereotype.Service;

@Service("trainTicketService")
public class TicketTrainServiceImpl implements TicketService {

	@Override
	public String sayPrice() {
		// TODO Auto-generated method stub
		return "350";
	}

	@Override
	public String getSuitableVechiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
