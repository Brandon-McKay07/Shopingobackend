package com.cbfsd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cbfsd.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{
	
	
	
	@Query("select p from Product p where p.price > :price")
	public List<Product> searchProductByPrice(int price);

	
	
}
