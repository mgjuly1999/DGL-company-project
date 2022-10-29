package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.ShowAllStoreForm;
import com.example.form.StoreForm;
import com.example.models.Store;
import com.example.utlit.Format;

@Service
public class StoreService {
@Autowired
private StoreDao storeDao;
@Autowired
private StorePerLitterDao storePerLitterDao;
@Autowired
private CustomerDao customerDao;
@Autowired
private Format format;
	
	public void updateStore(StoreForm myStoreForm) {
		

		
		Store store=storeDao.getStoreById(Integer.parseInt(myStoreForm.getStoreId()));
		store.setWaterLitter(this.format.decimalFmt(myStoreForm.getWaterLitter()));
		store.setTotalLitter(this.format.decimalFmt(myStoreForm.getTotalLitter()));
		store.setTotalPound(this.format.decimalFmt(myStoreForm.getTotalPound()));
		store.setAdminByGoldAdminId(myStoreForm.getGoldAdmin());
		
		store.setDryPound(Format.decimalFmt(((store.getTotalLitter()+store.getWaterLitter())*0.385)));
		store.setDrc(Format.decimalFmt(store.getDryPound()/store.getTotalLitter()));
        
		storeDao.updateStore(store);
		
	}
	
	public void getCorrectStoresByCustomerId(ShowAllStoreForm myForm) {
		myForm.setStores(storeDao.getCorrectStoresByCustomerId(myForm.getCustomer().getCustomerId()));
		
		for(Store store : myForm.getStores())
		{
			store.setTotalPound(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0));
		}
		
	}
	
	
	public void updatePoundServiceSubmit(StoreForm myPoundForm) {
		
		int storeId=Integer.parseInt(myPoundForm.getStoreId());
		int customerId=Integer.parseInt(myPoundForm.getCustomerId());
		
		Store storeUpdate=storeDao.getStoreById(storeId);
		storeUpdate.setTotalLitter(this.format.decimalFmt(myPoundForm.getTotalLitter()));
	      storeDao.updateStore(storeUpdate);
	      myPoundForm.setCustomer(customerDao.getCustomerById(customerId));
	      myPoundForm.setStorePerLitter(null);
	      myPoundForm.setStore(null);
	      myPoundForm.setStores(storeDao.getInCorrectStoresByCustomerId(Integer.parseInt(myPoundForm.getCustomerId())));
	  	for(Store store : myPoundForm.getStores())
	  	{
	  		store.setTotalPound(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0));
	  	}
	     
	}

}
