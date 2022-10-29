package com.example.form;

import java.util.Date;
import java.util.List;

import com.example.models.Address;
import com.example.models.Customer;

public class CustomerRegisterForm {
	private Integer customerId;
	private Address address;
	private String name;
	private String gender;
	private String phone;
	private Date createDate;
	private String addressId;
	private Customer frmCustomer;
	private List<Customer> frmCustomers;
	public CustomerRegisterForm()
	{
		
	}
	public CustomerRegisterForm(Integer customerId, Address address, String name, String gender, String phone,
			Date createDate) {
		
		this.customerId = customerId;
		this.address = address;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.createDate = createDate;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAddressId() {
		return addressId;
	}
	public Customer getFrmCustomer() {
		return frmCustomer;
	}
	public void setFrmCustomer(Customer frmCustomer) {
		this.frmCustomer = frmCustomer;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public List<Customer> getFrmCustomers() {
		return frmCustomers;
	}
	public void setFrmCustomers(List<Customer> frmCustomers) {
		this.frmCustomers = frmCustomers;
	}
	@Override
	public String toString() {
		return "RoleRegisterForm [customerId=" + customerId + ", address=" + address + ", name=" + name + ",Gender="
				+ gender + ", phone=" + phone + ", createDate=" + createDate + "]";
	}
}
