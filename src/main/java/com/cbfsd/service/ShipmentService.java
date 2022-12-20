package com.cbfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfsd.repository.ShipmentRepository;

@Service
public class ShipmentService {

	@Autowired
	ShipmentRepository shipmentRepository;
	
}
