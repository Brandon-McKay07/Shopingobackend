package com.cbfsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbfsd.service.ShipmentService;

@RestController
@RequestMapping("shipment")
public class ShipmentController {

	
	@Autowired
	ShipmentService shipmentService;
	
}
