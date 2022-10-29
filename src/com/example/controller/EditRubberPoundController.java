package com.example.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.EditRubberPoundForm;
import com.example.form.LoginForm;
import com.example.form.UpdatePoundForm;
import com.example.service.EditRubberPoundService;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class EditRubberPoundController {
	@Autowired
	private Prepare prepare;
	@Autowired
	private EditRubberPoundService editRubberPoundService;
	
	@RequestMapping("/editRubberPound")
	public String dispatcheEditRubberPound(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {

			String addressId =req.getParameter("addressId");
			EditRubberPoundForm editRubberPoundForm=new EditRubberPoundForm();
			editRubberPoundForm.setAddressId(addressId);
			this.editRubberPoundService.prepareEditRubberPound(editRubberPoundForm);
			modelMap.addAttribute("editPoundForm",editRubberPoundForm);
			if (editRubberPoundForm.getCustomers().size()==0)
			{
				
				return "home";
			} else 
			{
				
				return "editRubberPoundCustomerGroupByAddress";
			}
		} else {
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}

	}

	@RequestMapping("/toEditPoundPath")
	public String toEditPoundPathDispatcher(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			String customerId =req.getParameter("customerId");
			EditRubberPoundForm editRubberPoundForm=new EditRubberPoundForm();
			editRubberPoundForm.setCustomerId(customerId);
			this.editRubberPoundService.prepareEditRubberPound(editRubberPoundForm);
	
			modelMap.addAttribute("editPoundForm", editRubberPoundForm);
			if(editRubberPoundForm.getStores().size()==0)
			{
			
				if(editRubberPoundForm.getCustomers().size()==0)
				{
					return "home";
				}else
				{
				return "editRubberPoundCustomerGroupByAddress";
				}
			}else
			{
				return "editRubberPound";	
			}
	
			
		} else {
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}

	}		
	
	
	

	
	@RequestMapping("/rubberPoundEditPath")
	public String rubberPoundEditPathDispatcher(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			
			String storePerLitterId =req.getParameter("storePerLitterId");
			String customerId =req.getParameter("customerId");
			EditRubberPoundForm editRubberPoundForm=new EditRubberPoundForm();
			editRubberPoundForm.setCustomerId(customerId);
			editRubberPoundForm.setStorePerLitterId(storePerLitterId);
			this.editRubberPoundService.prepareEditRubberPound(editRubberPoundForm);
			editRubberPoundForm.setEditPoundFlag("update");	
			modelMap.addAttribute("editPoundForm",editRubberPoundForm);
			modelMap.addAttribute("updatePoundForm",new UpdatePoundForm());
		
			

			if(editRubberPoundForm.getStores().size()==0)
			{
				
				if(editRubberPoundForm.getCustomers().size()==0)
				{
					return "home";
				}else
				{
				return "editRubberPoundCustomerGroupByAddress";
				}
			}else
			{
				return "editRubberPound";	
			}
		} else {
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}

	}
	@RequestMapping("/rubberPoundEditsSubmit")
	public String rubberPoundEditsSubmitDispatcher(@ModelAttribute("updatePoundForm") UpdatePoundForm updatePoundForm,HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			
			
			EditRubberPoundForm editRubberPoundForm=new EditRubberPoundForm();
			editRubberPoundForm.setUpdatePoundForm(updatePoundForm);
			this.editRubberPoundService.prepareEditRubberPound(editRubberPoundForm);
	
			modelMap.addAttribute("editPoundForm",editRubberPoundForm);
			editRubberPoundForm.setStorePerLitter(null);
			

			if (editRubberPoundForm.getStores().size() == 0) {
				if(editRubberPoundForm.getCustomers().size()==0)
				{
					return "home";
				}else
				{
					return "editRubberPoundCustomerGroupByAddress";
				}
				
			} else {
				return "editRubberPound";
			}
		} else {
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}

	}

	@RequestMapping("/rubberPoundDeletePath")
	public String rubberPoundDeletePathDispatcher(HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			
			String storePerLitterId =req.getParameter("storePerLitterId");
			String customerId =req.getParameter("customerId");
			
			EditRubberPoundForm editRubberPoundForm=new EditRubberPoundForm();
			editRubberPoundForm.setCustomerId(customerId);
			editRubberPoundForm.setStorePerLitterId(storePerLitterId);
			this.editRubberPoundService.prepareEditRubberPound(editRubberPoundForm);
			editRubberPoundForm.setEditPoundFlag("delete");	
			modelMap.addAttribute("editPoundForm",editRubberPoundForm);
			modelMap.addAttribute("updatePoundForm",new UpdatePoundForm());
		
			

			if(editRubberPoundForm.getStores().size()==0)
			{
				
				if(editRubberPoundForm.getCustomers().size()==0)
				{
					return "home";
				}else
				{
				return "editRubberPoundCustomerGroupByAddress";
				}
			}else
			{
				return "editRubberPound";	
			}
		} else {
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}

	}
	
	@RequestMapping("/rubberPoundUpdateSubmit")
	public String rubberPoundUpdateSubmitDispatcher(@ModelAttribute("updatePoundForm") UpdatePoundForm updatePoundForm,HttpServletRequest req, HttpServletResponse resp, ModelMap modelMap) {
		if (prepare.prepareAdminHome(req, resp, modelMap)) {
			
			
			EditRubberPoundForm editRubberPoundForm=new EditRubberPoundForm();
			editRubberPoundForm.setUpdatePoundForm(updatePoundForm);
			this.editRubberPoundService.prepareEditRubberPound(editRubberPoundForm);
	
			modelMap.addAttribute("editPoundForm",editRubberPoundForm);
			editRubberPoundForm.setStorePerLitter(null);
			

			if (editRubberPoundForm.getStores().size() == 0) {
				if(editRubberPoundForm.getCustomers().size()==0)
				{
					return "home";
				}else
				{
					return "editRubberPoundCustomerGroupByAddress";
				}
				
			} else {
				return "editRubberPound";
			}
		} else {
			LoginForm myLoginForm=new LoginForm();
			modelMap.addAttribute("frmLogin",myLoginForm);
			return "Adminlogin";
		}

	}
	
	
	

}
