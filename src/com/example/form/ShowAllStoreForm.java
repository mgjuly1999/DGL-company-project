package com.example.form;

import java.util.List;

import com.example.models.Customer;
import com.example.models.Store;

public class ShowAllStoreForm {
private List<Store> stores;
private Customer customer;
private String customerId;
public ShowAllStoreForm()
{
	
}
public ShowAllStoreForm(String customerId)
{
this.customerId=customerId;	
}
public ShowAllStoreForm(List<Store> stores, Customer customer) {
	this.stores = stores;
	this.customer = customer;
}
public List<Store> getStores() {
	return stores;
}
public void setStores(List<Store> stores) {
	this.stores = stores;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
}
