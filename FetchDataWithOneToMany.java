package com.mahesh.example;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mahesh.pojo.customer;
import com.mahesh.pojo.vendor;

public class FetchDataWithOneToMany {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		vendor vend=(vendor)ss.get(vendor.class,101);
		Set customerlistdata=vend.getCustomer();
		Iterator it=customerlistdata.iterator();
		while(it.hasNext())
		{
			customer cust=(customer)it.next();
			System.out.println(cust.getCustomerid());
			System.out.println(cust.getCustomername());
			System.out.println(cust.getCustomeraddress());
			
	}
		System.out.println(vend.getVname());
		ss.close();
		sf.close();
	}

}
