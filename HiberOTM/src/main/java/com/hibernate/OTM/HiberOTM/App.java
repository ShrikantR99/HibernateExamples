package com.hibernate.OTM.HiberOTM;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class App 
{
    public static void main( String[] args )
    {
    	Product p1 = new Product();
    	Product p2 = new Product();
    	Product p3 = new Product();
    	Product p4 = new Product();
    	List<Product> list1 = new ArrayList<Product>();
    	List<Product> list2 = new ArrayList<Product>();
    	list1.add(p1);
    	list1.add(p2);
    	list2.add(p3);
    	list2.add(p4);
    	Customer c1 = new Customer(11,"Ajay",23,list1);
    	Customer c2 = new Customer(12,"Amit",24,list2);
    	p1.setP_id(1111);
    	p1.setP_name("Watch");
    	p1.setP_cost(4500);
    	p1.setCust(c1);
    	p2.setP_id(2222);
    	p2.setP_name("Mobile");
    	p2.setP_cost(25000);
    	p2.setCust(c1);
    	p3.setP_id(3333);
    	p3.setP_name("Laptop");
    	p3.setP_cost(85000);
    	p3.setCust(c2);
    	p4.setP_id(4444);
    	p4.setP_name("Bike");
    	p4.setP_cost(120000);
    	p4.setCust(c2);
    	Configuration cfg = new Configuration().configure();
    	SessionFactory factory  = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction trans = session.beginTransaction();
    	session.save(c1);
    	session.save(c2);
    	session.save(p1);
    	session.save(p2);
    	session.save(p3);
    	session.save(p4);
    	trans.commit();
    	System.out.println("Objects are saved");
    }
}

