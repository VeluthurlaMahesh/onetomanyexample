package com.mahesh.example;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mahesh.pojo.customer;
import com.mahesh.pojo.vendor;

public class OneToManyRemoveChildParentClient {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		vendor vend=(vendor)ss.get(vendor.class,101);
		Set setcust=vend.getCustomer();
		customer cust=(customer)ss.get(customer.class,10);
		Transaction tx=ss.beginTransaction();
		setcust.remove(cust);
		tx.commit();
		ss.close();
	}

}
