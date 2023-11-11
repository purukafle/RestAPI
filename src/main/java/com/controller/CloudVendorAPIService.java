package com.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetail(String vendorId) {
		
		return new CloudVendor("A1","Amazon","Herndon","1234324567");
		
	}

}
