package com.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.example.models.Admin;

import jdk.nashorn.internal.ir.annotations.Reference;

@Repository("adminDao")
public class AdminDao extends AbstractDao<Integer,Admin> {
	public Admin saveAdmin(Admin admin)
	{
	return (Admin)super.persist(admin);

		}
	
	
public Admin getAdminById(Admin admin) {
		
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("adminId",admin.getAdminId()));
		

		return (Admin) c.list().get(0);
	}

public Admin  updateAdmin(Admin admin)
{
return	(Admin) super.merge(admin);

}
public List<Admin> getAdmin(){
	Criteria c=super.createEntityCriteria();
	return c.list();

}

public int getAdminCount()
{
	Criteria c=super.createEntityCriteria();
	Long l=(Long) c.setProjection(Projections.rowCount()).uniqueResult();
	return l.intValue();

}


public Admin getAdminByMailAndPassword(String mail,String pwd) {

	Criteria c=super.createEntityCriteria();
	c.add(Restrictions.eq("mail",mail));
	c.add(Restrictions.eq("pwd",pwd));
    List<Admin> l=c.list();
	 return l==null || l.isEmpty() ||l.get(0)==null ? null : l.get(0);

}
	
}
