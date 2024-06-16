package com.Google.amazon.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class ProfileModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profile_id")
	private Integer profileId;
	private Long phoneNumber;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	@JsonIgnore
	private UserModel user;

	@OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<AddressModel> addresses;

	public ProfileModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfileModel(Integer profileId, Long phoneNumber, UserModel user, List<AddressModel> addresses) {
		super();
		this.profileId = profileId;
		this.phoneNumber = phoneNumber;
		this.user = user;
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

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public List<AddressModel> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressModel> addresses) {
		this.addresses = addresses;

	}

	@Override
	public String toString() {
		return "ProfileModel [profileId=" + profileId + ", phoneNumber=" + phoneNumber + ", user=" + user
				+ ", addresses=" + addresses + "]";
	}

}
