package com.Google.amazon.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.UserDto;
import com.Google.amazon.exception.ResourceNotFoundException;
import com.Google.amazon.exception.UnauthorizedAccessException;
import com.Google.amazon.model.UserModel;
import com.Google.amazon.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService, DataTransferEntityToDtoService<UserModel, UserDto> {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto loginUser(UserDto userDto) {

		Objects.requireNonNull(userDto.getUserEmail(), "email is null");
		Objects.requireNonNull(userDto.getUserPassword(), "password is null ");

		UserModel optionalUserModel = Optional.ofNullable(
				userRepository.findByUserEmailAndUserPassword(userDto.getUserEmail(), userDto.getUserPassword()))
				.orElseThrow(() -> new ResourceNotFoundException("User not found"));

		if (!((userDto.getUserEmail().equals(optionalUserModel.getUserEmail()) || userDto.getProfileModel()
				.getPhoneNumber().equals(optionalUserModel.getProfileModel().getPhoneNumber()))
				&& userDto.getUserPassword().equals(optionalUserModel.getUserPassword()))) {
			throw new UnauthorizedAccessException("access denied");
		}

		return convertEntityToDto(optionalUserModel);
	}

	/**
	 * Converts an entity to a Data Transfer Object (DTO).
	 *
	 * @param entity the entity to convert
	 * @return the converted DTO
	 */

	@Override
	public UserDto convertEntityToDto(UserModel user) {

		return new UserDto(user.getUserId(), user.getUsername(), user.getUserEmail(), user.getUserPassword(),
				user.getProfileModel(), user.getOrders(), user.getReviews(), user.getCartItems());

	}
	
	@Override
	public UserDto retriveUserById(Integer id) {

		UserModel userModel = new UserModel();
		userModel.setUserId(id);

		UserModel retriveUser = userRepository.findByUserId(userModel.getUserId());

		return convertEntityToDto(retriveUser);
	}

}
