package com.cbfsd.repository;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;



//@Repository * Remember B it Wouldn't let me put this if it doesn't connect


public interface AdminRepository  extends JpaRepository<Admin, Integer>{

}
