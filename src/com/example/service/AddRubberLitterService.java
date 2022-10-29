package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.dao.CustomerDao;
import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.AddRubberLitterForm;
import com.example.form.AddressPerGroupCustomersForm;
import com.example.models.Customer;
import com.example.models.Store;
import com.example.utlit.Format;

@Service
@Repository("addRubberLitterService")
public class AddRubberLitterService {
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private StorePerLitterDao  storePerLitterDao;
	@Autowired
	private StoreDao storeDao;
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private Format format;

	public void prepareAddRubberLitterService(AddRubberLitterForm addRubberLitterForm) {
		int customerId=0;
		int storePerLitterId=0;
		if(addRubberLitterForm.getStoreId()!=null)
		{
			int storeId=Integer.parseInt(addRubberLitterForm.getStoreId());
			addRubberLitterForm.setStore(storeDao.getStoreById(storeId));
			
		}
		if(addRubberLitterForm.getAddLitterForm()!=null)
		{
			customerId=Integer.parseInt(addRubberLitterForm.getAddLitterForm().getCustomerId());
			int storeId=Integer.parseInt(addRubberLitterForm.getAddLitterForm().getStoreId());
			Store storeUpdate=storeDao.getStoreById(storeId);
			
			double totalLitter=this.format.decimalFmt(addRubberLitterForm.getAddLitterForm().getTotalLitter());
			storeUpdate.setTotalLitter(totalLitter);
		      storeDao.updateStore(storeUpdate);
		      addRubberLitterForm.setStore(null);
		      addRubberLitterForm.setStores(storeDao.getInCorrectStoresByCustomerId(customerId));
		  	for(Store store : addRubberLitterForm.getStores())
		  	{
		  		store.setTotalPound(format.decimalFmt(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0)));
		  	}
		     
			
		}if(addRubberLitterForm.getStorePerLitterId()!=null 
			&& addRubberLitterForm.getCustomerId()!=null)
		{
			customerId=Integer.parseInt(addRubberLitterForm.getCustomerId());
			storePerLitterId=Integer.parseInt(addRubberLitterForm.getStorePerLitterId());
			addRubberLitterForm.setStorePerLitter(storePerLitterDao.getStorePerLitterById(storePerLitterId));
			addRubberLitterForm.setStore(storeDao.getStoreById(addRubberLitterForm.getStorePerLitter().getStore().getStoreId()));
			
			addRubberLitterForm.setFlag("update");	
		}if(addRubberLitterForm.getUpdatePoundForm()!=null)
		{
			customerId=Integer.parseInt(addRubberLitterForm.getUpdatePoundForm().getCustomerId());
			storePerLitterId=Integer.parseInt(addRubberLitterForm.getUpdatePoundForm().getStorePerLitterId());
			double pound=Double.parseDouble(addRubberLitterForm.getUpdatePoundForm().getPound());
			
			addRubberLitterForm.setStorePerLitter(storePerLitterDao.getStorePerLitterById(storePerLitterId));
			addRubberLitterForm.getStorePerLitter().setPound(pound);
			storePerLitterDao.updateStorePerLitter(addRubberLitterForm.getStorePerLitter());
			addRubberLitterForm.setStore(storeDao.getStoreById(addRubberLitterForm.getStorePerLitter().getStore().getStoreId()));
		}
		else if(addRubberLitterForm.getCustomerId()!=null)
		{
			customerId=Integer.parseInt(addRubberLitterForm.getCustomerId());
			
		}
		
		addRubberLitterForm.setCustomer(customerDao.getCustomerById(customerId));
		addRubberLitterForm.setStorePerLitters(storePerLitterDao.getCustomerIdByRequireLitter
				(customerId));
		addRubberLitterForm.setStores(storeDao.getInCorrectStoresByCustomerId(customerId));
		for(Store store : addRubberLitterForm.getStores())
		{
			store.setTotalPound(format.decimalFmt(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0)));
		}
		List<Customer> customerList=customerDao.getCustomersByWaterLitterZero(addRubberLitterForm.getCustomer().getAddress().getAddressId());
		addRubberLitterForm.setCustomers(customerList);
		addRubberLitterForm.setAddress(addressDao.getAddressById(addRubberLitterForm.getCustomer().getAddress().getAddressId()));
		
		
	}

	public void prepareCustomerGroupService(AddressPerGroupCustomersForm customerGroupForm) {
		customerGroupForm.setCustomers(customerDao.getCustomerByTotalLitterZero(Integer.parseInt(customerGroupForm.getAddressId())));
		customerGroupForm.setAddress(addressDao.getAddressById(Integer.parseInt(customerGroupForm.getAddressId())));
		
		
	}

}
