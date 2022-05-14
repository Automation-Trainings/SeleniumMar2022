package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class LeaveList_HRM extends WebLibrary {

	boolean status;

	@FindBy(xpath = "leaveList_txtEmployee_empName")
	public WebElement empName;
	
	@FindBy(id = "btnSearch")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//*[@id='resultTable']/tbody/tr/td")
	public WebElement searchEmpName;
	
	public void searchEmpName(Object EmpName, Object action) {
		
		for(int i=1; i<=5; i++) {
		String empName = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td["+ i +"]/a")).getText();
		if (EmpName.equals(empName)) {
			driver.findElement(
					By.xpath("//*[@id='resultTable']/tbody/tr/td[8]/select/option[text()='" + action + "']"));
		}
		}
		
	}

	public void employeeName(Object EmpName) {
		status = SetTextAndEnter(empName, EmpName);
		logEvent(status, "Employee name entered successfully", "Employee name is not entered successfully");
	}
	
	public void searchBtn() {
		status = ClickElement(searchBtn);
		logEvent(status, "Search button is clicked successfully", "Search button is not clicked successfully");
	}
	
	

}
