package com.example.utlit;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import com.example.form.HomeForm;
import com.example.form.LoginForm;
import com.example.models.Admin;
import com.example.models.Role;
import com.example.service.HomeService;

@Repository("prepare")
public class Prepare {
	
	@Autowired
	private HomeService homeService;
public  Boolean prepareAdminHome(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	
	HttpSession adminSession = req.getSession(false);
	Admin currentAdmin=(Admin)adminSession.getAttribute("LoginAdmin");
	if (currentAdmin != null) 
		{	
			HomeForm myForm=new HomeForm();
			myForm.setCurrentAdmin(currentAdmin);
			homeService.prepareHome(myForm);
		    
			modelMap.addAttribute("myHomeForm",myForm);
			List<Role> roles= myForm.getCurrentAdmin().getRoles().stream().collect(Collectors.toList()); 
		
				myForm.setRole(roles.get(0).getCode());
			
			return true;
			
		}else
		{
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			
			return false;
		}
	}
	
}

