package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.AddEmployee_HRM;
import pages.AddEntitlements_HRM;
import pages.ApplyLeave_HRM;
import pages.ApproveLeave_HRM;
import pages.LeaveList_HRM;
import pages.LoginPage_HRM;
import pages.WelcomePage_HRM;

public class TC06_ApproveLeave extends DriverClass {

	@Test
	public void TC_06_ApproveLeave() throws Exception {
		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPage_HRM loginPage = PageFactory.initElements(driver, LoginPage_HRM.class);
		WelcomePage_HRM wp = PageFactory.initElements(driver, WelcomePage_HRM.class);
		AddEmployee_HRM ap = PageFactory.initElements(driver, AddEmployee_HRM.class);
		AddEntitlements_HRM ae = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		ApplyLeave_HRM al = PageFactory.initElements(driver, ApplyLeave_HRM.class);
		LeaveList_HRM ll = PageFactory.initElements(driver, LeaveList_HRM.class);
		ApproveLeave_HRM apl = PageFactory.initElements(driver, ApproveLeave_HRM.class);
		
		loginPage.UserName(data[0]);
		loginPage.Password(data[1]);
		loginPage.Login();

		wp.mouseHoverLeaveTab();
		wp.clickLeaveList();
		
//		apl.allChkBox();
		apl.webTableEx(data[7], data[13]);
		Thread.sleep(5000);
		
	}

}
