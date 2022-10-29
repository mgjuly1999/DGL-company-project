package com.example.models;
// Generated Dec 5, 2019 11:21:42 AM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private Integer roleId;
	private String roleName;
	private String code;
	private Set<Admin> admins = new HashSet<Admin>(0);

	public Role() {
	}
	public Role(Integer roleId) {
		this.roleId=roleId;
	}

	public Role(String roleName, String code) {
		this.roleName = roleName;
		this.code = code;
	}

	public Role(String roleName, String code, Set<Admin> admins) {
		this.roleName = roleName;
		this.code = code;
		this.admins = admins;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set<Admin> getAdmins() {
		return this.admins;
	}

	public void setAdmins(Set<Admin> admins) {
		this.admins = admins;
	}

}
