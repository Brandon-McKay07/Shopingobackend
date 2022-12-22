package com.cbfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfsd.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository orderRepository;
	
}
