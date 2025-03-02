package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @auther Sandip
 * SHIFT + ALT + J
 * This class contains common methods to Read properties from properties file
 */

public class ReadProperties {


	
	/**
	 * @return
	 * This method will return object of properties file
	 */
	public static Properties loadProperties() {
		// Open the File
		File objfile = new File("AppConfig/config.properties");
		// Read the File

		FileInputStream objfis = null;
		try {
			objfis = new FileInputStream(objfile);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}

		Properties objprop = new Properties();
		try {
			objprop.load(objfis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return objprop;

	}
	
	
	/**
	 * @return
	 * @throws IOException
	 * This method will Read &  return appurl from properties file
	 */
	public static String getappURL() throws IOException {

		return loadProperties().getProperty("appURL");

	}
	
	/**
	 * @return
	 * This method will Read &  return implicitwaittime from properties file
	 */
	public static long getImplicitWaitTime() {

		return Long.parseLong(loadProperties().getProperty("implicitWaitTime"));
	}
	
	/**
	 * @return
	 *  This method will Read &  return fluentWaitTime from properties file
	 */
	public static long getFluenttWaitTime() {

		return Long.parseLong(loadProperties().getProperty("fluentWaitTime"));
	}
	
	/**
	 * @return
	 * This method will Read &  return username from properties file
	 */
	 
	public static String getAppUserName() {
		return loadProperties().getProperty("userName");
	}
	
	/**
	 * @return
	 * This method will Read &  return password from properties file
	 */
	public static String getAppPassword() {
		return loadProperties().getProperty("password");
	}
	
	
	
}
