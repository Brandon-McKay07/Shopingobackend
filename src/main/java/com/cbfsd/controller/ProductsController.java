package com.cbfsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbfsd.service.ProductsService;

@RestController
@RequestMapping("product")
public class ProductsController {

	@Autowired
	ProductsService productService;
	
}
