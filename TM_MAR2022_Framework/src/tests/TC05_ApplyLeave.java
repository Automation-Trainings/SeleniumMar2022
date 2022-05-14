package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.ApplyLeave_HRM;
import pages.LoginPageHRM;
import pages.WelcomePage_HRM;

public class TC05_ApplyLeave extends DriverClass {
	
	
	@Test
	public void TC_05_ApplyLeave() {

		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPageHRM lp = PageFactory.initElements(driver, LoginPageHRM.class);
		ApplyLeave_HRM al = PageFactory.initElements(driver, ApplyLeave_HRM.class);
		WelcomePage_HRM wp = PageFactory.initElements(driver, WelcomePage_HRM.class);

		// Login with employee cred
		lp.labelText(data[10]);
		lp.userName(data[5]);
		lp.userPassword(data[6]);
		lp.clickLoginBtn();
		
		//Mouse hover to click on apply leave
		wp.mouseHoverLeaveTab();
		wp.applyLeaveTab();		
		
		// Apply a leave
		al.leaveType(data[8]);
		al.fromDate(data[14], data[15], data[16]);
		al.toDate(data[17], data[18], data[19]);
		al.leaveComment(data[20]);
		al.clickApplyBtn();
	}
	
	@Test
	public void TC_051_ApplyLeave() {

		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPageHRM lp = PageFactory.initElements(driver, LoginPageHRM.class);
		ApplyLeave_HRM al = PageFactory.initElements(driver, ApplyLeave_HRM.class);
		WelcomePage_HRM wp = PageFactory.initElements(driver, WelcomePage_HRM.class);

		// Login with employee cred
		lp.labelText(data[10]);
		lp.userName(data[5]);
		lp.userPassword(data[6]);
		lp.clickLoginBtn();
		
		//Mouse hover to click on apply leave
		wp.mouseHoverLeaveTab();
		wp.applyLeaveTab();		
		
		// Apply a leave
		al.leaveType(data[8]);
		al.fromDate(data[14], data[15], data[16]);
		al.toDate(data[17], data[18], data[19]);
		al.leaveComment(data[20]);
		al.clickApplyBtn();
	}
	
	@Test
	public void TC_052_ApplyLeave() {

		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPageHRM lp = PageFactory.initElements(driver, LoginPageHRM.class);
		ApplyLeave_HRM al = PageFactory.initElements(driver, ApplyLeave_HRM.class);
		WelcomePage_HRM wp = PageFactory.initElements(driver, WelcomePage_HRM.class);

		// Login with employee cred
		lp.labelText(data[10]);
		lp.userName(data[5]);
		lp.userPassword(data[6]);
		lp.clickLoginBtn();
		
		//Mouse hover to click on apply leave
		wp.mouseHoverLeaveTab();
		wp.applyLeaveTab();		
		
		// Apply a leave
		al.leaveType(data[8]);
		al.fromDate(data[14], data[15], data[16]);
		al.toDate(data[17], data[18], data[19]);
		al.leaveComment(data[20]);
		al.clickApplyBtn();
	}

}
