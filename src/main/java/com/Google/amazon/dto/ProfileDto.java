package com.Google.amazon.dto;

import java.util.List;

import com.Google.amazon.model.AddressModel;

public class ProfileDto {
	private Integer profileId;
	private Long phoneNumber;
	private Integer userId;
	private List<AddressModel> addresses;

	public ProfileDto() {
		super();
	}

	public ProfileDto(Integer profileId, Long phoneNumber, Integer userId, List<AddressModel> addresses) {
		super();
		this.profileId = profileId;
		this.phoneNumber = phoneNumber;
		this.userId = userId;
		this.addresses = addresses;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<AddressModel> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressModel> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "ProfileDto [profileId=" + profileId + ", phoneNumber=" + phoneNumber + ", userId=" + userId
				+ ", addresses=" + addresses + "]";
	}

}
