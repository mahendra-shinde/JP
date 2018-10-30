package com.mahendra;


import java.sql.*;

public class Main1 {
	private static final String SQL_SELECT = "select id, name, countrycode, district, population from city";

	public static void main(String[] args) {
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass ="pass";
		try (Connection con = ConnectionUtil.getConnection(driver, url, user, pass))
		{
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(SQL_SELECT);
		while(rs.next()) {
			City city = convertResults(rs);
			System.out.println("Name: "+city.getName()+", Population: "+city.getPopulation());
		}
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}

	private static City convertResults(ResultSet rs) throws SQLException {
		long id = rs.getLong("id");
		String name = rs.getString("name");
		String countryCode = rs.getString("countryCode");
		String district = rs.getString("district");
		long population = rs.getLong("population");
		City city = new City(id, name, countryCode, district, population);
		return city;
	}
}
