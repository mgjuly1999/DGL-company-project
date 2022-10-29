package com.example.form;

import java.util.List;

import com.example.models.Address;
import com.example.models.Customer;
import com.example.models.Store;
public class AddWaterLitterForm {
private List<Customer> customers;
private Address address;
private String addressId;
private String customerId;
private List<Store> stores;
private Customer customer;
private Store store;
private String storeId;
private WaterLitterForm waterLitterForm=null;


public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getAddressId() {
	return addressId;
}
public void setAddressId(String addressId) {
	this.addressId = addressId;
}
public List<Store> getStores() {
	return stores;
}
public void setStores(List<Store> stores) {
	this.stores = stores;
}
public String getCustomerId() {
	return customerId;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public Store getStore() {
	return store;
}
public void setStore(Store store) {
	this.store = store;
}
public String getStoreId() {
	return storeId;
}
public void setStoreId(String storeId) {
	this.storeId = storeId;
}
public WaterLitterForm getWaterLitterForm() {
	return waterLitterForm;
}

public void setWaterLitterForm(WaterLitterForm waterLitterForm) {
	this.waterLitterForm = waterLitterForm;
}

}
