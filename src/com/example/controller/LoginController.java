package com.example.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.AddressDao;
import com.example.dao.AdminDao;
import com.example.form.HomeForm;
import com.example.form.LoginForm;
import com.example.models.Role;
import com.example.service.AdminService;
import com.example.service.HomeService;

@Controller
@Transactional
public class LoginController {
	@Autowired
	public AdminService adminService;
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/")
	public String dispatcheAdminLogin(ModelMap modelMap)
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";
		
	}
	

	@RequestMapping("/adminLoginPath")
	public String dispatcheDoAdminLogin(@ModelAttribute("frmLogin") LoginForm loginForm, ModelMap modelMap,
			HttpServletRequest request)
	{
		try {
			adminService.adminLogin(loginForm);
			if (loginForm.getAdmin() != null) {	
				HttpSession adminSession = request.getSession(true);
				adminSession.setAttribute("LoginAdmin",loginForm.getAdmin());
				HomeForm myForm=new HomeForm();
				myForm.setCurrentAdmin(loginForm.getAdmin());
				homeService.prepareHome(myForm);
				modelMap.addAttribute("myHomeForm",myForm);
				List<Role> roles= loginForm.getAdmin().getRoles().stream().collect(Collectors.toList()); 
				
					myForm.setRole(roles.get(0).getCode());
					return "home";
				
				
			} else {
				LoginForm myLoginForm=new LoginForm();
				modelMap.addAttribute("frmLogin",myLoginForm);
				return "Adminlogin";
			}
		} catch (Exception e) {
			
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			e.printStackTrace();
			return "Adminlogin";
		}
		
		
	}

}
