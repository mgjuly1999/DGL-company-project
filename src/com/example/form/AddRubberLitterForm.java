package com.example.form;

import java.util.List;

import com.example.models.Address;
import com.example.models.Customer;
import com.example.models.Store;
import com.example.models.StorePerLitter;
public class AddRubberLitterForm {
private String customerId;
private Customer customer;
private String storeId;
private String storePerLitterId;
private List<Store> stores;
private List<StorePerLitter> storePerLitters;
private StorePerLitter storePerLitter;
private List<Customer> customers;
private UpdatePoundForm updatePoundForm;
private Store store;
private Address address;
private String flag;
private AddLitterForm addLitterForm;

public AddRubberLitterForm()
{
	
}

public AddRubberLitterForm(String customerId) {
	this.customerId = customerId;
}

public AddRubberLitterForm(AddLitterForm addLitterForm) {
	this.addLitterForm=addLitterForm;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public List<StorePerLitter> getStorePerLitters() {
	return storePerLitters;
}
public void setStorePerLitters(List<StorePerLitter> storePerLitters) {
	this.storePerLitters = storePerLitters;
}
public List<Store> getStores() {
	return stores;
}
public void setStores(List<Store> stores) {
	this.stores = stores;
}
public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
public StorePerLitter getStorePerLitter() {
	return storePerLitter;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void setStorePerLitter(StorePerLitter storePerLitter) {
	this.storePerLitter = storePerLitter;
}
public String getStoreId() {
	return storeId;
}
public void setStoreId(String storeId) {
	this.storeId = storeId;
}
public Store getStore() {
	return store;
}
public String getStorePerLitterId() {
	return storePerLitterId;
}

public void setStorePerLitterId(String storePerLitterId) {
	this.storePerLitterId = storePerLitterId;
}

public UpdatePoundForm getUpdatePoundForm() {
	return updatePoundForm;
}

public void setUpdatePoundForm(UpdatePoundForm updatePoundForm) {
	this.updatePoundForm = updatePoundForm;
}

public void setStore(Store store) {
	this.store = store;
}
public String getFlag() {
	return flag;
}
public AddLitterForm getAddLitterForm() {
	return addLitterForm;
}
public void setAddLitterForm(AddLitterForm addLitterForm) {
	this.addLitterForm = addLitterForm;
}
public void setFlag(String flag) {
	this.flag = flag;
}


}
