package com.example.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import com.example.form.AddressPerGroupCustomersForm;
import com.example.form.BuyForm;
import com.example.form.BuyRubberPoundForm;
import com.example.form.CustomerRegisterForm;
import com.example.form.LoginForm;
import com.example.form.StorePerLitterForm;
import com.example.models.Admin;
import com.example.models.Customer;

import com.example.service.AddRubberPoundService;
import com.example.service.CustomerService;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class AddRubberPoundController {
	  @Autowired
	    private Prepare prepare;
	 
		@Autowired
		private AddRubberPoundService addRubberPoundService;
	  
@RequestMapping("/buyRubberLiquid")
public String dispatcheBuyRubberLiquid(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
		
		String addressId=req.getParameter("addressId");
		AddressPerGroupCustomersForm myForm=new AddressPerGroupCustomersForm(addressId);
		addRubberPoundService.prepareCustomersGroupByAddress(myForm);
		modelMap.addAttribute("GroupByAddressForm",myForm);
		if(myForm.getCustomers().size()==0)
		{
		return "home";
		}else
		{
			
		return "AddRubberPoundCustomerGroupByAddress";
		}
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";	
	}
	
	
}

@RequestMapping("/toBuyPath")
public String dispatcheBuyRubber(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
	HttpSession buySesssion=req.getSession(true);
	Set<StorePerLitterForm> buyList = new HashSet<StorePerLitterForm>(0);
		buySesssion.setAttribute("BuyList",buyList);
		String customerId=req.getParameter("customerId");
		BuyRubberPoundForm myForm=new BuyRubberPoundForm(customerId);
		myForm.setBuyList(buyList);
		addRubberPoundService.prepareAddPound(myForm);
		modelMap.addAttribute("buyForm",new BuyForm());
		modelMap.addAttribute("rubberPoundForm",myForm);
	return "AddRubberPound";
	
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";	
	}
	
}
@RequestMapping("/saveItemToList")
public String dispatcheAddBuy(@ModelAttribute("buyForm") BuyForm buyForm,HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
		HttpSession buySesssion=req.getSession(false);
		Set<StorePerLitterForm> buyList=(Set<StorePerLitterForm>)buySesssion.getAttribute("BuyList");
		
		String customerId=req.getParameter("customerId");
		BuyRubberPoundForm myForm=new BuyRubberPoundForm(customerId);
		myForm.setBuyForm(buyForm);
		myForm.setBuyList(buyList);
		addRubberPoundService.prepareAddPound(myForm);
		buySesssion.setAttribute("BuyList",myForm.getBuyList());
		modelMap.addAttribute("buyForm",new BuyForm());
		modelMap.addAttribute("rubberPoundForm",myForm);
		
	
		return "AddRubberPound";
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";
	}
}


@RequestMapping("/saveItemAll")
public String dispatcheAddBuy(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
	String customerId=req.getParameter("customerId");
	HttpSession buySesssion=req.getSession(false);
	Set<StorePerLitterForm> buyList=(Set<StorePerLitterForm>)buySesssion.getAttribute("BuyList");
	
	BuyRubberPoundForm myForm=new BuyRubberPoundForm(customerId);
	myForm.setAdmin((Admin)buySesssion.getAttribute("LoginAdmin"));
	myForm.setBuyList(buyList);
	
	addRubberPoundService.buyAddedTotalPounds(myForm);
	buySesssion.setAttribute("BuyList",myForm.getBuyList());
	modelMap.addAttribute("buyForm",new BuyForm());
	modelMap.addAttribute("rubberPoundForm",myForm);
	
	String addressId=myForm.getCustomer().getAddress().getAddressId()+"";
	AddressPerGroupCustomersForm addressPerGroupCustomersForm=new AddressPerGroupCustomersForm(addressId);
	addRubberPoundService.prepareCustomersGroupByAddress(addressPerGroupCustomersForm);
	modelMap.addAttribute("GroupByAddressForm",addressPerGroupCustomersForm);
	if(addressPerGroupCustomersForm.getCustomers().size()==0)
	{
	return "home";
	}else
	{
	return "AddRubberPoundCustomerGroupByAddress";
	}
	
	}else
	{
		LoginForm myForm=new LoginForm();
		modelMap.addAttribute("frmLogin",myForm);
		return "Adminlogin";	
	}	


}



}
