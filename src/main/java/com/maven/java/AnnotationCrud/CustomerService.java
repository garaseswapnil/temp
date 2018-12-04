package com.maven.java.AnnotationCrud;
//Add by GitHUB
//add by github1
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Entity.Customer;
import util.AppUtil;

public interface CustomerService {
	
	public boolean addCustomer(Customer cust);
	public Customer getCustomer(int custId);
	public boolean deleteCustomer(int custId);
	public Customer updateCustomer(Customer cust);
	public List<Customer> getAllCustomers();
}
	class CustomerImpl implements CustomerService{
		
		private static SessionFactory sessionFactory = null;
		static{
			sessionFactory = AppUtil.getSessionFactory();
		}
		@Override
		public boolean addCustomer(Customer cust) {
			try{
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(cust);
			AppUtil.closeResource(session,tr);
			return true;
			}catch(Exception e){
				return false;
			}
		}
		@Override
		public Customer getCustomer(int custId) {
			try{
				Session session = sessionFactory.openSession();
				Customer cust = session.get(Customer.class, custId);
				AppUtil.closeResource(session, null);
				return cust;
			}catch(Exception e){
				return null;
			}
		}
		@Override
		public boolean deleteCustomer(int custId) {
			try{
				Customer dbCust = getCustomer(custId);
				if(dbCust!=null){
					Session session = sessionFactory.openSession();
					Transaction tr = session.beginTransaction();
					session.delete(dbCust);
					AppUtil.closeResource(session, tr);
					return true;
				}System.out.println("no customer exist with given id so cannot delete");
				return false;
			}catch(Exception e){
				return false;
			}
		}
		
		@Override
		public Customer updateCustomer(Customer cust) {
			try{
				Customer dbCust = getCustomer(cust.getCustId());
				if(dbCust!=null){
					Session session = sessionFactory.openSession();
					Transaction tr = session.beginTransaction();
					Customer updatedCust = (Customer)session.merge(cust);
					AppUtil.closeResource(session, tr);
					return updatedCust;
				}
				System.out.println("no customer exist with given id so cannot update");
				return null;
			}catch(Exception e){
				return null;
			}
		}
		@Override
		public List<Customer> getAllCustomers() {
			Session session = AppUtil.getSessionFactory().openSession();
			List<Customer>customerList = session.createCriteria(Customer.class).list();
			AppUtil.closeResource(session, null);
			return customerList;
		}	
	}
