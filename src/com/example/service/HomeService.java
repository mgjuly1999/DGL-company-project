package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.dao.AdminDao;
import com.example.dao.CustomerDao;
import com.example.dao.RoleDao;
import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.HomeForm;
import com.example.models.Store;
import com.example.utlit.Format;

@Service
@Repository("homeService")
public class HomeService {
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private StoreDao storeDao;
	@Autowired
	private StorePerLitterDao storePerLitterDao;
	@Autowired
	private RoleDao roleDao;
	
public void prepareHome(HomeForm myForm)
{
	myForm.setTotalAdmin(adminDao.getAdminCount());
	myForm.setTotalCustomer(customerDao.getCustomerCount());
	myForm.setBuyCount(storeDao.getStoreCount());
	myForm.setStores(storeDao.getWaterLitterZeroStores());
	 for(Store store: myForm.getStores())
	 {
		store.setTotalPound(Format.decimalFmt(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0)));
	 }
	myForm.setRequireLitterStores(storeDao.getWaterAndTotalZeroStores());
	for(Store store: myForm.getRequireLitterStores())
	 {
		store.setTotalPound(Format.decimalFmt(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0)));
	 }
	myForm.setAddListForInsertRubberLitter(addressDao.getAddressByStorePerLitterZero());
	myForm.setAddListForInsertWaterLitter(addressDao.getAddressByWaterLitterZero());
	myForm.setAddListForShowAllStore(addressDao.getAddressByCorrectStore());
	myForm.setAddressList(addressDao.getAddress());
	myForm.setCurrentAdmin(myForm.getCurrentAdmin());
	myForm.setTotalAdmin(roleDao.getGoldAdminCount());
	myForm.setTotalStaff(roleDao.getSliverAdminCount());
	myForm.setNumComplete(storeDao.getCorrectStoresByCount());
	myForm.setNumReqLitterAndWater(storeDao.getWaterAndTotalZeroStoresCount());
	myForm.setNumReqWaterLitter(storeDao.getWaterLitterZeroCount());
	
}
}
