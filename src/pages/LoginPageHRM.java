package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class LoginPageHRM extends WebLibrary {

	public LoginPageHRM() {
		launchApplication(BaseURL);
	}

	boolean status;

	@FindBy(xpath = "//*[@id='txtUsername']")
	public WebElement userName;

	@FindBy(id = "txtPassword")
	public WebElement passWord;

	@FindBy(xpath = "//*[@id='btnLogin']")
	public WebElement loginBtn;

	@FindBy(xpath = "//*[@id='logInPanelHeading']")
	public WebElement loginText;

	public void userName(Object UserName) {
		status = SetText(userName, UserName.toString());
		logEvent(status, "User name entered successfully", "User name is not entered successfully");
	}

	public void userPassword(Object Password) {
		status = SetText(passWord, Password.toString());
		logEvent(status, "Password entered successfully", "Password is not entered successfully");
	}

	public void clickLoginBtn() {
		status = ClickElement(loginBtn);
		logEvent(status, "Login button clicked successfully", "Login button is not clicked successfully");
	}

	public void labelText(Object expText) {
		status = validateText(loginText, expText.toString());
		logEvent(status, "Label is matching", "Label is not matching");
	}

}
