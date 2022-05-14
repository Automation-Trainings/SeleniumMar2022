package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.AddEmployee_HRM;
import pages.AddEntitlements_HRM;
import pages.LoginPage_HRM;
import pages.WelcomePage_HRM;

public class TC03_AddEntitlements extends DriverClass {

	@Test
	public void TC_03_AddEntitlements() throws Exception {

		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPage_HRM loginPage = PageFactory.initElements(driver, LoginPage_HRM.class);
		WelcomePage_HRM welcomePage = PageFactory.initElements(driver, WelcomePage_HRM.class);
		AddEmployee_HRM addEmployee = PageFactory.initElements(driver, AddEmployee_HRM.class);
		AddEntitlements_HRM addEntitlements = PageFactory.initElements(driver, AddEntitlements_HRM.class);

//		loginPage.verifyLoginPanel();
		loginPage.UserName(data[0]);
		loginPage.Password(data[1]);
		loginPage.Login();

		welcomePage.mouseHoverLeaveTab();
		welcomePage.mouseHoverEntitlementsTab();
		welcomePage.addEntitlementsTab();

		addEntitlements.employeeName(data[7]);
		addEntitlements.leaveType(data[8]);
		addEntitlements.addEntitlement(data[9]);
		addEntitlements.clickSaveBtn();
		Thread.sleep(6000);
	}
	
	@Test
	public void TC_031_AddEntitlements() throws Exception {

		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPage_HRM loginPage = PageFactory.initElements(driver, LoginPage_HRM.class);
		WelcomePage_HRM welcomePage = PageFactory.initElements(driver, WelcomePage_HRM.class);
		AddEmployee_HRM addEmployee = PageFactory.initElements(driver, AddEmployee_HRM.class);
		AddEntitlements_HRM addEntitlements = PageFactory.initElements(driver, AddEntitlements_HRM.class);

//		loginPage.verifyLoginPanel();
		loginPage.UserName(data[0]);
		loginPage.Password(data[1]);
		loginPage.Login();

		welcomePage.mouseHoverLeaveTab();
		welcomePage.mouseHoverEntitlementsTab();
		welcomePage.addEntitlementsTab();

		addEntitlements.employeeName(data[7]);
		addEntitlements.leaveType(data[8]);
		addEntitlements.addEntitlement(data[9]);
		addEntitlements.clickSaveBtn();
		Thread.sleep(6000);
	}
	
	@Test
	public void TC_032_AddEntitlements() throws Exception {

		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPage_HRM loginPage = PageFactory.initElements(driver, LoginPage_HRM.class);
		WelcomePage_HRM welcomePage = PageFactory.initElements(driver, WelcomePage_HRM.class);
		AddEmployee_HRM addEmployee = PageFactory.initElements(driver, AddEmployee_HRM.class);
		AddEntitlements_HRM addEntitlements = PageFactory.initElements(driver, AddEntitlements_HRM.class);

//		loginPage.verifyLoginPanel();
		loginPage.UserName(data[0]);
		loginPage.Password(data[1]);
		loginPage.Login();

		welcomePage.mouseHoverLeaveTab();
		welcomePage.mouseHoverEntitlementsTab();
		welcomePage.addEntitlementsTab();

		addEntitlements.employeeName(data[7]);
		addEntitlements.leaveType(data[8]);
		addEntitlements.addEntitlement(data[9]);
		addEntitlements.clickSaveBtn();
		Thread.sleep(6000);
	}

}
