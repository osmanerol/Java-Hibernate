package com.hibernateDemo;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			// HQL - Hibernate Query Language
			/*
			List<City> cities=session.createQuery("from City c order by c.name ").getResultList();
			for(City city:cities) {
				System.out.println(city.getName());
			}
			*/
			/* select spesific , diger queryler icin getResultList() yerine executeUpdate() kullanilabilir
			List<String> countrycodes=session.createQuery("select c.countrycode from City c group by c.countrycode").getResultList();
			for(String countrycode:countrycodes) {
				System.out.println(countrycode);
			}
			*/
			/* insert
			City city=new City();
			city.setName("Duzce");
			city.setCountrycode("TUR");
			city.setDistrict("Duzce");
			city.setPopulation(100000);
			session.save(city);
			session.getTransaction().commit();
			System.out.println("Islem gerceklesti");
			 */
			/* update
			City city=session.get(City.class, 4089);	
			city.setPopulation(120000);
			session.save(city);
			System.out.println(city.getName());
			session.getTransaction().commit();
			 */
			City city=session.get(City.class, 4089);
			session.delete(city);
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
		
	}

}
