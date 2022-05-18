package com.wecare.DTO;

import java.time.LocalDate;

import com.wecare.entity.CoachEntity;


public class CoachDTO {

	Integer coachId;
	String name;
	String gender;
	LocalDate dateOfBirth;
	String password;
	Long mobileNumber;
	String speciality;
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public Integer getCoachId() {
		return coachId;
	}
	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
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

	public static CoachDTO changeTo(CoachEntity entity) {
		CoachDTO dto = new CoachDTO();
		dto.setDateOfBirth(entity.getDateOfBirth());
		dto.setGender(entity.getGender());
		dto.setMobileNumber(entity.getMobileNumber());
		dto.setName(entity.getName());
		dto.setPassword(entity.getPassword());
		dto.setCoachId(entity.getCoachId());
		dto.setSpeciality(entity.getSpeciality());
		return dto;
	}
	public static CoachEntity change(CoachDTO dto) {
		CoachEntity entity = new CoachEntity();
		entity.setDateOfBirth(dto.getDateOfBirth());
		entity.setGender(dto.getGender());
		entity.setMobileNumber(dto.getMobileNumber());
		entity.setName(dto.getName());
		entity.setPassword(dto.getPassword());
		entity.setCoachId(dto.getCoachId());
		entity.setSpeciality(dto.getSpeciality());
		return entity;
	}
	
	
	
}
