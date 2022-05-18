package com.wecare.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.wecare.entity.UserEntity;






public class UserDTO {
	private Integer userId;
	private String name;
	private String gender;
	private LocalDate dateOfBirth;
	private String password;
	private Long mobileNumber;
	private String email;
	private Integer pincode;
	private String city;
	private String state;
	private String country;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public static UserDTO changeTo(UserEntity entity) {
		UserDTO dto = new UserDTO();
		dto.setCity(entity.getCity());
		dto.setCountry(entity.getCountry());
		dto.setDateOfBirth(entity.getDateOfBirth());
		dto.setEmail(entity.getEmail());
		dto.setGender(entity.getGender());
		dto.setMobileNumber(entity.getMobileNumber());
		dto.setName(entity.getName());
		dto.setPassword(entity.getPassword());
		dto.setPincode(entity.getPincode());
		dto.setState(entity.getState());
		dto.setUserId(entity.getUserId());
		return dto;
	}
	public static UserEntity change(UserDTO dto) {
		UserEntity entity = new UserEntity();
		entity.setCity(dto.getCity());
		entity.setCountry(dto.getCountry());
		entity.setDateOfBirth(dto.getDateOfBirth());
		entity.setEmail(dto.getEmail());
		entity.setGender(dto.getGender());
		entity.setMobileNumber(dto.getMobileNumber());
		entity.setName(dto.getName());
		entity.setPassword(dto.getPassword());
		entity.setPincode(dto.getPincode());
		entity.setState(dto.getState());
		entity.setUserId(dto.getUserId());
		return entity;
	}
	
}
