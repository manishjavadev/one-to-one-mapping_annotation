package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.AdharCard;
import com.manish.javadev.model.UserDetail;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// Create UserDetail
		UserDetail userDetail = new UserDetail("Abdul", "Kaji", 28);

		// Create AdharCard
		AdharCard adharCard = new AdharCard("Delhi", "UTTAR PRADESH", "ADH00022");
		userDetail.setAdharCard(adharCard);

		session.save(userDetail);

		tx.commit();
		session.close();
		System.out.println("Done");
	}
}
