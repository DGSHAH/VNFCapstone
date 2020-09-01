package com.cts.capstone.vnf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.capstone.vnf.controller.request.FindServiceById;
import com.cts.capstone.vnf.controller.request.FindServiceByName;
import com.cts.capstone.vnf.entity.VnfDetails;
import com.cts.capstone.vnf.service.VnfDetailsServices;

@RestController
@RequestMapping("/vnf/services")
public class VnfDetailsController {
	
	@Autowired
	VnfDetailsServices vnfDetailServices;
	
	@GetMapping("getAllServices")
	public ResponseEntity<Object> getAllServices(){
		return new ResponseEntity<Object>(vnfDetailServices.allServices(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping(value="findServiceById", produces="application/json")
	public VnfDetails findServiceById(@RequestBody FindServiceById id) {
		return  vnfDetailServices.serviceById(id.getId());
		
	}
	
	@PostMapping(value="findServiceByName", produces="application/json")
	public ResponseEntity<Object> findServiceByName(@RequestBody FindServiceByName name) {
		List<VnfDetails> vnfDetails =  vnfDetailServices.serviceByName(name.getServiceNamel());
		return new ResponseEntity<Object>(vnfDetails,HttpStatus.ACCEPTED);	
	}
}
