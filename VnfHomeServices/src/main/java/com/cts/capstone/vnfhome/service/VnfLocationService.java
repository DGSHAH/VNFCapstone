package com.cts.capstone.vnfhome.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.cts.capstone.vnfhome.entity.VnfLocations;

@Service
public interface VnfLocationService {

	Set<String> getLocationList();
	List<String> getLocationsByClient(String client);
	List<String> getServiceByLocation(String location);
	List<String> getServiceByClientAndLocation(String client, String location);
}
