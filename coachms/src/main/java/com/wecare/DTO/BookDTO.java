package com.wecare.DTO;

import java.time.LocalDate;



public class BookDTO {
	Integer bookingId;
	Integer userId;
	Integer coachId;
	LocalDate appointmentDate;
	String slot;
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCoachId() {
		return coachId;
	}
	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	@Override
	public String toString() {
		return "BookDTO [bookingId=" + bookingId + ", userId=" + userId + ", coachId=" + coachId + ", appointmentDate="
				+ appointmentDate + ", slot=" + slot + "]";
	}
	
	
	
}
