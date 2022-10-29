package com.example.service;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.form.AdminForm;
import com.example.form.AdminRegisterForm;
import com.example.dao.AdminDao;
import com.example.dao.RoleDao;
import com.example.models.Admin;
import com.example.models.Role;

@Service
@Repository("adminRegisterService")
public class AdminRegisterService {
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private AdminDao adminDao;
public void prepareAdminRegister(AdminRegisterForm myForm)
{
	if(myForm.getAdminForm()!=null)
	{
		this.adminSave(myForm);
	}
	myForm.setAdminForm(new AdminForm());
	myForm.setAdmins(adminDao.getAdmin());
	myForm.setRoles(roleDao.getRole());
	Map<Integer,String> adminRole=new HashMap<Integer,String>();
	for(Role r : roleDao.getRole())
	{
		adminRole.put(r.getRoleId(),r.getRoleName());
	}
	
	myForm.setFrmRoles(adminRole);
	

}
public void adminSave(AdminRegisterForm myForm)
{
	Admin admin=new Admin();
	admin.setName(myForm.getAdminForm().getName());
	admin.setMail(myForm.getAdminForm().getMail());
	admin.setPwd(myForm.getAdminForm().getPwd());
	admin.setGender(myForm.getAdminForm().getGender());
	admin.setCreateDate(new Date());
	Set<Role> roles = new HashSet<Role>(0);
	
	System.out.println(myForm.getAdminForm());
	
	roles.add(new Role(Integer.parseInt(myForm.getAdminForm().getRoleId())));
	admin.setRoles(roles);

	myForm.setAdmin(adminDao.saveAdmin(admin));
	
}
}
