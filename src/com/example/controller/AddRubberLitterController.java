package com.example.controller;

import java.util.List;

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
import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.AddLitterForm;
import com.example.form.AddRubberLitterForm;
import com.example.form.AddressPerGroupCustomersForm;
import com.example.form.LoginForm;
import com.example.form.RequireStorePerLitterForm;
import com.example.form.StorePerLitterForm;
import com.example.form.UpdatePoundForm;
import com.example.models.Customer;
import com.example.service.AddRubberLitterService;
import com.example.service.StorePerLitterService;
import com.example.service.StoreService;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class AddRubberLitterController {
	@Autowired
	private Prepare prepare;
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private StorePerLitterService storePerLitterService;
	@Autowired
	private StorePerLitterDao storePerLitterDao;
	@Autowired
	private AddRubberLitterService addRubberLitterService;
	

	@RequestMapping("/addRubberLitter")
	public String dispatcheAddRubberLitter(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {

			String addressId = req.getParameter("addressId");
			AddressPerGroupCustomersForm customerGroupForm=new AddressPerGroupCustomersForm(addressId);
			addRubberLitterService.prepareCustomerGroupService(customerGroupForm);
			modelMap.addAttribute("customerGroupForm",customerGroupForm);
			if (customerGroupForm.getCustomers().size()==0)
			{
				return "home";
			} else 
			{
				addRubberLitterService.prepareCustomerGroupService(customerGroupForm);
				modelMap.addAttribute("customerGroupForm",customerGroupForm);
				return "AddRubberLitterCustomerGroupByAddress";
			}
		} else {
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			return "Adminlogin";
			
		}

	}

	@RequestMapping("/toInsertLitterPath")
	public String insertLitterDispatcher(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			String customerId =req.getParameter("customerId");
			AddRubberLitterForm addRubberLitterForm= new AddRubberLitterForm(customerId);
			addRubberLitterService.prepareAddRubberLitterService(addRubberLitterForm);
			modelMap.addAttribute("addRubberLitterForm",addRubberLitterForm);
			modelMap.addAttribute("addLitterForm",new AddLitterForm());
			
			if(addRubberLitterForm.getStores().size()==0)
			{
				int addressId=addRubberLitterForm.getAddress().getAddressId();
				AddressPerGroupCustomersForm customerGroupForm=new AddressPerGroupCustomersForm(addressId+"");
				addRubberLitterService.prepareCustomerGroupService(customerGroupForm);
				modelMap.addAttribute("customerGroupForm",customerGroupForm);
				if(addRubberLitterForm.getCustomers().size()==0)
				{
					return "home";
				}else
				{
				return "AddRubberLitterCustomerGroupByAddress";
				}
			}else
			{
				return "AddRubberLitter";	
			}
	
			
		} else {
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			return "Adminlogin";
			
		}

	}		
	@RequestMapping("/rubberLitterInsertPath")
	public String addSingleLitterDispatcher(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			String customerId =req.getParameter("customerId");
			String storeId =req.getParameter("storeId");

			AddRubberLitterForm addRubberLitterForm= new AddRubberLitterForm(customerId);
			addRubberLitterForm.setStoreId(storeId);
			addRubberLitterForm.setFlag("insert");
			addRubberLitterService.prepareAddRubberLitterService(addRubberLitterForm);
			modelMap.addAttribute("addRubberLitterForm",addRubberLitterForm);
			modelMap.addAttribute("addLitterForm",new AddLitterForm());
			
			if(addRubberLitterForm.getStores().size()==0)
			{
				int addressId=addRubberLitterForm.getAddress().getAddressId();
				AddressPerGroupCustomersForm customerGroupForm=new AddressPerGroupCustomersForm(addressId+"");
				addRubberLitterService.prepareCustomerGroupService(customerGroupForm);
				modelMap.addAttribute("customerGroupForm",customerGroupForm);
				if(customerGroupForm.getCustomers().size()==0)
				{
					return "home";
				}else
				{
				return "AddRubberLitterCustomerGroupByAddress";
				}
			}else
			{
				return "AddRubberLitter";	
			}
		} else {
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			return "Adminlogin";
		
		}

	}
	
	
	@RequestMapping("/rubberTotalLitterInsertSubmit")
	public String rubberLitterUpdateSubmitDispatcher(@ModelAttribute("addLitterForm") AddLitterForm addLitterForm,HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			AddRubberLitterForm addRubberLitterForm= new AddRubberLitterForm(addLitterForm);
			addRubberLitterForm.setAddLitterForm(addLitterForm);
			addRubberLitterService.prepareAddRubberLitterService(addRubberLitterForm);
			
			modelMap.addAttribute("addRubberLitterForm",addRubberLitterForm);
			
		

			if (addRubberLitterForm.getStores().size() == 0) {
				int addressId=addRubberLitterForm.getAddress().getAddressId();
				AddressPerGroupCustomersForm customerGroupForm=new AddressPerGroupCustomersForm(addressId+"");
				addRubberLitterService.prepareCustomerGroupService(customerGroupForm);
				modelMap.addAttribute("customerGroupForm",customerGroupForm);
				
				if(customerGroupForm.getCustomers().size()==0)
				{
					return "home";
				}else
				{
					return "AddRubberLitterCustomerGroupByAddress";
				}
				
			} else {
				return "AddRubberLitter";
			}
		} else {
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			return "Adminlogin";
		}

	}

	
	
	@RequestMapping("/rubberLitterInsertSubmit")
	public String updateLitterDispatcher(@ModelAttribute("insertLitterForm") StorePerLitterForm myLitterForm,
			HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			myLitterForm.setStorePerLitterId(req.getParameter("storePerLitterId"));
			storePerLitterService.updateLitterForInsert(myLitterForm);
			
			int customerId = Integer.parseInt(req.getParameter("customerId"));
			RequireStorePerLitterForm myForm = new RequireStorePerLitterForm();
			myForm.setCustomer(customerDao.getCustomerById(customerId));
			
			storePerLitterService.getInCorrectStoresByCustomerId(myForm);
			myForm.setStorePerLitter(null);
			modelMap.addAttribute("myForm", myForm);

			if (myForm.getStores().size() == 0) {
				List<Customer> customerList=customerDao.getCustomersByWaterLitterZero(myForm.getCustomer().getCustomerId());
				modelMap.addAttribute("customerList",customerList);
				modelMap.addAttribute("selectAddress",
				addressDao.getAddressById(myForm.getCustomer().getAddress().getAddressId()));
				if(customerList.size()==0)
				{
					return "home";
				}else
				{
					return "AddRubberLitterCustomerGroupByAddress";
				}
				
			} else {
				return "AddRubberLitter";
			}
		} else {
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			return "Adminlogin";
		}

	}
	
	@RequestMapping("/rubberLitterDeletePath")
	public String rubberLitterDeleteDispatcher(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			int customerId = Integer.parseInt(req.getParameter("customerId"));
			int storePerLitterId = Integer.parseInt(req.getParameter("storePerLitterId"));

			RequireStorePerLitterForm myForm = new RequireStorePerLitterForm();
			myForm.setCustomer(customerDao.getCustomerById(customerId));
			
			storePerLitterService.getInCorrectStoresByCustomerId(myForm);
			myForm.setStorePerLitter(storePerLitterDao.getStorePerLitterById(storePerLitterId));
			myForm.setRubberLitterFlag("delete");
			modelMap.addAttribute("updateLitterForm", new StorePerLitterForm());
			modelMap.addAttribute("myForm", myForm);
			
			if(myForm.getStores().size()==0)
			{
				List<Customer> customerList=customerDao.getCustomersByWaterLitterZero(myForm.getCustomer().getCustomerId());
				modelMap.addAttribute("customerList",customerList);
				modelMap.addAttribute("selectAddress",
				addressDao.getAddressById(myForm.getCustomer().getAddress().getAddressId()));
				
				if(customerList.size()==0)
				{
					return "home";
				}else
				{
				return "AddRubberLitterCustomerGroupByAddress";
				}
			}else
			{
				return "AddRubberLitter";	
			}

		
		} else {
			LoginForm myForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myForm);
			return "Adminlogin";
		}

	}
