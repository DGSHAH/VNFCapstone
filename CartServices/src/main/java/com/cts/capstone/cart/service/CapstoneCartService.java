package com.cts.capstone.cart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.capstone.cart.entity.CapstoneCart;

@Service
public interface CapstoneCartService  {
	
	List<CapstoneCart> cartListByCartId(String cartId);
	boolean updateByOrderId(CapstoneCart cart);
	boolean checkoutCartById();
	

}
