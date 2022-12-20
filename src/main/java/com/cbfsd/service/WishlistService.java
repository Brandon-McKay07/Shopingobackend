package com.cbfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfsd.repository.WishlistRepository;

@Service
public class WishlistService {

	
	@Autowired
	WishlistRepository wishlistRepository;
	
}
