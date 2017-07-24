package com.baltimore.city.test;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.baltimore.city.dao.HibernateUtil;
import com.baltimore.city.dao.RestaurantDao;
import com.baltimore.city.dao.RestaurantDaoImpl;
import com.baltimore.city.pojo.Restaurant;

public class TestDao {

	@Autowired
	private HibernateUtil util;

	@Autowired
	private RestaurantDao restdao;

	@Before
	@Transactional
	// @Rollback(true)
	public void testAddRestaurant() {
		Restaurant rest = new Restaurant();
		restdao = new RestaurantDaoImpl();

		List<Restaurant> restaurants_initial = restdao.showAllRestaurants();

	//	System.out.println("Add_initial " + restaurants_initial.size());

		rest.setName("Test Restaurant");
		rest.setZipcode("21200");
		rest.setPolicedistrict("Test Polica District");
		rest.setCouncildistrict("Test Council Distrct");
		rest.setLocation_1_address("Test address");
		rest.setLocation_1_city("Test City");

		rest.setLocation_1_state("Test State");
		rest.setNeighborhood("Test Neighborhood");

		restdao.addRestaurant(rest);

		List<Restaurant> restaurants_final = restdao.showAllRestaurants();
	//	System.out.println("Add_final " + restaurants_final.size());

		Assert.assertEquals(restaurants_initial.size() + 1, restaurants_final.size());
	}

	@Test
	@Transactional
	// @Rollback(true)
	public void testSearchRestaurant() {
		Restaurant rest = new Restaurant();
		restdao = new RestaurantDaoImpl();

		List<Restaurant> restaurants_initial = restdao.showAllRestaurants();

		System.out.println("Search_initial " + restaurants_initial.size());

		List<Restaurant> restaurants_final = restdao.search("Test Restaurant");
		//System.out.println("Search_final " + restaurants_final.size());

		//System.out.println("search result " + restaurants_final.get(0).getName());

		Assert.assertEquals("Test Restaurant", restaurants_final.get(0).getName());
	}

	@After
	@Transactional
	// @Rollback(true)
	public void testDeleteRestaurant() {
		Restaurant rest = new Restaurant();

		restdao = new RestaurantDaoImpl();

		List<Restaurant> restaurants_initial = restdao.showAllRestaurants();

		int size = restaurants_initial.size();
		//System.out.println("delete_initial_size " + size);

		restdao = new RestaurantDaoImpl();
		restdao.deleteRestaurant("Test Restaurant", "21200", "Test Neighborhood");

		List<Restaurant> restaurants = restdao.showAllRestaurants();
		//System.out.println("delete_final_size " + restaurants.size());

		Assert.assertEquals(restaurants_initial.size() - 1, restaurants.size());
	}

}
