package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.dao.CustomerDao;
import com.example.form.AddressPerGroupCustomersForm;
import com.example.form.ShowAllStoreForm;
import com.example.models.Customer;

@Service
@Repository("showAllService")
public class ShowAllService {
@Autowired
private CustomerDao customerDao;
@Autowired
private AddressDao addressDao;
@Autowired
private StoreService storeService;
@Autowired
private CustomerService customerService;
public void prepareShowAllRubberInfo(AddressPerGroupCustomersForm myForm)
{
	myForm.setCustomers(customerDao.getStoreCorrectCustomersByAddressId(Integer.parseInt(myForm.getAddressId())));
	myForm.setAddress(addressDao.getAddressById(Integer.parseInt(myForm.getAddressId())));
}
public void prepareShowAllStore(ShowAllStoreForm myForm) {
	
	myForm.setCustomer(new Customer(Integer.parseInt(myForm.getCustomerId())));
	storeService.getCorrectStoresByCustomerId(myForm);
	customerService.getCustomerById(myForm);
	
}
}
