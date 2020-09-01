package com.cts.capstone.vnfhome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.capstone.vnfhome.entity.VnfServiceLocation;

public interface VnfServiceLocationRepository extends JpaRepository<VnfServiceLocation, Integer>{
	List<VnfServiceLocation> findByLocation(String location);
}
