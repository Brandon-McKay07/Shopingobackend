package com.cbfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfsd.repository.OrderitemRepository;

@Service
public class OrderitemService {

	
	@Autowired
	OrderitemRepository orderitemRepository;
	
}
