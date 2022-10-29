package com.example.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.AdminDao;
import com.example.form.LoginForm;
import com.example.form.AdminForm;
import com.example.form.AdminRegisterForm;
import com.example.models.Admin;
import com.example.models.Role;


@Service
@Repository("adminService")
public class AdminService {

	@Autowired
	public AdminDao adminDao;
	
	
	public void adminLogin(LoginForm myForm)
	{
		myForm.setAdmin(adminDao.getAdminByMailAndPassword(myForm.getMail(),myForm.getPwd()));
		
	}


	
}
