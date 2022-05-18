package com.wecare.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coach")
public class CoachEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="coach_id")
	Integer coachId;
	String name;
	String gender;
    @Column(name="date_of_birth")
	LocalDate dateOfBirth;
	String password;
    @Column(name="mobile_number")
	Long mobileNumber;
    String speciality;
    
    public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getSpeciality() {
		return speciality;
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
	@Override
	public String toString() {
		return "CoachEntity [coachId=" + coachId + ", name=" + name + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", password=" + password + ", mobileNumber=" + mobileNumber + "]";
	}

}
