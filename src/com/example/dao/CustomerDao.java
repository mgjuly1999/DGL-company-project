package com.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.example.models.Customer;

@Repository("customerDao")
public class CustomerDao extends AbstractDao<Integer,Customer> {
	public Customer saveCustomer(Customer customer)
	{
	return (Customer)super.persist(customer);

		}
	
public Customer getCustomerById(Customer customer) {
		
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("customerId",customer.getCustomerId()));
		

		return (Customer) c.list().get(0);
	}
public Customer getCustomerById(int customerId) {
	
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("customerId",customerId));
	

	return (Customer) c.list().get(0);
}




public Customer  updateCustomer(Customer customer)
{
return	(Customer) super.merge(customer);

}
public List<Customer> getCustomers(){
	Criteria c=super.createEntityCriteria();
	return c.list();

}

public int getCustomerCount()
{
	Criteria c=super.createEntityCriteria();
	Long l=(Long) c.setProjection(Projections.rowCount()).uniqueResult();
	return l.intValue();

}

public List<Customer> getCustomerByAddressId(int addressId) {
	
	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("address.addressId",addressId));
	return c.list();
}


public List<Customer> getStoreCorrectCustomersByAddressId(Integer addressId)
{
	String sql="select distinct customer.* "
			+ "from customer,address,store "
			+ "where customer.address_id="+addressId+" "
			+ "AND store.customer_id=customer.customer_id "
			+ "AND store.drc>0.0 "
			+ "AND store.dry_pound>0.0 "
			+ "AND store.total_litter>0.0 "
			+ "AND store.water_litter>0.0;";
	
	return  super.createSelectQuery(sql);
	
}

public List<Customer> getCustomersByWaterLitterZero(int addressId) {
	
	String sql="select * "
			+ "from customer "
			+ "where customer.address_id="+addressId+" "
					+ "AND customer.customer_id IN ("
					+ "select store.customer_id "
					+ "from store "
					+ "where store.water_litter=0.0 "
					+ "AND store.drc=0.0 "
					+ "AND store.total_litter>=0.0 "
					+ "AND store.dry_pound=0.0);";
	
	return  super.createSelectQuery(sql);
}

public List<Customer> getCustomerByTotalLitterZero(int addressId) {
	String sql="select * "
			+ "from customer "
			+ "where customer.address_id="+addressId+" "
					+ "AND customer.customer_id IN ("
					+ "select store.customer_id "
					+ "from store "
					+ "where store.water_litter=0.0 "
					+ "AND store.drc=0.0 "
					+ "AND store.total_litter=0.0 "
					+ "AND store.dry_pound=0.0);";

	return  super.createSelectQuery(sql);
}

	
}
