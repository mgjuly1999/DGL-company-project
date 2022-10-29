package com.example.form;


import java.util.Set;

import com.example.models.Admin;
import com.example.models.Customer;
import com.example.models.Store;
import com.example.models.StorePerLitter;

public class BuyForm {
	private String storeId;
	private String litter;
	private String pound; 
	private String container;
	private String containerName;
	private Set<StorePerLitterForm> storePerLitterForm;
	public String getLitter() {
		return litter;
	}
	public void setLitter(String litter) {
		this.litter = litter;
	}
	public String getPound() {
		return pound;
	}
	public void setPound(String pound) {
		this.pound = pound;
	}
	public String getContainer() {
		return container;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	public String getContainerName() {
		return containerName;
	}
	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}
	public Set<StorePerLitterForm> getStorePerLitterForm() {
		return storePerLitterForm;
	}
	public void setStorePerLitterForm(Set<StorePerLitterForm> storePerLitterForm) {
		this.storePerLitterForm = storePerLitterForm;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	
}
