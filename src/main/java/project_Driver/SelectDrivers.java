package project_Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import project_Base.Base_Class;
import project_Utilities.All_Constants;

public class SelectDrivers extends Base_Class
{
	
	public static void driverInitialize(String browsername) 
	{
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", All_Constants.ChromeDriverFilePath);
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", All_Constants.FirefoxDriverFilePath);
			DesiredCapabilities cp = DesiredCapabilities.firefox();
			cp.setCapability("marionette", true);
			driver = new FirefoxDriver();

		}
		else if(browsername.equals("IE")) {
			System.setProperty("webdriver.ie.driver", All_Constants.IEDriverFilePath);
			driver = new InternetExplorerDriver();
		}
		else
			System.out.println("Browser not found");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}
