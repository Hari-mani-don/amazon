package com.Google.amazon.service;

import java.util.List;

import com.Google.amazon.dto.UserDto;
import com.Google.amazon.model.UserModel;

public interface UserService {
	UserDto loginUser(UserDto userDto);
	UserDto retriveUserById(Integer id);
}
