package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.form.AddressForm;
import com.example.models.Address;

@Service
public class AddressService {
	@Autowired
	private AddressDao addressDao;
public void addressSave(AddressForm myForm)
{
	Address address=new Address();
	address.setAddress(myForm.getAddress());
	addressDao.saveAddress(address);
	
	}
}
