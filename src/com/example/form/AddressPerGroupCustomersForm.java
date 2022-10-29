package com.example.form;

import java.util.List;

import com.example.models.Address;
import com.example.models.Customer;

public class AddressPerGroupCustomersForm {
private List<Customer> customers;
private Address address;
private String addressId;

public AddressPerGroupCustomersForm()
{
	
}
public AddressPerGroupCustomersForm(String addressId)
{
	this.addressId = addressId;
}
public AddressPerGroupCustomersForm(List<Customer> customers, Address address, String addressId) {
	
	this.customers = customers;
	this.address = address;
	this.addressId = addressId;
}
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

}
