package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_HomePage {

	@FindBy(xpath = "(//summary[@class='Header-link'])[2]") private WebElement signOutBtn;
	
	//2. Initialization
	public GitHub_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	public void clickGitHubHomePageSignOutBtn() {
		signOutBtn.click();
	}
}
