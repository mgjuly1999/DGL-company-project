package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.dao.CustomerDao;
import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.EditRubberPoundForm;
import com.example.models.StorePerLitter;

@Service
@Repository("editRubberPoundService")
public class EditRubberPoundService {
	@Autowired
private AddressDao addressDao;
	@Autowired
private CustomerDao customerDao;
	@Autowired
private StoreDao storeDao;
	@Autowired
private StorePerLitterDao storePerLitterDao;
	public void prepareEditRubberPound(EditRubberPoundForm myForm)
	{
		int addressId=0;
		int storePerLitterId=0;
		int customerId=0;
		double pound=0.0;
	if(myForm.getAddressId()!=null)	
	{
		addressId=Integer.parseInt(myForm.getAddressId());
		myForm.setAddress(addressDao.getAddressById(addressId));
		myForm.setCustomers(customerDao.getCustomerByTotalLitterZero(addressId));
	}else if(myForm.getCustomerId()!=null && myForm.getStorePerLitterId()==null)
	{
		customerId=Integer.parseInt(myForm.getCustomerId());
		myForm.setCustomer(customerDao.getCustomerById(customerId));
		addressId=myForm.getCustomer().getAddress().getAddressId();
		myForm.setStores(storeDao.getWaterAndTotalZeroStoresByCustomerId(customerId));
		myForm.setAddress(addressDao.getAddressById(addressId));
		myForm.setCustomers(customerDao.getCustomerByTotalLitterZero(addressId));

	}else if(myForm.getStorePerLitterId()!=null && myForm.getCustomerId()!=null)
	{
		customerId=Integer.parseInt(myForm.getCustomerId());
		storePerLitterId=Integer.parseInt(myForm.getStorePerLitterId());
		
		
		myForm.setCustomer(customerDao.getCustomerById(customerId));
		addressId=myForm.getCustomer().getAddress().getAddressId();
		myForm.setStores(storeDao.getWaterAndTotalZeroStoresByCustomerId(customerId));
		myForm.setAddress(addressDao.getAddressById(addressId));
		myForm.setCustomers(customerDao.getCustomerByTotalLitterZero(addressId));
		myForm.setStorePerLitter(storePerLitterDao.getStorePerLitterById(storePerLitterId));
		myForm.setStore(myForm.getStorePerLitter().getStore());
		
		
	}else if(myForm.getUpdatePoundForm()!=null && myForm.getUpdatePoundForm().getFlag().equals("update"))
	{
		storePerLitterId=Integer.parseInt(myForm.getUpdatePoundForm().getStorePerLitterId());
		customerId=Integer.parseInt(myForm.getUpdatePoundForm().getCustomerId());
		pound=Double.parseDouble(myForm.getUpdatePoundForm().getPound());
		
		myForm.setCustomer(customerDao.getCustomerById(customerId));
		addressId=myForm.getCustomer().getAddress().getAddressId();
		myForm.setStores(storeDao.getWaterAndTotalZeroStoresByCustomerId(customerId));
		myForm.setAddress(addressDao.getAddressById(addressId));
		myForm.setCustomers(customerDao.getCustomerByTotalLitterZero(addressId));
		myForm.setStorePerLitter(storePerLitterDao.getStorePerLitterById(storePerLitterId));
	
		
		StorePerLitter storePerLitter=new StorePerLitter();
		storePerLitter=storePerLitterDao.getStorePerLitterById(storePerLitterId);
		storePerLitter.setPound(pound);
		storePerLitterDao.updateStorePerLitter(storePerLitter);
		
	}else if(myForm.getUpdatePoundForm()!=null && myForm.getUpdatePoundForm().getFlag().equals("delete"))
	{
		storePerLitterId=Integer.parseInt(myForm.getUpdatePoundForm().getStorePerLitterId());
		customerId=Integer.parseInt(myForm.getUpdatePoundForm().getCustomerId());
		
		myForm.setStorePerLitter(storePerLitterDao.getStorePerLitterById(storePerLitterId));
		
		storePerLitterDao.deleteByStorePerLitter(myForm.getStorePerLitter());
		myForm.setCustomer(customerDao.getCustomerById(customerId));
		addressId=myForm.getCustomer().getAddress().getAddressId();
		myForm.setStores(storeDao.getWaterAndTotalZeroStoresByCustomerId(customerId));
		myForm.setAddress(addressDao.getAddressById(addressId));
		myForm.setCustomers(customerDao.getCustomerByTotalLitterZero(addressId));

	
		
	}
	}
}
