package com.cbfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfsd.repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	ProductRepository productRepsoitory;
	
}
