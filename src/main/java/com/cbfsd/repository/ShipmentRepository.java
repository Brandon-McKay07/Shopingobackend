package com.cbfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbfsd.entity.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment,  Integer>{

}
