package com.example.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.CustomerDao;
import com.example.form.BuyForm;
import com.example.form.BuyRubberPoundForm;
import com.example.form.LoginForm;
import com.example.form.StorePerLitterForm;
import com.example.service.AddRubberPoundService;
import com.example.utlit.Prepare;

@Controller
@Transactional
public class buyItemDeletePathController {
	 @Autowired
	    private Prepare prepare;
	 @Autowired
		private CustomerDao customerDao;
	 @Autowired
	 	private AddRubberPoundService addRubberPoundService;
@RequestMapping("/buyItemDeletePath")
public String buyItemDeleteDispatcher(HttpServletRequest req,HttpServletResponse resp,ModelMap modelMap)
{
	if(prepare.prepareAdminHome(req, resp, modelMap))
	{
	
		String pound=req.getParameter("pound");
		String customerId=req.getParameter("customerId");
		
		HttpSession buySesssion=req.getSession(true);
		Set<StorePerLitterForm> buyList =(Set<StorePerLitterForm>)buySesssion.getAttribute("BuyList");
			
			
			for(StorePerLitterForm bl : buyList)
			{
				if(Double.parseDouble(bl.getPound())==Double.parseDouble(pound))
				{
				
					buyList.remove(bl);
			
					break;	
				}
			}
			
			BuyRubberPoundForm myForm=new BuyRubberPoundForm(customerId);
			myForm.setBuyList(buyList);
			addRubberPoundService.prepareAddPound(myForm);
			buySesssion.setAttribute("BuyList",buyList);
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

}
