package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSSValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement logIn = driver.findElement(By.xpath("//button[text()='Log in']"));
		String color = logIn.getCssValue("color");//text color -rgba(255, 255, 255, 1)-white
		String back = logIn.getCssValue("background-color");//rgba(24, 119, 242, 1)-blue
		System.out.println(color);
		System.out.println(back);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
