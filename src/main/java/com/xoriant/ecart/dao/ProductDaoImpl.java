package com.xoriant.ecart.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xoriant.ecart.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao1{

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Session initiateSession() {
		return sessionFactory.openSession();
	}

	private void destroySession(Session session) {
		if (session != null) {

			if (session.isDirty())
				session.flush();
			session.close();
		}
	}

	
	@Override
	@Transactional
	public String addNewProduct1(Product product) {
		Session session=initiateSession();
		
		try {
			  Transaction t = session.beginTransaction();  
			  String sql="insert into products values("+21+",'"+product.getProductName()+"',"+product.getProductPrice()+","+product.getBrand().getBrandId()+","+product.getCategory().getCategoryId()+")";
				/* session.save(product); */
			  System.out.println(sql);
			 Query query= session.createSQLQuery(sql);
			 query.executeUpdate();
		      t.commit();  
			 
				 return "New Product added";
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			destroySession(session);
		}
		return null;
	}

}
