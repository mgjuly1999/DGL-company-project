package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.AddressDao;
import com.example.dao.CustomerDao;
import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.AddWaterLitterForm;
import com.example.form.CustomerRegisterForm;
import com.example.form.LoginForm;
import com.example.form.RequireStorePerLitterForm;
import com.example.form.StoreForm;
import com.example.form.StorePerLitterForm;
import com.example.form.WaterLitterForm;
import com.example.models.Admin;
import com.example.models.Customer;
import com.example.models.StorePerLitter;
import com.example.service.AddWaterLitterService;
import com.example.service.CustomerService;
import com.example.service.StorePerLitterService;
import com.example.service.StoreService;
import com.example.utlit.Prepare;



@Controller
@Transactional
public class AddWaterLitterController {
	@Autowired
    private Prepare prepare;
	@Autowired
	private AddWaterLitterService addWaterLitterService;
	

	  
@RequestMapping("/AddWaterLitter")
public String dispatcheShowAllRubberInfo(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
		AddWaterLitterForm addWaterLitterForm=new AddWaterLitterForm();
		addWaterLitterForm.setAddressId(req.getParameter("addressId"));
		addWaterLitterService.prepareAddWaterLitter(addWaterLitterForm);
		modelMap.addAttribute("waterLitterForm",addWaterLitterForm);
		if(addWaterLitterForm.getCustomers().size()==0)
		{
			return "home";
		}else{
			return "AddWaterLitterCustomerGroupByAddress";
		}
		
		
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";
	}
	
	
}
	

@RequestMapping("/toInsertWaterLitterPath")
public String insertLitterDispatcher(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
		AddWaterLitterForm addWaterLitterForm=new AddWaterLitterForm();
		addWaterLitterForm.setCustomerId(req.getParameter("customerId"));
		addWaterLitterService.prepareAddWaterLitter(addWaterLitterForm);
		modelMap.addAttribute("waterLitterForm",addWaterLitterForm);
	
		if(addWaterLitterForm.getStores()==null||addWaterLitterForm.getStores().isEmpty())
		{
			
			if(addWaterLitterForm.getCustomers().size()==0)
			{
			return "home";	
			}else
			{
			return "AddWaterLitterCustomerGroupByAddress";
			}
		}else
		{
			return "AddWaterLitter";
		}
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";	
	}
	
}
@RequestMapping("/AddSingleWaterLitter")
public String addSingleLitterDispatcher(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
		
		String storeId=req.getParameter("storeId");
		
		AddWaterLitterForm addWaterLitterForm=new AddWaterLitterForm();
		addWaterLitterForm.setStoreId(storeId);
		addWaterLitterService.prepareAddWaterLitter(addWaterLitterForm);
		modelMap.addAttribute("waterLitterForm",addWaterLitterForm);
		modelMap.addAttribute("updateWaterLitterForm",new WaterLitterForm());
		
		
		if(addWaterLitterForm.getStores()==null||
		addWaterLitterForm.getStores().isEmpty())
		{
			if(addWaterLitterForm.getStores().size()==0)
			{
			return "home";	
			}else
			{
			return "AddWaterLitterCustomerGroupByAddress";
			}
		}else
		{
			return "AddWaterLitter";
		}
	
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";	
	}
	
}

@RequestMapping("/updateWaterLitterPath")
public String updateLitterDispatcher(@ModelAttribute("updateWaterLitterForm")WaterLitterForm  waterLitterForm,HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{

	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
		HttpSession adminSession = req.getSession(false);
		Admin currentAdmin=(Admin)adminSession.getAttribute("LoginAdmin");
		
		AddWaterLitterForm addWaterLitterForm=new AddWaterLitterForm();
		addWaterLitterForm.setWaterLitterForm(waterLitterForm);
		addWaterLitterForm.getWaterLitterForm().setAdmin(currentAdmin);
		addWaterLitterService.prepareAddWaterLitter(addWaterLitterForm);
		modelMap.addAttribute("waterLitterForm",addWaterLitterForm);
		modelMap.addAttribute("updateWaterLitterForm",null);
		
		
		
		if(addWaterLitterForm.getStores()==null||addWaterLitterForm.getStores().isEmpty())
		{
			if(addWaterLitterForm.getCustomers().size()==0)
			{
			return "home";	
			}else
			{
			return "AddWaterLitterCustomerGroupByAddress";
			}
		}else
		{
			return "AddWaterLitter";
		}
		
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";	
	}
	
}



}
