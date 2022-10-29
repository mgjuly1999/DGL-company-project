package com.example.form;

import java.util.List;

import com.example.models.Customer;
import com.example.models.Store;
import com.example.models.StorePerLitter;

public class RequireStorePerLitterForm {
private Customer customer;
private StorePerLitter storePerLitter;
private String rubberLitterFlag;
private Store store;
private List<Store> stores;

private List<StorePerLitter> storePerLitters;



public List<StorePerLitter> getStorePerLitters() {
	return storePerLitters;
}

public void setStorePerLitters(List<StorePerLitter> storePerLitters) {
	this.storePerLitters = storePerLitters;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public StorePerLitter getStorePerLitter() {
	return storePerLitter;
}

public void setStorePerLitter(StorePerLitter storePerLitter) {
	this.storePerLitter = storePerLitter;
}

public String getRubberLitterFlag() {
	return rubberLitterFlag;
}

public void setRubberLitterFlag(String rubberLitterFlag) {
	this.rubberLitterFlag = rubberLitterFlag;
}

public Store getStore() {
	return store;
}

public void setStore(Store store) {
	this.store = store;
}

public List<Store> getStores() {
	return stores;
}

public void setStores(List<Store> stores) {
	this.stores = stores;
}


}
