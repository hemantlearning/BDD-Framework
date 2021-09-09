package pages_Methods;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import pages_UI.Books;
import pages_UI.RegistrationPage;
import project_Base.Base_Class;
import project_Utilities.All_Constants;
import project_Utilities.ExcelUtilities;

public class Registration_Methods extends Base_Class
{
	int totalRows;
	int totalCols;
	String [][] userdata;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public void userEntersRegistrationDetails(String FirstName, String LastName, String Email, String Gender, String Mobile, String Subject) 
	{
		
		RegistrationPage.Txt_FirstName.clear();
		RegistrationPage.Txt_FirstName.sendKeys(FirstName);
		
		RegistrationPage.Txt_LastName.clear();
		RegistrationPage.Txt_LastName.sendKeys(LastName);
		
		RegistrationPage.Txt_Email.clear();
		RegistrationPage.Txt_Email.sendKeys(Email);
		
		String gender=Gender;
		if (gender.equalsIgnoreCase("Male")) {
			RegistrationPage.Radio_Button_Male.click();
		}
		else {
			RegistrationPage.Radio_Button_Female.click();
			}
		
		RegistrationPage.Txt_Mobile.clear();
		RegistrationPage.Txt_Mobile.sendKeys(Mobile);
		
		Actions a = new Actions(driver);
		a.sendKeys(RegistrationPage.Txt_Subject, Subject).sendKeys(Keys.ENTER).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].click();", RegistrationPage.Btn_Submit);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].click();", RegistrationPage.Btn_Close);
		
		
	}
	
	public void navigateToRegistrationPage() {
		RegistrationPage page = new RegistrationPage();
		
		js.executeScript("arguments[0].click();", RegistrationPage.FormLink);
		RegistrationPage.PracticeFormLink.click();
	}
	
	public void collectExcelDataAndTransfer(String filename, String sheetname) throws Exception {
		
		String excelfilepath = All_Constants.DataPagesPath + filename;
		ExcelUtilities.setExcelFile(excelfilepath, sheetname);
		totalRows = ExcelUtilities.getRowCount(sheetname);
		totalCols = ExcelUtilities.getColCount(sheetname);
		
		userdata = new String [totalRows][totalCols]; 
		for (int RowNo=1; RowNo<=totalRows; RowNo++) {
			for(int ColNo=0; ColNo<totalCols; ColNo++) {
				//System.out.println(ExcelUtilities.getCellData(RowNo, ColNo));
				userdata[RowNo-1][ColNo] = ExcelUtilities.getCellData(RowNo, ColNo);
			}
		}
		
		//Transfer data to webpage
		for(int i=0; i<totalRows-1; i++) {
			AddExcelDataToRegPage(i);
		}
		
	
	}
	
	public void AddExcelDataToRegPage(int Row) {
		String fname, lname, email, gender, mob, sub;
		
		fname=userdata[Row][0];
		lname=userdata[Row][1];
		email=userdata[Row][2];
		gender=userdata[Row][3];
		mob=userdata[Row][4];
		sub=userdata[Row][5];
		
		userEntersRegistrationDetails(fname, lname, email, gender, mob, sub);
		
		
		
		
	}
	
	
	
}
