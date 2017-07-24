package com.baltimore.city.dao;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory factory;

	public HibernateUtil() {
	}

	// Creating Singleton instance of factory object
	public static synchronized SessionFactory getSessionFactory() {

		String sep = System.getProperty("file.separator");
		if (factory == null) {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
}

/*
 * public boolean insertData(String name, int age, String address){
 * 
 * Student s =new Student(); s.setAge(age); s.setName(name);
 * s.setAddress(address);
 * 
 * try{
 * 
 * session.save(s);//persisting the object t.commit();//transaction is commited
 * session.close(); return true;
 * 
 * } catch(Exception e){ return false;
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 */
