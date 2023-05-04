package com.mahesh.example;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mahesh.pojo.customer;
import com.mahesh.pojo.vendor;

public class ReadMultipleRowsWithOneToMany {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		Query query=ss.createQuery("from vendor v");
		List listresult=query.list();
		Iterator it=listresult.iterator();
		while(it.hasNext())
		{
			vendor vend=(vendor)it.next();
			System.out.println(vend.getVid());
			System.out.println(vend.getVname());
			
			
			
			Set set=vend.getCustomer();
			Iterator it2=set.iterator();
			while(it2.hasNext()) {
				customer cust=(customer)it2.next();
				System.out.println(cust.getCustomerid());
				System.out.println(cust.getCustomername());
				System.out.println(cust.getCustomeraddress());

			}
		}
		
	}

}
