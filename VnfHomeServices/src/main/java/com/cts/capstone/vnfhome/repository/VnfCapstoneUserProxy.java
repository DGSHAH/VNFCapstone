package com.cts.capstone.vnfhome.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.capstone.vnfhome.controller.request.GetAccountByUserId;
import com.cts.capstone.vnfhome.entity.CapstoneUser;

@FeignClient(name="CapstoneUser", url="http://localhost:8091/vnf/user/")
public interface VnfCapstoneUserProxy {
	@PostMapping (value="getAccount", produces = "application/json")
	public ResponseEntity<CapstoneUser> getAccountByUserId(@RequestBody GetAccountByUserId getAccountByUserId);
}
