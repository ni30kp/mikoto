package com.wecare.DTO;

public class LoginDTO {
	
	private Integer id;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDTO [userId=" + id + ", password=" + password + "]";
	}
	
}
