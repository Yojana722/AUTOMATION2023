package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) throws InterruptedException {
		String expUrl = "https://www.facebook/";
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		//4. maximize
		driver.manage().window().maximize();
		
		//1. get
		driver.get("https://www.facebook.com/");
		
		//6. getCurrentUrl
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);//https://www.facebook.com/
		
		if(actUrl.equals(expUrl)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		//7. getTitle
		String actTitle = driver.getTitle();
		System.out.println(actTitle);//Facebook � log in or sign up
		
		//5. minimize
		driver.manage().window().minimize();
		
		Thread.sleep(4000);
		//2. close - used to close single window
		//driver.close();
		
		//3. quit - used to close multiple windows
		driver.quit();
	}
}
