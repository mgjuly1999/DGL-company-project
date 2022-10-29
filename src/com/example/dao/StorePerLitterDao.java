package com.example.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.example.models.StorePerLitter;
@Repository("storePerLitterDao")
public class StorePerLitterDao extends AbstractDao<Integer,StorePerLitter>{
	public StorePerLitter saveStorePerLitter(StorePerLitter storePerLitter)
	{
		
	return (StorePerLitter)super.persist(storePerLitter);

		}
public StorePerLitter getStorePerLitterById(StorePerLitter storePerLitter) {
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("storePerLitterId",storePerLitter.getStorePerLitterId()));
		return (StorePerLitter) c.list().get(0);
	}

public StorePerLitter getStorePerLitterById(int storePerLitterId) {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("storePerLitterId",storePerLitterId));
	return (StorePerLitter) c.list().get(0);
}


	public List<StorePerLitter> getCustomerIdByRequireLitter(int customerId)
	{
		String sql="select distinct store_per_litter.* "
				+ "from store_per_litter "
				+ "where store_per_litter.litter=0.0 AND "
				+ "store_per_litter.store_id IN "
				+ "(select distinct store.store_id  "
				+ "from store  "
				+ "where store.water_litter=0.0 AND "
				+ "store.customer_id IN "
				+ "(select distinct customer.customer_id  "
				+ "from customer  "
				+ "where customer.customer_id="+customerId+"));";			
	return	super.createSelectQuery(sql);
	}
	
	
public StorePerLitter  updateStorePerLitter(StorePerLitter storePerLitter)
{
	
return	(StorePerLitter) super.merge(storePerLitter);

}
public void deleteByStorePerLitter(StorePerLitter storePerLitter)
{
	super.delete(storePerLitter);
}
public List<StorePerLitter> getStorePerLitter(){
	Criteria c=super.createEntityCriteria();
	List<StorePerLitter> l=c.list();
	 return l==null || l.isEmpty() ||l.get(0)==null ? null : l;

}
public List<Double> getTotalLittersByStoreId(Integer storeId) {
	
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("store.storeId",storeId));
	c.setProjection(Projections.sum("litter"));
	return  c.list();
}
public List<Double> getTotalPoundsByStoreId(Integer storeId) {
	
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("store.storeId",storeId));
	c.setProjection(Projections.sum("pound"));
	return  c.list();
}

}
