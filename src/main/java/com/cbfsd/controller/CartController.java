package com.cbfsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbfsd.service.CartService;

@RestController
@RequestMapping("cart")
public class CartController {

	
	@Autowired
	CartService cartService;
	
}
