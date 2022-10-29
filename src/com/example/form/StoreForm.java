package com.example.form;

import java.util.Date;
import java.util.List;

import com.example.models.Store;
import com.example.models.StorePerLitter;
import com.example.models.Admin;
import com.example.models.Customer;

public class StoreForm {
	private String customerId;
	private Customer customer;
	private String storeId;
	private String waterLitter;
	private String totalPound;
	private String totalLitter;
	private Admin goldAdmin;
	private Store store;
	private List<Store> stores;
	private StorePerLitter storePerLitter;
	private List<StorePerLitter> storePerLitters;
	public StoreForm() {
		
		
	}
	public StoreForm(String storeId, String waterLitter) {
	
		this.storeId = storeId;
		this.waterLitter = waterLitter;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getWaterLitter() {
		return waterLitter;
	}
	public void setWaterLitter(String waterLitter) {
		this.waterLitter = waterLitter;
	}
	public String getTotalPound() {
		return totalPound;
	}
	public void setTotalPound(String totalPound) {
		this.totalPound = totalPound;
	}
	public String getTotalLitter() {
		return totalLitter;
	}
	public void setTotalLitter(String totalLitter) {
		this.totalLitter = totalLitter;
	}
	public Admin getGoldAdmin() {
		return goldAdmin;
	}
	public void setGoldAdmin(Admin goldAdmin) {
		this.goldAdmin = goldAdmin;
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
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public StorePerLitter getStorePerLitter() {
		return storePerLitter;
	}
	public void setStorePerLitter(StorePerLitter storePerLitter) {
		this.storePerLitter = storePerLitter;
	}
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
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	
	

	
}
