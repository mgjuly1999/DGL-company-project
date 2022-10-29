package com.example.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.xml.internal.stream.Entity;

public abstract class AbstractDao<PK extends Serializable,T> {
	@Autowired
	private SessionFactory sessionFactory;
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass=(Class<T>)
				((ParameterizedType)this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}
	protected Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	//select * from table where PK=
	public T getByKey(PK key){
		return (T)getSession().get(this.persistentClass, key);
	}
	//insert or update
	public Object persist(T entity){
	
		getSession().persist(entity);
		
		
		return entity;
	}
	
	public Object merge(T entity){
		
	
		
	return	getSession().merge(entity);
	
	 
	}
	//delete
	public void delete(T entity){
		getSession().delete(entity);
		
		
	}
	//select
	public Criteria createEntityCriteria(){
		return getSession().createCriteria(this.persistentClass);
	}
	
	public  List<T> createSelectQuery(String sql){
		SQLQuery query =getSession().createSQLQuery(sql);
		    query.addEntity(this.persistentClass);
	         List<T> objList = query.list();
	     
	         return objList;
	}
	public  void createDeleteQuery(String sql){
		SQLQuery query =getSession().createSQLQuery(sql);
		    query.executeUpdate();
	        
	}
	
	
	public SQLQuery createQuery(String sql){
		SQLQuery query = getSession().createSQLQuery(sql);
		query.addEntity(this.persistentClass);
		
		return query;
	}
	
	
	

}
