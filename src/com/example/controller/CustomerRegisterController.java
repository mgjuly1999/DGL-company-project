package com.example.controller;

import java.util.HashMap;
import java.util.List;
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
import com.example.dao.CustomerDao;
import com.example.dao.RoleDao;
import com.example.form.CustomerRegisterForm;
import com.example.form.LoginForm;
import com.example.models.Address;
import com.example.models.Role;
import com.example.service.CustomerService;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class CustomerRegisterController {
	@Autowired
	private Prepare prepare;
	@Autowired
	private AddressDao addressDoa;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerDao customerDao;

	@RequestMapping("/customerRegister")
	public String dispatcheCustomerRegister(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			Map<Integer, String> address = new HashMap<Integer, String>();
			List<Address> l = addressDoa.getAddress();
			System.out.println(l);
			for (Address a : l) {
				address.put(a.getAddressId(), a.getAddress());
			}
			modelMap.addAttribute("frmCustomerList", customerDao.getCustomers());
			modelMap.addAttribute("addList", addressDoa.getAddress());
			modelMap.addAttribute("frmAddress", address);
			modelMap.addAttribute("frmCustomer", new CustomerRegisterForm());
			return "CustomerRegister";
		} else {
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			return "Adminlogin";
		}
	}

	@RequestMapping("/customerSavepath")
	public String dispatcheCustomerSave(@ModelAttribute("frmCustomer") CustomerRegisterForm myForm,
			HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			customerService.customerSave(myForm);

			Map<Integer, String> address = new HashMap<Integer, String>();
			for (Address a : addressDoa.getAddress()) {
				address.put(a.getAddressId(), a.getAddress());
			}

			modelMap.addAttribute("frmCustomerList", customerDao.getCustomers());
			modelMap.addAttribute("addList", addressDoa.getAddress());

			modelMap.addAttribute("frmAddress", address);
			modelMap.addAttribute("frmCustomer", new CustomerRegisterForm());

			return "CustomerRegister";
		} else {
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}
	}
}
