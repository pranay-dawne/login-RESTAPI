package com.test.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private String userId;
	@Column(name = "otp_number")
	private String otpCode;
	@Column(name = "roles")
	private String role;
	
	public LoginModel() {
		
	}
	
	public LoginModel(String userId, String otpCode, String role) {
		super();
		this.userId = userId;
		this.otpCode = otpCode;
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOtpCode() {
		return otpCode;
	}

	public void setOtpCode(String otpCode) {
		this.otpCode = otpCode;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
