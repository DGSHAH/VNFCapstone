package com.cts.capstone.vnfhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.capstone.vnfhome.controller.request.GetAccountByUserId;
import com.cts.capstone.vnfhome.controller.request.GetUserTopologiesDetails;
import com.cts.capstone.vnfhome.controller.response.ClientVnfDetailsResponse;
import com.cts.capstone.vnfhome.entity.CapstoneUser;
import com.cts.capstone.vnfhome.repository.VnfCapstoneUserProxy;
import com.cts.capstone.vnfhome.service.VnfLocationService;

@RestController
@RequestMapping("/vnf/home")
public class VnfHomeController {
	
	@Autowired
	VnfLocationService vnfLocationService;
	
	@Autowired
	VnfCapstoneUserProxy vnfCapstoneUserProxy;
	
	@GetMapping("/locations")
	public ResponseEntity<Object> getAllLocation(){
		return new ResponseEntity<Object>(vnfLocationService.getLocationList(),HttpStatus.OK);
	}
	
	@GetMapping("/locationByClient/{client}")
	public ResponseEntity<Object> getLocationsByClient(@PathVariable String client){
		return new ResponseEntity<Object>(vnfLocationService.getLocationsByClient(client),HttpStatus.OK);
	}
	
	@GetMapping("/ServicesProvidedByLocation/{location}")
	public ResponseEntity<Object> getTopologiesByLocation(@PathVariable String location){
		return new ResponseEntity<Object>( vnfLocationService.getServiceByLocation(location),HttpStatus.OK);
	}
	
	@PostMapping(value="searchByUserId&Location", produces="application/json")
	public ResponseEntity<Object> getUserTopologiesDetails(@RequestBody GetUserTopologiesDetails userLocation){
		
		GetAccountByUserId userId = new GetAccountByUserId();
		userId.setUser(userLocation.getUserId());
		
		ResponseEntity<CapstoneUser> userResponse = vnfCapstoneUserProxy.getAccountByUserId(userId);
		CapstoneUser user =  userResponse.getBody();
		
		ClientVnfDetailsResponse response = new ClientVnfDetailsResponse();
		response.setUser(user);
		response.setAvailableServices(vnfLocationService.getServiceByLocation(userLocation.getLocation()));
		response.setInstalledServices(vnfLocationService.getServiceByClientAndLocation(user.getFirstName(), userLocation.getLocation()));
		
		return new ResponseEntity<Object>(response,HttpStatus.OK);
		
	}
}