@RequestMapping("/rubberLitterDeleteSubmit")
public String rubberLitterDeleteSubmitDispatcher(@ModelAttribute("updateLitterForm") StorePerLitterForm myLitterForm,HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
if (prepare.prepareAdminHome(req, resp, modelMap)) {
	myLitterForm.setStorePerLitterId(req.getParameter("storePerLitterId"));
	storePerLitterService.deleteStorePerLitterByStorePerLitter(myLitterForm);
	int customerId = Integer.parseInt(req.getParameter("customerId"));
	RequireStorePerLitterForm myForm = new RequireStorePerLitterForm();
	myForm.setCustomer(customerDao.getCustomerById(customerId));
	
	storePerLitterService.getInCorrectStoresByCustomerId(myForm);
	myForm.setStorePerLitter(null);
	modelMap.addAttribute("myForm", myForm);

	if (myForm.getStores().size() == 0) {
		List<Customer> customerList=customerDao.getCustomersByWaterLitterZero(myForm.getCustomer().getCustomerId());
		modelMap.addAttribute("customerList",customerList);
		modelMap.addAttribute("selectAddress",
		addressDao.getAddressById(myForm.getCustomer().getAddress().getAddressId()));
		if(customerList.size()==0)
		{
			return "home";
		}else
		{
			return "AddRubberLitterCustomerGroupByAddress";
		}
		
	} else {
		return "AddRubberLitter";
	}
} else {
	LoginForm myForm=new LoginForm();
	modelMap.addAttribute("frmLogin",myForm);
	return "Adminlogin";
}

}


