package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox2 {

	public static void main(String[] args) throws InterruptedException {
		String expResult = "1";
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(4000);

		// 1. step 1
		// findElement -> return type -> WebELement
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		// 2. step 2
		// create object of Actions class wrt to WebDriver
		Actions act = new Actions(driver);// keyboard can interact with browser with the help of Actions class

		// 3. step 3
		act.click(day).perform();

		// findElements -> return type -> List<WebELement>
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='day']/option"));
		int size = allOptions.size();
		System.out.println(size);// 31

		//print all list box options
		//for (int i = 0; i <= size - 1; i++) {
			//System.out.println(allOptions.get(i).getText());
		//}
		
		for(int i=0; i<=size-1; i++) {
			String actResult = allOptions.get(i).getText();//getText() - WebElement
			
			if(actResult.equals(expResult)) {
				allOptions.get(i).click();//click() - WebElement
			}
		}
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}
