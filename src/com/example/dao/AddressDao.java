package com.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.example.models.Address;
import com.example.models.Store;


@Repository("addressDoa")
public class AddressDao extends AbstractDao<Integer,Address>  {
	
	public Address saveAddress(Address address)
	{
	return (Address)super.persist(address);

		}
public Address getAddressById(Address address) {
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("addressId",address.getAddressId()));
		return (Address) c.list().get(0);
	}

public Address  updateAddress(Address address)
{
return	(Address) super.merge(address);

}
public List<Address> getAddressByStorePerLitterZero()
{
	String sql="select distinct address.* "
			+ "from customer,address "
			+ "where customer.address_id=address.address_id AND "
			+ "customer.customer_id "
			+ "IN(select distinct store.customer_id  "
			+ "from store  "
			+ "where store.total_litter=0.0 AND "
			+ "store.water_litter=0.0);";
	
return	super.createSelectQuery(sql);
}
public List<Address> getAddressByWaterLitterZero()
{
	String sql="select distinct address.* "
			+ "from customer,address "
			+ "where customer.address_id=address.address_id AND "
			+ "customer.customer_id IN(select distinct store.customer_id  "
			+ "from store  "
			+ "where store.water_litter=0.0 AND "
			+ "store.total_litter!=0.0);";
	
return	super.createSelectQuery(sql);
}



public List<Address> getAddress(){
	Criteria c=super.createEntityCriteria();
	List<Address> l=c.list();

	 return l==null || l.isEmpty() ||l.get(0)==null ? null : l;

}
public Address getAddressById(int addressId) {
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("addressId",addressId));
	return (Address) c.list().get(0);
}
public List<Address> getAddressByCorrectStore() {
	String sql="select distinct address.* "
			+ "from address "
			+ "where address.address_id "
			+ "IN (select distinct customer.address_id "
			+ "from customer where "
			+ "customer.customer_id "
			+ "IN (select distinct store.customer_id "
			+ "from store where "
			+ "store.water_litter>0.0 "
			+ "AND store.drc>0.0 "
			+ "AND store.dry_pound>0.0 "
			+ "AND store.total_litter>0.0));";
	return	super.createSelectQuery(sql);
}
}
