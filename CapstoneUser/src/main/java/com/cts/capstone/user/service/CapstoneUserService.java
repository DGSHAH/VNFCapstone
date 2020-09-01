package com.cts.capstone.user.service;

import org.springframework.stereotype.Service;
import com.cts.capstone.user.entity.CapstoneUser;

@Service
public interface CapstoneUserService{
	
	boolean addCapstoneUser(CapstoneUser user);
	boolean loginUser(String userId, String password);
	boolean updateAccountByUserId(CapstoneUser user);
	CapstoneUser getUserById(String userId);

}
