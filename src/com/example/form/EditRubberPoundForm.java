package com.example.form;
import java.util.List;

import com.example.models.Address;
import com.example.models.Customer;
import com.example.models.Store;
import com.example.models.StorePerLitter;
public class EditRubberPoundForm {
private String addressId;
private String customerId;
private String editPoundFlag;
private String storePerLitterId;
private Address address;
private Customer customer;
private List<Customer> customers;
private List<Store> stores;
private Store store;
private StorePerLitter storePerLitter;
private UpdatePoundForm updatePoundForm=null; 

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public List<Customer> getCustomers() {
	return customers;
}
public String getAddressId() {
	return addressId;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public void setAddressId(String addressId) {
	this.addressId = addressId;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

public List<Store> getStores() {
	return stores;
}
public String getEditPoundFlag() {
	return editPoundFlag;
}
public StorePerLitter getStorePerLitter() {
	return storePerLitter;
}
public void setStorePerLitter(StorePerLitter storePerLitter) {
	this.storePerLitter = storePerLitter;
}
public void setEditPoundFlag(String editPoundFlag) {
	this.editPoundFlag = editPoundFlag;
}

public String getStorePerLitterId() {
	return storePerLitterId;
}
public UpdatePoundForm getUpdatePoundForm() {
	return updatePoundForm;
}
public Store getStore() {
	return store;
}
public void setStore(Store store) {
	this.store = store;
}
public void setUpdatePoundForm(UpdatePoundForm updatePoundForm) {
	this.updatePoundForm = updatePoundForm;
}
public void setStorePerLitterId(String storePerLitterId) {
	this.storePerLitterId = storePerLitterId;
}
public void setStores(List<Store> stores) {
	this.stores = stores;
}
}
