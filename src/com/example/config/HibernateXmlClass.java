package com.example.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.example")
@PropertySource(value={"classpath:application.properties"})
public class HibernateXmlClass {
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(
				environment.getRequiredProperty("jdbc.driverClassName"));
		ds.setUrl(environment.getRequiredProperty("jdbc.url"));
		ds.setUsername(environment.getRequiredProperty("jdbc.username"));
		ds.setPassword(environment.getRequiredProperty("jdbc.password"));
		return ds;
	}
	private Properties hibernateProperties(){
		Properties p=new Properties();
		p.put("hibernate.dialect",
				environment.getRequiredProperty("hibernate.dialect"));
		p.put("hibernate.show_sql",
				environment.getRequiredProperty("hibernate.show_sql"));
		p.put("hibernate.format_sql",
				environment.getRequiredProperty("hibernate.format_sql"));
		return p;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
			factory.setDataSource(dataSource());
			factory.setHibernateProperties(hibernateProperties());
			factory.setPackagesToScan("com.example.models");
			factory.setMappingResources(
					"com/example/models/Address.hbm.xml",
					"com/example/models/Admin.hbm.xml",
					"com/example/models/Customer.hbm.xml",
					"com/example/models/Role.hbm.xml",
					"com/example/models/Store.hbm.xml",
					"com/example/models/StorePerLitter.hbm.xml"
					);
		return factory;		
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s){
		HibernateTransactionManager txtManager=
				new HibernateTransactionManager();
		txtManager.setSessionFactory(s);
		return txtManager;
	}
}
