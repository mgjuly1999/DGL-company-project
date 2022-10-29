package com.example.form;

import com.example.models.Admin;
import com.example.models.Store;

import java.util.List;

import com.example.models.Address;
public class HomeForm {
private Admin currentAdmin;
private String role;
private int numReqLitterAndWater;
private int numReqWaterLitter;
private int numComplete;
private int totalCustomer;
private int totalAdmin;
private int totalStaff;
private int buyCount;
private List<Store> requireLitterStores;
private List<Store> stores;
private List<Address> addListForShowAllStore;
private List<Address> addListForInsertWaterLitter;
private List<Address> addListForInsertRubberLitter;
private List<Address> addressList;

public Admin getCurrentAdmin() {
	return currentAdmin;
}
public void setCurrentAdmin(Admin currentAdmin) {
	this.currentAdmin = currentAdmin;
}
public List<Address> getAddListForShowAllStore() {
	return addListForShowAllStore;
}
public void setAddListForShowAllStore(List<Address> addListForShowAllStore) {
	this.addListForShowAllStore = addListForShowAllStore;
}
public List<Address> getAddListForInsertWaterLitter() {
	return addListForInsertWaterLitter;
}
public void setAddListForInsertWaterLitter(List<Address> addListForInsertWaterLitter) {
	this.addListForInsertWaterLitter = addListForInsertWaterLitter;
}
public List<Address> getAddListForInsertRubberLitter() {
	return addListForInsertRubberLitter;
}
public void setAddListForInsertRubberLitter(List<Address> addListForInsertRubberLitter) {
	this.addListForInsertRubberLitter = addListForInsertRubberLitter;
}
public List<Address> getAddressList() {
	return addressList;
}
public void setAddressList(List<Address> addressList) {
	this.addressList = addressList;
}
public String getRole() {
	return role;
}
public int getTotalCustomer() {
	return totalCustomer;
}
public void setTotalCustomer(int totalCustomer) {
	this.totalCustomer = totalCustomer;
}
public double getNumReqLitterAndWater() {
	return numReqLitterAndWater;
}

public int getNumReqWaterLitter() {
	return numReqWaterLitter;
}
public void setNumReqWaterLitter(int numReqWaterLitter) {
	this.numReqWaterLitter = numReqWaterLitter;
}
public int getNumComplete() {
	return numComplete;
}
public void setNumComplete(int numComplete) {
	this.numComplete = numComplete;
}
public void setNumReqLitterAndWater(int numReqLitterAndWater) {
	this.numReqLitterAndWater = numReqLitterAndWater;
}
public int getBuyCount() {
	return buyCount;
}
public int getTotalAdmin() {
	return totalAdmin;
}

public void setTotalAdmin(int totalAdmin) {
	this.totalAdmin = totalAdmin;
}
public int getTotalStaff() {
	return totalStaff;
}
public void setTotalStaff(int totalStaff) {
	this.totalStaff = totalStaff;
}
public List<Store> getStores() {
	return stores;
}
public void setStores(List<Store> stores) {
	this.stores = stores;
}
public List<Store> getRequireLitterStores() {
	return requireLitterStores;
}
public void setRequireLitterStores(List<Store> requireLitterStores) {
	this.requireLitterStores = requireLitterStores;
}
public void setBuyCount(int buyCount) {
	this.buyCount = buyCount;
}
public void setRole(String role) {
	this.role = role;
}

}
