package com.cbfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfsd.repository.ShipmentsRepository;

@Service
public class ShipmentsService {

	@Autowired
	ShipmentsRepository shipmentRepository;
	
}
