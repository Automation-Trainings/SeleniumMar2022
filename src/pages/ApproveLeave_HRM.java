package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class ApproveLeave_HRM extends WebLibrary {

	public ApproveLeave_HRM() {
		launchApplication(BaseURL);
	}

	boolean status;

	@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	public WebElement allChkBox;

	public void allChkBox() {
		status = ClickElement(allChkBox);
		logEvent(status, "Check box is clicked successfully", "Check box is not clicked successfully");
	}

	public void webTableEx(Object empName, Object actionLeave) {

		int rowSize = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println(rowSize);
		
		for (int i = 1; i <= rowSize; i++) {

			String actEpmName = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[2]/a"))
					.getText();
			if (empName.equals(actEpmName)) {
				WebElement leaveAction = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i
						+ "]/td[8]/select/option[text()='" + actionLeave + "']"));
				status = ClickElement(leaveAction);
				logEvent(status, "Leave action is selected successfully", "Leave action is not selected successfully");
			}

		}
	}

}
