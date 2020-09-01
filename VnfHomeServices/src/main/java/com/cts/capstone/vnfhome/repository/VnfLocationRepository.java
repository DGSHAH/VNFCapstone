package com.cts.capstone.vnfhome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.capstone.vnfhome.entity.VnfLocations;

public interface VnfLocationRepository extends JpaRepository<VnfLocations, String> {
	
	List<VnfLocations> findByClient(String client);
	List<VnfLocations> findByClientAndLocation(String client, String location);

}
