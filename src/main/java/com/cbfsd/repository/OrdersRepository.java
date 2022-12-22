package com.cbfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbfsd.entity.Order;

public interface OrdersRepository extends JpaRepository<Order , Integer> {

}
