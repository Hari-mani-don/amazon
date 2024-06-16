package com.Google.amazon.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
	UserModel findByUserEmailAndUserPassword(String userEmail, String userPassword);
	UserModel findByUserId(Integer id);
}
