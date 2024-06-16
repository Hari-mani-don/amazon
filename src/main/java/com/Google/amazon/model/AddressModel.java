package com.Google.amazon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AddressModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String street;
	private String country;
	private String city;
	private Integer postalCode;

	@ManyToOne
	@JoinColumn(name = "profile_id", referencedColumnName = "profile_id")
	@JsonIgnore
	private ProfileModel profile;

	public AddressModel() {
		super();
	}

	public AddressModel(Integer addressId, String street, String country, String city, Integer postalCode,
			ProfileModel profile) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		this.profile = profile;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public ProfileModel getProfile() {
		return profile;
	}

	public void setProfile(ProfileModel profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "AddressModel [addressId=" + addressId + ", street=" + street + ", country=" + country + ", city=" + city
				+ ", postalCode=" + postalCode + ", profile=" + profile + "]";
	}

}
