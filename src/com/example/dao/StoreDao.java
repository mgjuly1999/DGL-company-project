package com.example.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.example.models.Customer;
import com.example.models.Store;
import com.example.models.StorePerLitter;

@Repository("storeDao")
public class StoreDao extends AbstractDao<Integer,Store>{
	public Store saveStore(Store store)
	{
	return (Store)super.persist(store);

		}
	public List<Store> getStoresByCustomerId(int customerId)
	{
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("customer.customerId",customerId));
		return  c.list();
		
	}

public int getStoreCount()
{
	Criteria c=super.createEntityCriteria();
	Long l=(Long) c.setProjection(Projections.rowCount()).uniqueResult();
	return l.intValue();

}

public Store getStoreById(Store store) {
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("storeId",store.getStoreId()));
		return (Store) c.list().get(0);
	}

public Store  updateStore(Store store)
{

return	(Store)super.merge(store);

}
public List<Store> getStore(){
	Criteria c=super.createEntityCriteria();
	List<Store> l=c.list();
	 return l==null || l.isEmpty() ||l.get(0)==null ? null : l;

}

public Store getStoreById(int storeId) {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("storeId",storeId));
	return (Store) c.list().get(0);
}
public List<Store> getWaterLitterZeroStoresByCustomerId(Integer customerId) {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("customer.customerId",customerId));
	c.add(Restrictions.eq("waterLitter",0.0));
	c.add(Restrictions.eq("drc",0.0));
	c.add(Restrictions.ne("totalLitter",0.0));
	c.add(Restrictions.eq("dryPound",0.0));
	
	return  c.list();
}
public List<Store> getWaterAndTotalZeroStoresByCustomerId(Integer customerId) {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("customer.customerId",customerId));
	c.add(Restrictions.eq("waterLitter",0.0));
	c.add(Restrictions.eq("drc",0.0));
	c.add(Restrictions.eq("totalLitter",0.0));
	c.add(Restrictions.eq("dryPound",0.0));
	
	return  c.list();
}
public List<Store> getWaterAndTotalZeroStores() {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("waterLitter",0.0));
	c.add(Restrictions.eq("drc",0.0));
	c.add(Restrictions.eq("totalLitter",0.0));
	c.add(Restrictions.eq("dryPound",0.0));
	
	return  c.list();
}

public int getWaterAndTotalZeroStoresCount() {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("waterLitter",0.0));
	c.add(Restrictions.eq("drc",0.0));
	c.add(Restrictions.eq("totalLitter",0.0));
	c.add(Restrictions.eq("dryPound",0.0));
	
	Long l=(Long) c.setProjection(Projections.rowCount()).uniqueResult();
	return l.intValue();
}

public int getWaterLitterZeroCount() {

	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("waterLitter",0.0));
	c.add(Restrictions.eq("drc",0.0));
	c.add(Restrictions.ne("totalLitter",0.0));
	c.add(Restrictions.eq("dryPound",0.0));
	Long l=(Long) c.setProjection(Projections.rowCount()).uniqueResult();
	return l.intValue();
}

public int getCorrectStoresByCount() {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.ne("createDate",new Date()));
	c.add(Restrictions.ne("waterLitter",0.0));
	c.add(Restrictions.ne("drc",0.0));
	c.add(Restrictions.ne("totalLitter",0.0));
	c.add(Restrictions.ne("dryPound",0.0));
	Long l=(Long) c.setProjection(Projections.rowCount()).uniqueResult();
	return l.intValue();

}

public List<Store> getCorrectStoresByCustomerId(int customerId) {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("customer.customerId",customerId));
	c.add(Restrictions.ne("waterLitter",0.0));
	c.add(Restrictions.ne("drc",0.0));
	c.add(Restrictions.ne("totalLitter",0.0));
	c.add(Restrictions.ne("dryPound",0.0));
	
	return  c.list();

}




public List<Store> getRequireWaterLttStoresByAddress(int addressId) {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("customer.address.addressId",addressId));
	c.add(Restrictions.eq("waterLitter",0.0));
	c.add(Restrictions.eq("drc",0.0));
	c.add(Restrictions.ne("totalLitter",0.0));
	c.add(Restrictions.eq("dryPound",0.0));	
	return  c.list();
}

public List<Store> getInCorrectStoresByCustomerId(int customerId) {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("customer.customerId",customerId));
	c.add(Restrictions.eq("waterLitter",0.0));
	c.add(Restrictions.eq("drc",0.0));
	c.add(Restrictions.eq("totalLitter",0.0));
	c.add(Restrictions.eq("dryPound",0.0));
	
	return  c.list();

}
public List<Store> getWaterLitterZeroStores() {

	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("waterLitter",0.0));
	c.add(Restrictions.eq("drc",0.0));
	c.add(Restrictions.ne("totalLitter",0.0));
	c.add(Restrictions.eq("dryPound",0.0));
	
	return  c.list();
}


}
