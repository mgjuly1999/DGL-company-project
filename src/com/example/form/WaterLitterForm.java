package com.example.form;

import com.example.models.Admin;

public class WaterLitterForm {
private String waterLitter;
private String storeId;
private Admin admin;

public String getWaterLitter() {
	return waterLitter;
}

public void setWaterLitter(String waterLitter) {
	this.waterLitter = waterLitter;
}

public String getStoreId() {
	return storeId;
}

public void setStoreId(String storeId) {
	this.storeId = storeId;
}

public Admin getAdmin() {
	return admin;
}

public void setAdmin(Admin admin) {
	this.admin = admin;
}
}
