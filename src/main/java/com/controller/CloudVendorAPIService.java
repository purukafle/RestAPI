package com.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {
	CloudVendor cloudVendor;

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetail(String vendorId) {

		return new CloudVendor("A1", "Amazon", "Herndon", "1234324567");

	}

	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Success fullly created a cloud vendor";

	}
	public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor=cloudVendor;
		return "successfully updated";
	}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor=null;
		return "successfully deleted";
		
	}

}
