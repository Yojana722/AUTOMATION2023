package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable1_getRowSize_getCellSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\DEC2022\\AUTOMATION\\driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		//Handling of notifications
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("file:///E:/Yojana/new/JAN2023/HTML/WebTable.html");
		Thread.sleep(2000);
		
		//driver.findElements(By.xpath("//table[@class='12345']//tr")).size();
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='12345']//tr"));
		int rowSize = allRows.size();
		System.out.println(rowSize);//4
		
		int colSize = driver.findElements(By.xpath("//table[@class='12345']//tr[1]//th")).size();
		System.out.println(colSize);//3
		
		driver.quit();
	}
}
