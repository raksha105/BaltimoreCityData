package com.baltimore.city.controller;

import org.hibernate.SessionFactory;

import com.baltimore.city.dao.HibernateUtil;
import com.baltimore.city.db.RestaurantQueryDb;

public class AutomatedLoad {

	
	 public void init() {
		HibernateUtil hutil = new HibernateUtil();
		SessionFactory sf;
	
	sf = hutil.getSessionFactory();

	RestaurantQueryDb rqdb = new RestaurantQueryDb(sf);

	boolean check = rqdb.LoadDataAPI();
	}

	
}
