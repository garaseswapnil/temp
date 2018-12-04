package com.maven.java.AnnotationCrud;

import java.util.List;

import Entity.Customer;

public class TestCustomerCrud {

	public static void main(String[] args){
		
		Customer customer1 = new Customer(1,"Swapnil",23,"Pune",12033.20);
		Customer customer2 = new Customer(2,"Sachin",23,"Pune",12033.20);
		CustomerImpl customer = new CustomerImpl();
		System.out.println("adding new customer");
		
		boolean isCustomerAddred = customer.addCustomer(customer1);
		String yesOrNo = isCustomerAddred ? "Yes" : "No";
		System.out.println("IsCustomerAdded  : " + yesOrNo);
		
		isCustomerAddred = customer.addCustomer(customer2);
		yesOrNo = isCustomerAddred ? "Yes" : "No";
		System.out.println("IsCustomerAdded  : " + yesOrNo);
		
		/*System.out.println("get Customer ");
		Customer dbCustomer = customer.getCustomer(1);
		System.out.println("getCustomer   : " + dbCustomer);
		
		System.out.println("update customer");
		dbCustomer.setCustAddress("Mumbai");
		Customer updatedCust = customer.updateCustomer(dbCustomer);
		System.out.println("update : Pune  -----   : " + dbCustomer);
		dbCustomer = customer.getCustomer(1);
		System.out.println("update : Mumbai -----   : " + dbCustomer);
		
		System.out.println("getAllCust");
		List<Customer> custList = customer.getAllCustomers();
		System.out.println("list of customer -  " + custList);
		
		boolean isCustomerdeleted = customer.deleteCustomer(1);
		yesOrNo = isCustomerAddred ? "Yes" : "No";
		System.out.println("IsCustomerdeleted  : " + yesOrNo);
		
		System.out.println("after delete");
		custList = customer.getAllCustomers();
		System.out.println("list of customer -  " + custList);*/
		
		
		/*Customer customer2 = new Customer(2,"Amit2",23,"Pune",12033.20);
		Customer customer3 = new Customer(1,"Amit3",23,"Pune",12033.20);
		Customer customer4 = new Customer(2,"Amit4",23,"Pune",12033.20);
		Customer customer5 = new Customer(1,"Amit5",23,"Pune",12033.20);
		Customer customer6 = new Customer(2,"Amit6",23,"Pune",12033.20);
		
		SessionFactory sessionfactory = AppUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(customer1);
		session.save(customer2);
		session.save(customer3);
		session.save(customer4);
		session.save(customer5);
		session.save(customer6);
		session.flush();
		tr.commit();*/
		
	}
}
