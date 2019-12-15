package com.appsdevloperblog.app.ws.shared.dto;

import java.io.Serializable;




public class UserDto implements Serializable{
	

	private static final long serialVersionUID = -8549608932080218534L;
	
	private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerification;
	private String emailVerificationtoken;
	private boolean emailVerificationStatus= false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVerification() {
		return emailVerification;
	}
	public void setEmailVerification(String emailVerification) {
		this.emailVerification = emailVerification;
	}
	public String getEmailVerificationtoken() {
		return emailVerificationtoken;
	}
	public void setEmailVerificationtoken(String emailVerificationtoken) {
		this.emailVerificationtoken = emailVerificationtoken;
	}
	public boolean isEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}

	
    
	
	

}
