package com.example.service;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.dao.CustomerDao;
import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.AddressPerGroupCustomersForm;
import com.example.form.BuyForm;
import com.example.form.BuyRubberPoundForm;
import com.example.form.StorePerLitterForm;
import com.example.models.Customer;
import com.example.models.Store;
import com.example.models.StorePerLitter;
import com.sun.swing.internal.plaf.basic.resources.basic;

@Service
@Repository("addRubberPoundService")
public class AddRubberPoundService {
	@Autowired
	private StoreDao storeDao;
	@Autowired
	private StorePerLitterDao storePerLitterDao;
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private AddressDao addressDao;
	
	
	public void saveBuy(BuyForm myForm)
	{
		
	
	}

	public void prepareCustomersGroupByAddress(AddressPerGroupCustomersForm myForm) {
		
		myForm.setCustomers(customerDao.getCustomerByAddressId(Integer.parseInt(myForm.getAddressId())));
		myForm.setAddress(addressDao.getAddressById(Integer.parseInt(myForm.getAddressId())));
		
	}

	public void prepareAddPound(BuyRubberPoundForm myForm) {
		
	
		myForm.setCustomer(customerDao.getByKey(Integer.parseInt(myForm.getCustomerId())));
	 
		Map<Integer,String> boxs=new HashMap<Integer,String>();
		
			boxs.put(1,"Large");
			boxs.put(2,"Medium");
			boxs.put(3,"Small");
			myForm.setContainers(boxs);
		if(myForm.getBuyForm()!=null)
		{
			myForm.getBuyForm().setLitter("0.0");
			myForm.getBuyList().add(new StorePerLitterForm(myForm.getBuyForm().getStoreId(),myForm.getBuyForm().getLitter(),myForm.getBuyForm().getPound(),
					myForm.getBuyForm().getContainer(),boxs.get(Integer.parseInt(myForm.getBuyForm().getContainer()))));
		}
	
	
	}

	public void buyAddedTotalPounds(BuyRubberPoundForm myForm) {
	
		this.prepareAddPound(myForm);
		
		Store store=new Store();
		
		store.setAdminByAdminId(myForm.getAdmin());
		store.setAdminByGoldAdminId(myForm.getAdmin());
		store.setCreateDate(new Date());
		store.setCustomer(myForm.getCustomer());
		store.setDrc(0.0);
		store.setDryPound(0.0);
		store.setTotalLitter(0.0);
		store.setWaterLitter(0.0);
		
		Set<StorePerLitter> storePerLitters = new HashSet<StorePerLitter>(0);
		
		
		for (StorePerLitterForm splForm : myForm.getBuyList()) {
			StorePerLitter spl=new StorePerLitter();
			spl.setLitter(0.0);
	
			switch(splForm.getContainer())
			{
			case "1":spl.setPound(Double.parseDouble(splForm.getPound())-14.5);break;
			case "2":spl.setPound(Double.parseDouble(splForm.getPound())-7);break;
			case "3":spl.setPound(Double.parseDouble(splForm.getPound())-2.6);break;
			default:break;
			}
			
			spl.setStore(store);
			storePerLitters.add(spl);
		}
		store.setStorePerLitters(storePerLitters);
		
	myForm.setStore(storeDao.saveStore(store));
		
	}
	
	

}
