package com.wipro.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.TimeZone;

public class OracleConnection {
	private static Properties properties=null;
	
	static{
		try(
				FileInputStream fis= new FileInputStream("/home/rps/wipro-24NAG1271-ws/jdbc-app/src/main/resources/database.properties");
				
				){
			Class.forName("oracle.jdbc.driver.OracleDriver");
			properties= new Properties();
			properties.load(fis);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch(IOException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection(){
		try {

			TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
			TimeZone.setDefault(timeZone);
			Connection connection =
					DriverManager.getConnection(properties.getProperty("ORACLE_URL"),
							properties.getProperty("ORACLE_USER"),
							properties.getProperty("ORACLE_PASSWORD"));
			
			return connection;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}