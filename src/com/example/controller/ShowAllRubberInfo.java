package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.AddressDao;
import com.example.dao.CustomerDao;
import com.example.dao.StoreDao;
import com.example.form.AddressPerGroupCustomersForm;
import com.example.form.ShowAllStoreForm;
import com.example.models.Customer;
import com.example.models.Store;
import com.example.service.CustomerService;
import com.example.service.ShowAllService;
import com.example.service.StoreService;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class ShowAllRubberInfo {
	  @Autowired
	    private Prepare prepare;
	  	@Autowired
	  	private ShowAllService showAllService;
	  
	  @Autowired
	    private StoreService storeService;
	  @Autowired
	  	private CustomerService customerService;
	  
@RequestMapping("showAllRubberInfo")
public String dispatcheShowAllRubberInfo(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
		
		String addressId=req.getParameter("addressId");
		AddressPerGroupCustomersForm myForm=new AddressPerGroupCustomersForm(addressId);
		showAllService.prepareShowAllRubberInfo(myForm);
		modelMap.addAttribute("showAllForm",myForm);
		
		return "showAllRubberInfo";
	}else
	{
		return "AdminLogin";	
	}
	
	
}

@RequestMapping("showAllStorePath")
public String dispatcheshowAllStore(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{

	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
		String customerId=req.getParameter("customerId");
		ShowAllStoreForm myForm=new ShowAllStoreForm(customerId);
		
		showAllService.prepareShowAllStore(myForm);
		
		modelMap.addAttribute("myShowAllStoreForm",myForm);
		
		if(myForm.getStores().size()==0)
		{
			AddressPerGroupCustomersForm showAllRubberInfoForm=new AddressPerGroupCustomersForm(myForm.getCustomer().getAddress().getAddressId()+"");
			showAllService.prepareShowAllRubberInfo(showAllRubberInfoForm);
			modelMap.addAttribute("showAllForm", showAllRubberInfoForm);
			return "showAllRubberInfo";
		}else
		{
			return "showAllStore";	
		}
		
		
		}else
		{
			return "AdminLogin";	
		}
		
		
}

@RequestMapping(path={"/showAllStoreDownLink"},method=RequestMethod.GET)
public ModelAndView dispatchExcel(Model m,HttpServletRequest req){

		String customerId=req.getParameter("customerId");
		ShowAllStoreForm myForm=new ShowAllStoreForm(customerId);
		
		showAllService.prepareShowAllStore(myForm);

	ModelAndView mv=new ModelAndView("storeExcelView",
			"storeList",myForm.getStores());
	return mv;

}
}
