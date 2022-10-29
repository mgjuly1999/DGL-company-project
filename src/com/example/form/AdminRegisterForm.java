package com.example.form;

import java.util.List;
import java.util.Map;

import com.example.form.AdminForm;
import com.example.models.Admin;
import com.example.models.Role;

public class AdminRegisterForm {
private Map<Integer,String> frmRoles;
private AdminForm adminForm=null;
private Admin admin=null;
private List<Admin> admins;
private List<Role> roles;

public AdminRegisterForm()
{
this.adminForm=null;
this.admin=null;
}


public AdminForm getAdminForm() {
	return adminForm;
}

public void setAdminForm(AdminForm adminForm) {
	this.adminForm = adminForm;
}

public Admin getAdmin() {
	return admin;
}

public void setAdmin(Admin admin) {
	this.admin = admin;
}

public List<Admin> getAdmins() {
	return admins;
}

public void setAdmins(List<Admin> admins) {
	this.admins = admins;
}


public Map<Integer, String> getFrmRoles() {
	return frmRoles;
}


public void setFrmRoles(Map<Integer, String> frmRoles) {
	this.frmRoles = frmRoles;
}


public List<Role> getRoles() {
	return roles;
}


public void setRoles(List<Role> roles) {
	this.roles = roles;
}
}
