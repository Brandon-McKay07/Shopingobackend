package com.cbfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbfsd.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	
}
