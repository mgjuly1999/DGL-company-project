package com.example.form;

public class AddLitterForm {
private String customerId;
private String storeId;
private String totalPound;
private String totalLitter;

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

public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

public String getStoreId() {
	return storeId;
}

public void setStoreId(String storeId) {
	this.storeId = storeId;
}
}
