package com.wecare.DTO;

import java.time.LocalDate;

import com.wecare.entity.BookEntity;



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
	public static BookDTO changeTo(BookEntity entity) {
		BookDTO dto = new BookDTO();
		dto.setBookingId(entity.getBookingId());
		dto.setSlot(entity.getSlot());
		dto.setAppointmentDate(entity.getAppointmentDate());
		dto.setCoachId(entity.getCoachId());
		dto.setUserId(entity.getUserId());
		return dto;
	}
	public static BookEntity change(BookDTO dto) {
		BookEntity entity = new BookEntity();
		entity.setBookingId(dto.getBookingId());
		entity.setSlot(dto.getSlot());
		entity.setAppointmentDate(dto.getAppointmentDate());
		entity.setCoachId(dto.getCoachId());
		entity.setUserId(dto.getUserId());
		return entity;
	}
	
	
	
}
