package com.qa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.ReadProperties;

public class Base {

	public static WebDriver driver;

	/**
	 * @return
	 * @throws IOException
	 * This method will open the browser and start the application
	 */
	public WebDriver initializeWebDriver() throws IOException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		// Start the Browser
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ReadProperties.getImplicitWaitTime(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ReadProperties.getappURL());
		return driver;

	}

	/**
	* This method will close the browser
	*/
	public void closeBrowser() {
		driver.quit();
	}

}
