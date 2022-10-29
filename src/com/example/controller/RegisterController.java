package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.AddressDao;
import com.example.dao.RoleDao;
import com.example.form.LoginForm;
import com.example.form.AddressForm;
import com.example.form.AdminForm;
import com.example.form.AdminRegisterForm;
import com.example.form.CustomerRegisterForm;
import com.example.models.Admin;
import com.example.models.Role;
import com.example.service.AddressService;
import com.example.service.AdminRegisterService;
import com.example.service.AdminService;
import com.example.service.CustomerService;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class RegisterController {
	@Autowired
	public RoleDao roleDao;
	@Autowired
	public AdminService adminService;
	@Autowired
	public AddressService addressService;
	@Autowired
	private AdminRegisterService adminRegisterService;
	@Autowired
	private Prepare prepare;
	

	
	
	@RequestMapping("/newAddressPath")
	public String dispatcheNewAddress(ModelMap modelMap,
			HttpServletRequest req,HttpServletResponse resp)
	{
		if(prepare.prepareAdminHome(req, resp, modelMap))
		{
		modelMap.addAttribute("frmAddress",new AddressForm());
		return "AddressRegister";
		}else
		{
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}
		
	}
	@RequestMapping("/AddressSavepath")
	public String dispatcheAddressSave(@ModelAttribute("frmAddress")AddressForm  addressForm,ModelMap modelMap,
			HttpServletRequest req,HttpServletResponse resp)
	{
		if(prepare.prepareAdminHome(req, resp, modelMap))
		{
		addressService.addressSave(addressForm);
		modelMap.addAttribute("frmAddress",new AddressForm());
		
		return "AddressRegister";
		}else
		{
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}
		
	}
	@RequestMapping("/adminSavepath")
	public String dispatcheAdminSave(@ModelAttribute("adminForm")AdminForm myAdminForm, ModelMap modelMap,
			HttpServletRequest req,HttpServletResponse resp)
	{
	
		if(prepare.prepareAdminHome(req, resp, modelMap))
		{
		
		AdminRegisterForm myForm=new AdminRegisterForm();
		myForm.setAdminForm(myAdminForm);
		System.out.println(myForm.getAdminForm());
		adminRegisterService.prepareAdminRegister(myForm);
		modelMap.addAttribute("myRegisterForm",myForm);
		modelMap.addAttribute("adminForm",new AdminForm());
		
		return "AdminRegisterInHome";
		}else
		{
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}
		
	}
	@RequestMapping("/adminRegisterOuterPath")
	public String adminRegisterOuterPathDispatcher(ModelMap modelMap,HttpServletRequest req,HttpServletResponse resp)
	{
			
		AdminRegisterForm myForm=new AdminRegisterForm();
		adminRegisterService.prepareAdminRegister(myForm);
		modelMap.addAttribute("myRegisterForm",myForm);
		modelMap.addAttribute("adminForm",new AdminForm());
		
		return "AdminRegister";	
		
		
	}
	@RequestMapping("/adminRegisterOuterSubmit")
	public String adminRegisterOuterSubmitDispatcher(@ModelAttribute("adminForm")AdminForm myAdminForm,ModelMap modelMap,HttpServletRequest req,HttpServletResponse resp)
	{
			
		AdminRegisterForm myForm=new AdminRegisterForm();
		myForm.setAdminForm(myAdminForm);
		System.out.println(myForm.getAdminForm());
		adminRegisterService.prepareAdminRegister(myForm);
		modelMap.addAttribute("myRegisterForm",myForm);
		modelMap.addAttribute("adminForm",new AdminForm());
		LoginForm myLoginForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myLoginForm);
		return "Adminlogin";
		
		
	}
	
	@RequestMapping("/adminRegisterHomePath")
	public String dispatcheAdminRegisterHome(ModelMap modelMap,HttpServletRequest req,HttpServletResponse resp)
	{
		if(prepare.prepareAdminHome(req, resp, modelMap))
		{
			
		AdminRegisterForm myForm=new AdminRegisterForm();
		adminRegisterService.prepareAdminRegister(myForm);
		modelMap.addAttribute("myRegisterForm",myForm);
		modelMap.addAttribute("adminForm",new AdminForm());
		
		return "AdminRegisterInHome";	
		
		}else
		{
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";	
		}

	}
}
