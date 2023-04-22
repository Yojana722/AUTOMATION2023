package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JAN2023\\chromedriver_win32 (13)\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://github.com/");
		Thread.sleep(2000);
		
		GitHub_SignIn signIn = new GitHub_SignIn(driver);
		signIn.clickGitHubSignInBtn();
		Thread.sleep(4000);
		
		GitHub_Login login = new GitHub_Login(driver);
		login.setGitHubLoginUN();
		login.setGitHubLoginPWD();
		login.clickGitHubLoginBtn();
		Thread.sleep(4000);

		GitHub_HomePage home = new GitHub_HomePage(driver);
		home.clickGitHubHomePageSignOutBtn();
		Thread.sleep(4000);

		GitHub_SignOutPage signOut = new GitHub_SignOutPage(driver);
		signOut.clickGitHubHomePageSignOutBtn();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
