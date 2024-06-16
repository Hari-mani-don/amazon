package com.Google.amazon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.ProfileDto;
import com.Google.amazon.exception.ResourceNotFoundException;
import com.Google.amazon.model.ProfileModel;
import com.Google.amazon.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService, DataTransferEntityToDtoService<ProfileModel, ProfileDto> {

	@Autowired
	ProfileRepository profileRepository;

	@Override
	public ProfileDto updateProfile(ProfileDto profileDto) {

		ProfileModel profileModel = Optional.ofNullable(profileRepository.findByProfileId(profileDto.getProfileId()))
				.orElseThrow(() -> new ResourceNotFoundException("User Not found"));

		profileModel.setPhoneNumber(profileDto.getPhoneNumber());
		profileModel.setAddresses(profileDto.getAddresses());

		return convertEntityToDto(profileModel);
	}

	@Override
	public ProfileDto convertEntityToDto(ProfileModel profileModel) {

		return new ProfileDto(profileModel.getProfileId(), profileModel.getPhoneNumber(),
				profileModel.getUser().getUserId(), profileModel.getAddresses());
	}

}
