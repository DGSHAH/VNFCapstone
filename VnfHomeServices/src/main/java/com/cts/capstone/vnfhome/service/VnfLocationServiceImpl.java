package com.cts.capstone.vnfhome.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.capstone.vnfhome.repository.VnfLocationRepository;
import com.cts.capstone.vnfhome.repository.VnfServiceLocationRepository;

@Component
public class VnfLocationServiceImpl implements VnfLocationService{
	
	@Autowired
	VnfLocationRepository vnfLocationRepository;
	
	@Autowired
	VnfServiceLocationRepository vnfServiceLocationRepository;
	
	@Override
	public Set<String> getLocationList() {
		Set<String> listLocation = vnfLocationRepository.findAll().stream().map(s->s.getLocationName()).collect(Collectors.toSet());
		return listLocation;
	}

	@Override
	public List<String> getLocationsByClient(String client) {
		
		List<String> locations = vnfLocationRepository.findByClient(client).stream().map(s->s.getLocationName()).collect(Collectors.toList());
		return locations;
	}

	@Override
	public List<String> getServiceByLocation(String location) {
		List<String> services = vnfServiceLocationRepository.findByLocation(location).stream().map(s->s.getService()).collect(Collectors.toList());
		return services;
	}

	@Override
	public List<String> getServiceByClientAndLocation(String client, String location) {
		List<String>  service = vnfLocationRepository.findByClientAndLocation(client, location).stream().map(s->s.getService()).collect(Collectors.toList());
		return service;
	}

}
