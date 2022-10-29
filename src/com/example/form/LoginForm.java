package com.example.form;

import com.example.models.Admin;

public class LoginForm {
	private String mail;
	private String pwd;
	private Admin admin;
	
	public LoginForm(String mail, String pwd, Admin admin) {

		this.mail = mail;
		this.pwd = pwd;
		this.admin = admin;
	}
	
	public LoginForm() {
		
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
