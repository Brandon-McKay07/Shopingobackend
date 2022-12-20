package com.cbfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbfsd.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

}
