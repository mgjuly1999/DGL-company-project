package com.example.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.form.CustomerRegisterForm;
import com.example.form.ShowAllStoreForm;
import com.example.models.Address;
import com.example.models.Customer;


@Service
@Repository("customerService")
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
public void customerSave(CustomerRegisterForm myForm)
{
	Customer customer=new Customer();
	
	customer.setName(myForm.getName());
	customer.setPhone(myForm.getPhone());
	customer.setMale(myForm.getGender());
	customer.setCreateDate(new Date());
	customer.setAddress(new Address(Integer.parseInt(myForm.getAddressId())));
	myForm.setFrmCustomer(customerDao.saveCustomer(customer));
	
}

public void getCustomers(CustomerRegisterForm myForm)
{
	myForm.setFrmCustomers(customerDao.getCustomers());
}

public void getCustomerById(ShowAllStoreForm myForm) {
	myForm.setCustomer(customerDao.getCustomerById(myForm.getCustomer().getCustomerId()));
	
}



}
