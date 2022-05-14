package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class ApplyLeave_HRM extends WebLibrary{
	
	boolean status;
	
	@FindBy(id = "applyleave_txtLeaveType")
	public WebElement leaveType;
	
	@FindBy(id = "applyleave_txtFromDate")
	public WebElement fromDate;
	
	@FindBy(id = "applyleave_txtToDate")
	public WebElement toDate;
	
	@FindBy(id = "applyleave_txtComment")
	public WebElement leaveComment;
	
	@FindBy(id = "applyBtn")
	public WebElement applyBtn;
	
	public void clickApplyBtn() {
		status = ClickElement(applyBtn);
		logEvent(status, "Save button is clicked successfully", "Save button is not clicked successfully");
	}
	
	public void leaveType(Object leaveType) {
		status = selectByVisibleText(this.leaveType, leaveType);
		logEvent(status, "Leave type select is successfull", "Leave type select is not successfull");
	}
	
	public void fromDate(Object month, Object year, Object day) {
		status = ClickElement(fromDate);
		logEvent(status, "From date is clicked successfully", "From date is not clicked successfully");
		
		WebElement expMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[text()='"+month+"']"));
		status = ClickElement(expMonth);
		logEvent(status, "Month is selected successfully", "Month is not selected successfully");
		
		WebElement expYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='"+year+"']"));
		status = ClickElement(expYear);
		logEvent(status, "Year is selected successfully", "Year is not selected successfully");
		
		WebElement expDay = driver.findElement(By.xpath("//*[text()='"+day+"']"));
		status = ClickElement(expDay);
		logEvent(status, "Day is selected successfully", "Day is not selected successfully");
	}
	
	public void toDate(Object month, Object year, Object day) {
		status = ClickElement(toDate);
		logEvent(status, "To date is selected successfully", "To date is not selected successfully");
		
		WebElement expMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[text()='"+month+"']"));
		status = ClickElement(expMonth);
		logEvent(status, "Month is selected successfully", "Month is not selected successfully");
		
		WebElement expYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='"+year+"']"));
		status = ClickElement(expYear);
		logEvent(status, "Year is selected successfully", "Year is not selected successfully");
		
		WebElement expDay = driver.findElement(By.xpath("//*[text()='"+day+"']"));
		status = ClickElement(expDay);
		logEvent(status, "Day is selected successfully", "Day is not selected successfully");
	}
	
//	public void fromDate(Object firstName) {
//		status = SetTextAndEscape(fromDate, firstName);
//		logEvent(status, "From date entered successfully", "From date is not entered successfully");
//	}
	
//	public void toDate(Object firstName) {
//		status = SetTextAndEscape(toDate, firstName);
//		logEvent(status, "To date entered successfully", "To date is not entered successfully");
//	}
	
	public void leaveComment(Object leaveComment) {
		status = SetText(this.leaveComment, leaveComment);
		logEvent(status, "Leave comment entered successfully", "Leave comment is not entered successfully");
	}	

}
