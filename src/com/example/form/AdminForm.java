package com.example.form;



public class AdminForm {
	private String adminId;
	private String name;
	private String mail;
	private String pwd;
	private String rePwd;
	private String gender;
	private String roleId;

	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRePwd() {
		return rePwd;
	}
	public void setRePwd(String rePwd) {
		this.rePwd = rePwd;
	}
	@Override
	public String toString() {
		return "AdminForm [adminId=" + adminId + ", name=" + name + ", mail=" + mail + ", pwd=" + pwd + ", rePwd="
				+ rePwd + ", gender=" + gender + ", roleId=" + roleId + "]";
	}

	
}
