package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignOutPage {

@FindBy(xpath = "//button[contains(text(),'Sign out')]") private WebElement signOut;
	
	//2. Initialization
	public GitHub_SignOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	public void clickGitHubHomePageSignOutBtn() {
		signOut.click();
	}
}
