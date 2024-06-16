package com.Google.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.ProfileDto;
import com.Google.amazon.service.ProfileService;

@RestController
public class ProfileController {

	@Autowired
	ProfileService profileService;

	@PostMapping("/users/profiles")
	public ResponseEntity<ProfileDto> handelUpdateProfile(@RequestBody ProfileDto profileDto) {
		ProfileDto updateProfile = profileService.updateProfile(profileDto);
		return new ResponseEntity<ProfileDto>(updateProfile, HttpStatus.OK);
	}

}
