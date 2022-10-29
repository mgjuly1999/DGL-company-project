package com.example.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.LoginForm;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class HomeController {
	@Autowired
	private Prepare prepare;
	@RequestMapping("/homePath")
public String homeDispatcher(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
		if (prepare.prepareAdminHome(req, resp, modelMap)) 
		{
			return "home";
		}else
		{
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			return "Adminlogin";
		}
	
}
}
