package com.cts.capstone.cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.capstone.cart.entity.CapstoneCart;

public interface CapstoneCartRepository extends JpaRepository<CapstoneCart, Integer> {
	
	List<CapstoneCart> findAllByuserId(String userId);

}
