package com.baltimore.city.dao;

import java.util.List;

import com.baltimore.city.dao.HibernateUtil;
import com.baltimore.city.pojo.Restaurant;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class RestaurantDaoImpl implements RestaurantDao {

	HibernateUtil util;
	Session session;
	Transaction t;
	SessionFactory sf;

	public boolean addRestaurant(Restaurant restuarant) {
		// TODO Auto-generated method stub
		sf = util.getSessionFactory();
		session = sf.openSession();

		try {
			session.save(restuarant);
			// System.out.println("persisted restaurant data");
			return true;
		} catch (Exception e) {

			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<Restaurant> showAllRestaurants() {

		sf = util.getSessionFactory();

		List<Restaurant> results;
		session = sf.openSession();
		t = session.beginTransaction();

		String hql = "FROM Restaurant";

		try {
			Query query = session.createQuery(hql);
			results = query.list();
			t.commit();
			session.close();

			//System.out.println(results.size());

			return results;
		} catch (Exception e) {
			System.out.println(e.getStackTrace().toString());
			System.out.println(e.getMessage());

			return null;
		}

	}

	public void deleteRestaurant(String name, String zipcode, String neighborhood) {

		sf = util.getSessionFactory();
		session = sf.openSession();
		t = session.beginTransaction();

		Query query = session.createQuery(
				"delete from  Restaurant where name = :name AND zipcode = :zipcode AND neighborhood = :neighborhood ");
		query.setParameter("name", name);
		query.setParameter("zipcode", zipcode);
		query.setParameter("neighborhood", neighborhood);

		int result = query.executeUpdate();
		session.flush();
		t.commit();
		session.close();

		if (result > 0) {
			System.out.println("Restaurant deleted");
		}

	}

	public Restaurant updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return null;
	}

	public Restaurant getRestaurant(int RestaurantID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Restaurant> filterQuery(String parameter) {
		// TODO Auto-generated method stub

		sf = util.getSessionFactory();

		List<Restaurant> results;
		session = sf.openSession();
		t = session.beginTransaction();

		if (parameter.equals("address")) {

			parameter = "location_1_address";
		}

		String hql = "FROM Restaurant ORDER BY " + parameter + " ASC";

		try {
			Query query = session.createQuery(hql);

			// query.uniqueResult();
			results = query.list();
			t.commit();
			session.close();
			return results;
		} catch (Exception e) {
			System.out.println(e.getStackTrace().toString());
			System.out.println(e.getMessage());

			return null;
		}

	}

	@Override
	public List<Restaurant> search(String parameter) {

		sf = util.getSessionFactory();

		List<Restaurant> results;
		session = sf.openSession();
		t = session.beginTransaction();

		String hql = "FROM Restaurant WHERE name = :name OR name = :name1 OR name LIKE :name2 OR name LIKE :name3";

		System.out.println(parameter);

		try {
			Query query = session.createQuery(hql);
			query.setParameter("name", parameter.toLowerCase());
			query.setParameter("name1", parameter.toUpperCase());
			query.setParameter("name2", '%' + parameter.toUpperCase() + '%');
			query.setParameter("name3", '%' + parameter.toLowerCase() + '%');

			// query.uniqueResult();
			results = query.list();
			t.commit();
			session.close();
			System.out.println("executed search");

			return results;
		} catch (Exception e) {
			System.out.println(e.getStackTrace().toString());
			System.out.println(e.getMessage());

			return null;
		}
	}

}
