package com.example.form;

import java.util.Map;
import java.util.Set;

import com.example.models.Admin;
import com.example.models.Customer;
import com.example.models.Store;

public class BuyRubberPoundForm {
private String customerId;
private Customer customer;
private Set<StorePerLitterForm> buyList;
private Map<Integer,String> containers;
private BuyForm   buyForm;
private Admin admin;
private Store store;


public BuyRubberPoundForm() {
	
}
public BuyRubberPoundForm(String customerId) {

	this.customerId = customerId;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Set<StorePerLitterForm> getBuyList() {
	return buyList;
}
public void setBuyList(Set<StorePerLitterForm> buyList) {
	this.buyList = buyList;
}
public Map<Integer, String> getContainers() {
	return containers;
}
public void setContainers(Map<Integer, String> containers) {
	this.containers = containers;
}
public BuyForm getBuyForm() {
	return buyForm;
}
public void setBuyForm(BuyForm buyForm) {
	this.buyForm = buyForm;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public Admin getAdmin() {
	return admin;
}
public void setAdmin(Admin admin) {
	this.admin = admin;
}
public Store getStore() {
	return store;
}
public void setStore(Store store) {
	this.store = store;
}
}
