package com.cbfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfsd.repository.CategroryRepository;

@Service
public class CategoryService {

	@Autowired
	CategroryRepository categoryRepository;
	
}
