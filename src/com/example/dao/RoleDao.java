package com.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.example.models.Role;

@Repository("roleDao")
public class RoleDao extends AbstractDao<Integer,Role> {

	public Role saveRole(Role role)
	{
	return (Role)super.persist(role);
		}
	
	public int getSliverAdminCount()
	{
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("code","sa"));
		Role role=(Role) c.list().get(0);
	return	role.getAdmins().size();

	}
	public int getGoldAdminCount()
	{
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("code","ga"));
		Role role=(Role) c.list().get(0);
	return	role.getAdmins().size();

	}

public Role getRoleById(Role role) {
		Criteria c=super.createEntityCriteria();
		c.add(Restrictions.eq("roleId",role.getRoleId()));
		return (Role) c.list().get(0);
	}

public Role  updateRole(Role role)
{
return	(Role) super.merge(role);

}
public List<Role> getRole(){
	Criteria c=super.createEntityCriteria();
	List<Role> l=c.list();
	 return l==null || l.isEmpty() ||l.get(0)==null ? null : l;

}

}
