package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.LoginForm;



@Controller
@Transactional
public class LogOutController {
	@RequestMapping("/logoutPath")
	public String logoutDispatcher(HttpServletRequest request,ModelMap modelMap)
	{
		HttpSession session=request.getSession(false);
		session.setMaxInactiveInterval(0);
		session.removeAttribute("LoginAdmin");
		session.invalidate();
		
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		
		return "Adminlogin";
		
		
	}
}
