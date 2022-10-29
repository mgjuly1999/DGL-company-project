package com.example.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.AddressDao;
import com.example.form.CustomerRegisterForm;
import com.example.form.LoginForm;
import com.example.service.CustomerService;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class CustomerTableController {
	@Autowired
    private Prepare prepare;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private AddressDao addressDao;
@RequestMapping("/customerTablePath")
public String dispatcheCustomerTable(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{

	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
	CustomerRegisterForm	myForm=new CustomerRegisterForm();
		customerService.getCustomers(myForm);
		modelMap.addAttribute("frmCustomerList",myForm.getFrmCustomers());
		modelMap.addAttribute("addList",addressDao.getAddress());
	return "customerTable";
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";
	}
	
}


}
