package com.Google.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.UserDto;
import com.Google.amazon.model.UserModel;
import com.Google.amazon.repository.UserRepository;

@Service
public class RegistrationServiceImpl
		implements RegistrationService, DataTransferEntityToDtoService<UserModel, UserDto> {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto registerUser(UserDto userDto) {

		UserModel userModel = new UserModel(userDto.getUsername(), userDto.getUserEmail(), userDto.getUserPassword(),
				userDto.getProfileModel(), userDto.getOrders(), userDto.getReviews(), userDto.getCartItems());

		userRepository.save(userModel);

		return convertEntityToDto(userModel);
	}

	@Override
	public UserDto convertEntityToDto(UserModel user) {

		return new UserDto(user.getUserId(), user.getUsername(), user.getUserEmail(), user.getUserPassword(),
				user.getProfileModel(), user.getOrders(), user.getReviews(), user.getCartItems());
	}

}
