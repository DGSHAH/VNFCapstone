package com.cts.capstone.cart.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.cts.capstone.cart.controller.request.FindServiceById;
import com.cts.capstone.cart.entity.VnfServices;


@FeignClient(name="VNFservice",url="localhost:8092/vnf/services/")
public interface VnfServiceDetailsProxy {
	
	@PostMapping(value="findServiceById", produces="application/json")
	public VnfServices findServiceById(@RequestBody FindServiceById id);

}
