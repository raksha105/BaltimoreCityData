package com.baltimore.city.controller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.baltimore.city.dao.HibernateUtil;
import com.baltimore.city.dao.*;
import com.baltimore.city.dao.RestaurantDaoImpl;
import com.baltimore.city.db.RestaurantQueryDb;
import com.baltimore.city.pojo.Restaurant;

import org.springframework.http.MediaType;

@Controller
public class LoadDataController {

	HibernateUtil hutil = new HibernateUtil();
	SessionFactory sf;

	@RequestMapping(value = "/index", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody int load(ModelMap model) {

		sf = hutil.getSessionFactory();

		RestaurantQueryDb rqdb = new RestaurantQueryDb(sf);

		boolean check = rqdb.LoadDataAPI();
		if (check) {

			return 1;
		}

		else {

			return 0;
		}

	}

	@RequestMapping(value = "/Datasetloaded", method = RequestMethod.GET)

	public String Datasetloaded(ModelMap model) {

		return "Datasetloaded";

	}

	@RequestMapping(value = "/ShowAllRestaurants", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody List<Restaurant> ShowAllRestaurants(ModelAndView model) {

		RestaurantDao restdao = new RestaurantDaoImpl();
		List<Restaurant> restaurants = restdao.showAllRestaurants();

		// model.addObject("restaurants", restaurants);
		// model.setViewName("Datasetloaded");

		return restaurants;

	}

	@RequestMapping(value = "/FilterResults", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody List<Restaurant> FilterQuery(@RequestParam("filter-param") String param, ModelAndView model) {

		RestaurantDao restdao = new RestaurantDaoImpl();
		List<Restaurant> restaurants = restdao.filterQuery(param.toLowerCase());

		return restaurants;

	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody List<Restaurant> search(@RequestParam("searchParam") String param) {
		System.out.println("in search");

		RestaurantDao restdao = new RestaurantDaoImpl();
		List<Restaurant> restaurants = restdao.search(param);

		for (int i = 0; i < restaurants.size(); i++) {
			System.out.println(restaurants.get(i).getName() + " " + restaurants.get(i).getZipcode());

		}
		return restaurants;
	}

	@RequestMapping(value = "/addRestaurant", method = RequestMethod.GET)
	public @ResponseBody ModelAndView restaurant() {

		return new ModelAndView("addRestaurant", "command", new Restaurant());
	}

	@RequestMapping(value = "/addResult", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("SpringWeb") Restaurant restaurant,

			ModelAndView model, RedirectAttributes redir) {

		RestaurantDao restdao = new RestaurantDaoImpl();
		boolean addSuccess = restdao.addRestaurant(restaurant);

		model.setViewName("redirect:/Datasetloaded");

		if (addSuccess) {
			redir.addFlashAttribute("success", "Added successfully");
		} else {
			redir.addFlashAttribute("success", "Please enter legal values, and make sure you enter all values");

		}
		// return "redirect:/users/"redirect:/ + id + "/" + correctUserName;
		return model;
	}

	@RequestMapping(value = "/deleteRestaurant", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void deleteRestaurant(@RequestParam("name") String name,
			@RequestParam("zipcode") String zipcode, @RequestParam("neighborhood") String neighborhood) {

		RestaurantDao restdao = new RestaurantDaoImpl();
		restdao.deleteRestaurant(name, zipcode, neighborhood);

	}

}
