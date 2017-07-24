package com.baltimore.city.db;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.spi.FilterKey;

import com.baltimore.city.pojo.Restaurant;

public class RestaurantQueryDb {

	SessionFactory factory;

	String fname;
	File file;

	public RestaurantQueryDb(SessionFactory sf) {
		// TODO Auto-generated constructor stub

		this.factory = sf;
	}

	public boolean LoadDataAPI() {
		Session session;
		Transaction t;
		session = factory.openSession();
		t = session.beginTransaction();

		final String POST_URL = "https://data.baltimorecity.gov/resource/abuv-d2r2.xml";

		try {

			file = new File("/usr/share/tomcat8/webapps/checkfile.txt");

			file.getParentFile().mkdirs();
			file.createNewFile();

			// System.out.println(file.getAbsolutePath());

			FileWriter writer = new FileWriter(file);
			URL url = new URL(POST_URL);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String strTemp = "";
			while (null != (strTemp = br.readLine())) {
				// System.out.println(strTemp);
				writer.write(strTemp);
				// writer.println("The second line");

			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		String fname_path = "";
		fname_path = file.getAbsolutePath();

		String load_xml = "LOAD XML LOCAL INFILE '" + "/usr/share/tomcat8/webapps/checkfile.txt"
				+ "' INTO TABLE Restaurant(name,zipcode,neighborhood,councildistrict,policedistrict,location_1_city,"
				+ "location_1_state,location_1_address); ";

		// System.out.println(load_xml);

		String insertTableSQL = " LOAD DATA  LOCAL INFILE " + "C:/Restaurants.xml" + "' INTO TABLE Restaurant "
				+ " FIELDS TERMINATED BY \',\' ENCLOSED BY \'\"'" + " LINES TERMINATED BY \'\\n\'";
		Query query = session.createSQLQuery(load_xml);

		try {
			int result = query.executeUpdate();
			// session.close();
			// t.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e.getStackTrace().toString());
			System.out.println(e.getMessage());

			return false;

		}

	}

}
