package com.Google.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.ProfileModel;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileModel, Integer> {
	ProfileModel findByProfileId(Integer profileId);
}
