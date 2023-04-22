package DDF_POM_TestNG_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SI;
	
	public GitHub_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubSignInButton() {
		SI.click();
	}
}