@RequestMapping("/rubberLitterUpdatePath")
public String rubberLitterUpdateDispatcher(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
if (prepare.prepareAdminHome(req, resp, modelMap)) {
	String customerId =req.getParameter("customerId");
	String storePerLitterId =req.getParameter("storePerLitterId");

	AddRubberLitterForm addRubberLitterForm=new AddRubberLitterForm();
	addRubberLitterForm.setStorePerLitterId(storePerLitterId);
	addRubberLitterForm.setCustomerId(customerId);
	
	this.addRubberLitterService.prepareAddRubberLitterService(addRubberLitterForm);
	modelMap.addAttribute("addRubberLitterForm",addRubberLitterForm);
	modelMap.addAttribute("rubberLitterForm",new UpdatePoundForm());
	if(addRubberLitterForm.getStores().size()==0)
	{
		if(addRubberLitterForm.getCustomers().size()==0)
		{
			return "home";
		}else
		{
		return "AddRubberLitterCustomerGroupByAddress";
		}
	}else
	{
		return "AddRubberLitter";	
	}
} else {
	LoginForm myForm=new LoginForm();
	modelMap.addAttribute("frmLogin",myForm);
	return "Adminlogin";
}

}
@RequestMapping("/rubberLitterUpdateSubmit")
public String rubberLitterUpdateSubmitDispatcher(@ModelAttribute("rubberLitterForm")UpdatePoundForm updatePoundForm,HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
if (prepare.prepareAdminHome(req, resp, modelMap)) {
	AddRubberLitterForm addRubberLitterForm=new AddRubberLitterForm();
	addRubberLitterForm.setUpdatePoundForm(updatePoundForm);
	this.addRubberLitterService.prepareAddRubberLitterService(addRubberLitterForm);
	modelMap.addAttribute("addRubberLitterForm",addRubberLitterForm);
	modelMap.addAttribute("rubberLitterForm",new UpdatePoundForm());
	if(addRubberLitterForm.getStores().size()==0)
	{
		if(addRubberLitterForm.getCustomers().size()==0)
		{
			return "home";
		}else
		{
		return "AddRubberLitterCustomerGroupByAddress";
		}
	}else
	{
		return "AddRubberLitter";	
	}
} else {
	LoginForm myForm=new LoginForm();
	modelMap.addAttribute("frmLogin",myForm);
	return "Adminlogin";
}

}
}
