package com.backend.dto;
public class UpdateUserDTO {
    private String email;   // Use this to identify the user
    private String name;
    private String phone;
	public UpdateUserDTO(String email, String name, String phone) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

    // Getters and Setters
}