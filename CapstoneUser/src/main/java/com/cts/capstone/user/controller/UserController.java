package com.cts.capstone.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.capstone.user.controller.request.LoginUser;
import com.cts.capstone.user.controller.request.GetAccountByUserId;
import com.cts.capstone.user.entity.CapstoneUser;
import com.cts.capstone.user.service.CapstoneUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
@RequestMapping("/vnf/user")
public class UserController {
	
	@Autowired
	private CapstoneUserService capstoneUserService;
	ObjectMapper objectMapper = new ObjectMapper();
	
	//Login service
	@PostMapping (value="login", produces="application/json")
	public ResponseEntity<Object> loginUser(@RequestBody LoginUser loginUser){
		
		if(capstoneUserService.loginUser(loginUser.getUserId(), loginUser.getPassword())) {
			return new ResponseEntity<Object>(HttpStatus.ACCEPTED);
		}
		 
		return new ResponseEntity<Object>(HttpStatus.UNAUTHORIZED);
	}
	
	//register service
	@PostMapping (value="register", produces = "application/json")
	public ResponseEntity<Object> registerUser(@RequestBody CapstoneUser user) throws JsonMappingException, JsonProcessingException{
		
		capstoneUserService.addCapstoneUser(user);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
}
	
	//Get Account Service
	@PostMapping (value="getAccount", produces = "application/json")
	public ResponseEntity<CapstoneUser> getAccountByUserId(@RequestBody GetAccountByUserId getAccountByUserId){
		
		CapstoneUser userCheck = capstoneUserService.getUserById(getAccountByUserId.getUser());
		
		if(!userCheck.getEmail().isEmpty()) {	
			return new ResponseEntity<CapstoneUser>(userCheck,HttpStatus.OK);
		}
		return new ResponseEntity<CapstoneUser>(HttpStatus.NOT_FOUND);
	}
	
	//Update Account Service
	@PostMapping (value="updateUser", produces = "application/json")
	public ResponseEntity<Object> updateUser(@RequestBody CapstoneUser user){
		
		
		if(capstoneUserService.updateAccountByUserId(user)) {	
			return new ResponseEntity<Object>(HttpStatus.CREATED);
		}
		 return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	}
}
