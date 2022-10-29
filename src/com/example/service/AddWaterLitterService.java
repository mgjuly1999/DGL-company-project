package com.example.service;

import java.util.List;

import org.apache.commons.collections.functors.ForClosure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.dao.CustomerDao;
import com.example.dao.StoreDao;
import com.example.dao.StorePerLitterDao;
import com.example.form.AddWaterLitterForm;
import com.example.form.WaterLitterForm;
import com.example.form.StoreForm;
import com.example.models.Customer;
import com.example.models.Store;
import com.example.utlit.Format;


@Service
@Repository
public class AddWaterLitterService {
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private StoreDao storeDao;
	@Autowired
	private StorePerLitterDao storePerLitterDao;
	@Autowired
	private Format format;
public void prepareAddWaterLitter(AddWaterLitterForm addWaterLitterForm)
{
	int addressId=0;
	int customerId=0;
	
			if(addWaterLitterForm.getAddressId()!=null)
			{
		addressId=Integer.parseInt(addWaterLitterForm.getAddressId());
		addWaterLitterForm.setStore(null);
			}else if(addWaterLitterForm.getCustomerId()!=null)
			{
		customerId=Integer.parseInt(addWaterLitterForm.getCustomerId());
		addWaterLitterForm.setCustomer(customerDao.getCustomerById(customerId));		
		addWaterLitterForm.setStores(storeDao.getWaterLitterZeroStoresByCustomerId(customerId));
		
		addressId=addWaterLitterForm.getCustomer().getAddress().getAddressId();	
				
		 for(Store store: addWaterLitterForm.getStores())
		 {
			store.setTotalPound(Format.decimalFmt(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0)));
		 }
		 addWaterLitterForm.setStore(null);
			}else if(addWaterLitterForm.getStoreId()!=null)
			{
				Store singleStore=storeDao.getStoreById(Integer.parseInt(addWaterLitterForm.getStoreId()));
				singleStore.setTotalPound(storePerLitterDao.getTotalPoundsByStoreId(singleStore.getStoreId()).get(0));
				addWaterLitterForm.setStore(singleStore);
				customerId=singleStore.getCustomer().getCustomerId();
				addWaterLitterForm.setCustomer(customerDao.getCustomerById(customerId));	
				addressId=addWaterLitterForm.getCustomer().getAddress().getAddressId();	
				addWaterLitterForm.setStores(storeDao.getWaterLitterZeroStoresByCustomerId(customerId));
				
						
				 for(Store store: addWaterLitterForm.getStores())
				 {
					store.setTotalPound(Format.decimalFmt(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0)));
				 }
				 addWaterLitterForm.setStore(singleStore);
			
				
			}else if(addWaterLitterForm.getWaterLitterForm()!=null)
			{

				
				Store singleStore=storeDao.getStoreById(Integer.parseInt(addWaterLitterForm.getWaterLitterForm().getStoreId()));
				singleStore.setWaterLitter(this.format.decimalFmt(addWaterLitterForm.getWaterLitterForm().getWaterLitter()));
				singleStore.setAdminByGoldAdminId(addWaterLitterForm.getWaterLitterForm().getAdmin());
				singleStore.setDryPound(Format.decimalFmt(((singleStore.getTotalLitter()+singleStore.getWaterLitter())*0.385)));
				singleStore.setDrc(Format.decimalFmt(singleStore.getDryPound()/singleStore.getTotalLitter()));
		        
				storeDao.updateStore(singleStore);
				
				customerId=singleStore.getCustomer().getCustomerId();
				addWaterLitterForm.setCustomer(customerDao.getCustomerById(customerId));	
				addressId=addWaterLitterForm.getCustomer().getAddress().getAddressId();	
				addWaterLitterForm.setStores(storeDao.getWaterLitterZeroStoresByCustomerId(customerId));
				
						
				 for(Store store: addWaterLitterForm.getStores())
				 {
					store.setTotalPound(Format.decimalFmt(storePerLitterDao.getTotalPoundsByStoreId(store.getStoreId()).get(0)));
				 }
				 addWaterLitterForm.setStore(singleStore);
			}
			
			List<Customer> customerList=customerDao.getCustomersByWaterLitterZero(addressId);
			addWaterLitterForm.setCustomers(customerList);
			addWaterLitterForm.setAddress(addressDao.getAddressById(addressId));	
}
}
