package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import baseClass.DriverClass;
import pages.LoginPageHRM;

public class TC10_Login extends DriverClass{
	
	@Test
	public void TC_10_LoginHRM() {	
		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPageHRM lp = PageFactory.initElements(driver, LoginPageHRM.class);
		lp.labelText(data[10]);
		lp.userName(data[0]);
		lp.userPassword(data[1]);
		lp.clickLoginBtn();		
	}
	
	

}
