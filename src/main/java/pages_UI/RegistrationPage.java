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
public class RegistrationPage extends Base_Class
{
	@FindBy(xpath="//h5[contains(text(),'Forms')]") public static WebElement FormLink;
	@FindBy(xpath="//span[contains(text(),'Practice Form')]")public static WebElement PracticeFormLink;
	@FindBy(id="firstName")public static WebElement Txt_FirstName;
	@FindBy(id="lastName")public static WebElement Txt_LastName;
	@FindBy(id="userEmail")public static WebElement Txt_Email;
	@FindBy(xpath="//label[contains(text(),'Male')]")public static WebElement Radio_Button_Male;
	@FindBy(xpath="//label[contains(text(),'Female')]")public static WebElement Radio_Button_Female;
	@FindBy(id="userNumber")public static WebElement Txt_Mobile;
	@FindBy(xpath="//input[@id='subjectsInput']")public static WebElement Txt_Subject;
	@FindBy(id="submit")public static WebElement Btn_Submit;
	@FindBy(id="closeLargeModal")public static WebElement Btn_Close;
	
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
}
