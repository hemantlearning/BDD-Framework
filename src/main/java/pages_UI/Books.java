package pages_UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_Base.Base_Class;

/**
 * 
 * @author Hemant Rathod
 * define each element on page using @FindBy
 * Define each WebElement as public and static 
 * Extends to Base_Class
 * Create constructor 
 * initiate all WebElements inside constructor using PageFactory.init method
 *
 */
public class Books extends Base_Class
{
	@FindBy(xpath="//h5[contains(text(),'Book')]") public static WebElement BookStorePageLink;
	@FindBy(id="login") public static WebElement Button_Login;
	@FindBy(id="userName") public static WebElement Txt_Username;
	@FindBy(id="password") public static WebElement Txt_Password;
	@FindBy(id="login") public static WebElement Button_SignIn;
	@FindBy(id="userName-value") public static WebElement Lbl_Username;
	
	public Books() {
		PageFactory.initElements(driver, this);
	}
}
