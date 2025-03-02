package com.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Revati - This class has common method to capture screenshot
 */
public class CaptureScreenshot {
	
	/**
	 * @param driver 
	 * @return
	 *  This method will capture the screenshot & return it in the byte format to embed in the cucumber report
	 */
	public static byte[] captureImage(WebDriver driver) {
		
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		
		byte[] srcFile = srcShot.getScreenshotAs(OutputType.BYTES);
		
		return srcFile;
		
	}

}
