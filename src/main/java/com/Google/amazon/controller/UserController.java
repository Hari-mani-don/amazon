package com.Google.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.UserDto;
import com.Google.amazon.model.UserModel;
import com.Google.amazon.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/auth/login")
	public ResponseEntity<UserDto> loginUser(@RequestBody UserDto userDto) {

		UserDto loginUserDto = userService.loginUser(userDto);
		return ResponseEntity.ok(loginUserDto);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<UserDto> handleRetriveUserById(@PathVariable Integer id) {
		UserDto retriveById = userService.retriveUserById(id);
		return new ResponseEntity<UserDto>(retriveById, HttpStatus.OK);
	}

}
