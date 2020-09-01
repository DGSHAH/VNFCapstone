package com.cts.capstone.user.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.capstone.user.entity.CapstoneUser;
import com.cts.capstone.user.repository.CapstoneUserRepository;

@Component
@Transactional
public class CapstoneUserServiceImpl implements CapstoneUserService {

	@Autowired
	private CapstoneUserRepository capstoneUserRepository;
	
	@PersistenceContext
	EntityManager entityManger;

	@Override
	public boolean addCapstoneUser(CapstoneUser user) {
		
			capstoneUserRepository.save(user);
			System.out.println(user.getLastName());
			return true;
	
	}

	@Override
	public boolean loginUser(String userId, String password) {
		
		CapstoneUser user = new CapstoneUser();
		
		user = entityManger.find(CapstoneUser.class, userId);
		
		if(password.equals(user.getPassword())) {
			return true;
		}
		
		return false;
		
	}

	@Override
	public boolean updateAccountByUserId(CapstoneUser user) {
		try {
			capstoneUserRepository.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public CapstoneUser getUserById(String userId) {
		return entityManger.find(CapstoneUser.class, userId);
	} 
	
	
}
