package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable2_PrintTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\DEC2022\\DEC2022\\AUTOMATION\\driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		// Handling of notifications
		option.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(option);// upcasting

		driver.manage().window().maximize();

		driver.get("file:///E:/Yojana/new/JAN2023/HTML/WebTable.html");
		Thread.sleep(2000);

		int rowSize = driver.findElements(By.xpath("//table[@class='12345']//tr")).size();

		for (int i = 1; i <= rowSize; i++) {// row
			int colSize = 0;
			if (i == 1) {
				colSize = driver.findElements(By.xpath("//table[@class='12345']//tr[" + i + "]//th")).size();
			} else {
				colSize = driver.findElements(By.xpath("//table[@class='12345']//tr[" + i + "]//td")).size();
			}
			for (int j = 1; j <= colSize; j++) {// column
                String text = "";
                if(i==1) {
                	text=driver.findElement(By.xpath("//table[@class='12345']//tr["+i+"]//th["+j+"]")).getText();
                }else {
                	text=driver.findElement(By.xpath("//table[@class='12345']//tr["+i+"]//td["+j+"]")).getText();
                }
                
                System.out.print(text+"  ");
			}
			
			System.out.println();
		}
		
		Thread.sleep(2000);
		driver.quit();

	}
}
