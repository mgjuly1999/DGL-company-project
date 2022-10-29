package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.RequireStorePerLitterForm;
import com.example.form.StoreForm;
import com.example.form.StorePerLitterForm;
import com.example.models.Store;
import com.example.models.StorePerLitter;
@Service
@Repository("storePerLitterService")
public class StorePerLitterService {
	@Autowired
	private StorePerLitterDao storePerLitterDao;
	@Autowired
	private StoreDao storeDao;
public void getCustomerIdByRequireLitter(RequireStorePerLitterForm myForm)
{
	myForm.setStorePerLitters(storePerLitterDao.getCustomerIdByRequireLitter(myForm.getCustomer().getCustomerId()));
}
public void getInCorrectStoresByCustomerId(RequireStorePerLitterForm myForm)
{
	myForm.setStores(storeDao.getInCorrectStoresByCustomerId(myForm.getCustomer().getCustomerId()));
	for(Store store : myForm.getStores())
	{
		store.setTotalPound(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0));
	}
	
}

public void updateLitterForInsert(StorePerLitterForm myForm)
{
	StorePerLitter storePerLitter=new StorePerLitter();
	storePerLitter=storePerLitterDao.getStorePerLitterById(Integer.parseInt(myForm.getStorePerLitterId()));
	storePerLitter.setLitter(Double.parseDouble(myForm.getLitter()));
	storePerLitterDao.updateStorePerLitter(storePerLitter);
}

public void updateLitterForUpdate(StorePerLitterForm myForm)
{
	StorePerLitter storePerLitter=new StorePerLitter();
	storePerLitter=storePerLitterDao.getStorePerLitterById(Integer.parseInt(myForm.getStorePerLitterId()));
	storePerLitter.setPound(Double.parseDouble(myForm.getPound()));
	storePerLitterDao.updateStorePerLitter(storePerLitter);
}

public void updateStore(StoreForm myStoreForm) {
	
	
}

public void deleteStorePerLitterByStorePerLitter(StorePerLitterForm myLitterForm) {
	
	StorePerLitter storePerLitter=new StorePerLitter();
	storePerLitter.setStorePerLitterId(Integer.parseInt(myLitterForm.getStorePerLitterId()));
	storePerLitterDao.delete(storePerLitter);
	
	
}
}
