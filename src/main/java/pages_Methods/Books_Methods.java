package pages_Methods;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import pages_UI.Books;
import project_Base.Base_Class;

public class Books_Methods extends Base_Class
{
	static String checkUsername=null;
	
	public void openBrowser() {
		Base_Class.Initialization();
	}
	
	public void enterUrl() {
		Base_Class.insertURL();
	}
	
	public void navigateToBookStoreApp() {
		Books objBook = new Books();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Books.BookStorePageLink);
		
	}
	
	public void clickOnLoginOption() {
		Books.Button_Login.click();
	}
	
	public void EnterUserName(String username) {
		checkUsername=username;
		Books.Txt_Username.clear();
		Books.Txt_Username.sendKeys(username);
		
	}
	
	public void EnterPassword(String password) {
		Books.Txt_Password.clear();
		Books.Txt_Password.sendKeys(password);
	}
	
	public void clickOnSignInButton() {
		Books.Button_SignIn.click();
	}
	
	public void closeBrowser() {
		Base_Class.tearDown();
	}
	
	public void validateLogin() {
		String actualUsername = Books.Lbl_Username.getText();
		Assert.assertEquals(actualUsername, checkUsername);
		System.out.println("Login is Successful");
	}
}
