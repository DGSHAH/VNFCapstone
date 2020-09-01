package com.cts.capstone.cart.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.capstone.cart.controller.request.FindServiceById;
import com.cts.capstone.cart.controller.request.UserId;
import com.cts.capstone.cart.entity.CapstoneCart;
import com.cts.capstone.cart.entity.VnfServices;
import com.cts.capstone.cart.repository.VnfServiceDetailsProxy;
import com.cts.capstone.cart.service.CapstoneCartService;

@RestController
@RequestMapping("/user/Cart/")
public class CartDetailsController {
	
	@Autowired
	CapstoneCartService cartService;
	
	@Autowired
	VnfServiceDetailsProxy vnfServiceProxy;
	
	@PostMapping(value = "getCartListBycartId", produces="application/json")
	public ResponseEntity<Object> getCartList(@RequestBody UserId id){
		
		List<CapstoneCart> carts = cartService.cartListByCartId(id.getUserId());
		
		Map<Integer,VnfServices> serviceMap = new HashMap<Integer,VnfServices>();
		FindServiceById id1 = new FindServiceById();
		
		if(!carts.isEmpty()) {
			for (CapstoneCart capstoneCart : carts) {
				id1.setId(capstoneCart.getServiceID());
				serviceMap.put(capstoneCart.getSku(), vnfServiceProxy.findServiceById(id1)); 
			}
			
			return new ResponseEntity<Object>(serviceMap,HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<Object>("No product found",HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping(value = "updateOrder")
	public ResponseEntity<Object> updateOrder(@RequestBody CapstoneCart cart){
		try {
			cartService.updateByOrderId(cart);
			return new ResponseEntity<Object>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	}
	
}
