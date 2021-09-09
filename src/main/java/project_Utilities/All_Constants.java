package project_Utilities;

public class All_Constants 
{

	public static final String directoryPath = System.getProperty("user.dir");
	public static final String PropertiesFilePath = directoryPath + 
			"\\src\\main\\resources\\project_Config\\my_Config1.properties";
	public static final String ChromeDriverFilePath = directoryPath +
			"\\src\\main\\java\\project_Driver\\chromedriver.exe";
	public static final String FirefoxDriverFilePath = directoryPath +
			"\\src\\main\\java\\project_Driver\\geckodriver.exe";
	public static final String IEDriverFilePath = directoryPath +
			"\\src\\main\\java\\project_Driver\\IEDriverServer.exe";
	public static final String DataPagesPath = directoryPath + "\\src\\test\\resources\\pages_Data\\";
}
