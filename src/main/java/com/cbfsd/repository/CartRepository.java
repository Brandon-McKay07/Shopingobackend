package com.cbfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbfsd.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
