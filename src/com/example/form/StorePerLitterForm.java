package com.example.form;

public class StorePerLitterForm {
	private String storeId;
	private String storePerLitterId;
	private String litter;
	private String pound; 
	private String container;
	private String containerName;
	public StorePerLitterForm()
	{
		
	}
	public StorePerLitterForm(String storeId,String litter, String pound, String container,String containerName) {
		
		this.litter = litter;
		this.pound = pound;
		this.container = container;
		this.containerName=containerName;
		this.storeId=storeId;
		
	}
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
	public String getStorePerLitterId() {
		return storePerLitterId;
	}
	public void setStorePerLitterId(String storePerLitterId) {
		this.storePerLitterId = storePerLitterId;
	}
	public String getContainerName() {
		return containerName;
	}
	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}
	@Override
	public String toString() {
		return "StorePerLitterForm [storePerLitterId=" + storePerLitterId + ", litter=" + litter + ", pound=" + pound
				+ ", container=" + container + "]";
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
}
