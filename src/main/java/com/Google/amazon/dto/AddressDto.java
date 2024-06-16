package com.Google.amazon.dto;

public class AddressDto {
	private Integer addressId;
	private String street;
	private String country;
	private String city;
	private Integer postalCode;
	private Integer profileId;

	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressDto(Integer addressId, String street, String country, String city, Integer postalCode,
			Integer profileId) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		this.profileId = profileId;
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

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	@Override
	public String toString() {
		return "AddressDto [addressId=" + addressId + ", street=" + street + ", country=" + country + ", city=" + city
				+ ", postalCode=" + postalCode + ", profileId=" + profileId + "]";
	}

}
