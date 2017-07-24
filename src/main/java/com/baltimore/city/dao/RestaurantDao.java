package com.baltimore.city.dao;

import java.util.List;

import com.baltimore.city.pojo.Restaurant;

public interface RestaurantDao {

	public boolean addRestaurant(Restaurant restuarant);

	public List<Restaurant> showAllRestaurants();

	public List<Restaurant> filterQuery(String parameter);

	public List<Restaurant> search(String parameter);

	public void deleteRestaurant(String name, String zipcode, String neighborhood);

	public Restaurant updateRestaurant(Restaurant restaurant);

	public Restaurant getRestaurant(int RestaurantID);

}
