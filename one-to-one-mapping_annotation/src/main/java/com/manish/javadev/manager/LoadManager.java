package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.AdharCard;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		AdharCard adharCard = (AdharCard) session.get(AdharCard.class,
				new Long(1));
		System.out.println(adharCard);
		System.out.println("================");
		System.out.println(adharCard.getUserDetail());

		tx.commit();
		session.close();
		System.out.println("Done");
	}
}
