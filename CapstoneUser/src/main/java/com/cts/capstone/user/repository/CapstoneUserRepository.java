package com.cts.capstone.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.capstone.user.entity.CapstoneUser;

public interface CapstoneUserRepository extends CrudRepository<CapstoneUser, String> {
	//...
}
