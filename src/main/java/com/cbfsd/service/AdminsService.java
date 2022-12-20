package com.cbfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfsd.repository.AdminsRepository;

@Service
public class AdminsService {

	@Autowired
	AdminsRepository adminRepository;
	
}
