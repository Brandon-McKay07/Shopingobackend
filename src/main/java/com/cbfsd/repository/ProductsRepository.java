package com.cbfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbfsd.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

	
	
}
