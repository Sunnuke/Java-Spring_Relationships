package com.practice.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.relationships.models.License;
import com.practice.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	
	@Autowired
	private LicenseRepository licenseRepository;
	
//	RETRIEVE
	public List<License> allLicenses(){
		return licenseRepository.findAll();
	}
	
	
	public License findLicense(Long id) {
		Optional<License> optionalLicense = licenseRepository.findById(id);
		if (optionalLicense.isPresent()) {
			return optionalLicense.get();
		}
		else {
			return null;
		}

	}
	
//	CREATE
	public License createLicense(License license) {
		return licenseRepository.save(license);
		
	}
}
