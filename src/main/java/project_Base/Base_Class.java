package project_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import project_Driver.SelectDrivers;
import project_Utilities.All_Constants;

public class Base_Class 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public static void Initialization() {
		prop= new Properties();
		try {
			FileInputStream fileInput = new FileInputStream(All_Constants.PropertiesFilePath);
			prop.load(fileInput);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String browser = prop.getProperty("browser");
		SelectDrivers.driverInitialize(browser);
		
	}
	public static void insertURL() {
		driver.get(prop.getProperty("url"));
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public static void tearDown() {
		driver.quit();
	}
}
