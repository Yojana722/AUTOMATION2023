package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	//1. declaration
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement signIn;
	//-> driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	
	//2. Initialization
	public GitHub_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	public void clickGitHubSignInBtn() {
		signIn.click();
	}
}
