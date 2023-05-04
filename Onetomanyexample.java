package com.mahesh.example;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mahesh.pojo.customer;
import com.mahesh.pojo.vendor;

public class Onetomanyexample {

	public static void main(String[] args) {
		Set customer=new HashSet();
		
		vendor vr=new vendor();
		vr.setVid(103);
		vr.setVname("deloitte");
		
		customer cr=new customer();
		cr.setCustomerid(16);
		cr.setCustomername("manoj");
		cr.setCustomeraddress("markapuram");
		
		customer cr1=new customer();
		cr1.setCustomerid(17);
		cr1.setCustomername("gopi");
		cr1.setCustomeraddress("snpadu");
		
		customer cr2=new customer();
		cr2.setCustomerid(18);
		cr2.setCustomername("snajeev");
		cr2.setCustomeraddress("hyderabad");
		
		customer.add(cr);
		customer.add(cr1);
		customer.add(cr2);
		
		vr.setCustomer(customer);
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.save(vr);
		ts.commit();
		
		
	}

}
