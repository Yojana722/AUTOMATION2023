package TestNG;
import org.apache.log4j.Logger;

/*public class Example {
    private static final Logger logger = Logger.getLogger(Example.class);

    public static void main(String[] args) {
        // To generate debug logs
    	logger.debug("Debug message");
        // To generate info logs
    	logger.info("Info message");
        // To generate warning logs
    	logger.warn("Warn message");
        // To generate error logs
    	logger.error("Error message");
        // To generate fatal logs
    	logger.fatal("Fatal message");
    }*/
	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jExample {
  private static Logger logger = Logger.getLogger(Log4jExample.class);

  @Test
  public void TC1(){
    PropertyConfigurator.configure("log4j.properties");

    System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\DEC2022\\AUTOMATION\\driver\\chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(option);//upcasting

    logger.debug("Starting test");
    driver.get("https://www.google.com/");
    logger.info("Opened Google website");
    String title = driver.getTitle();
    logger.debug("Page title: " + title);
    if (title.equals("Google")) {
      logger.info("Title is correct");
    } else {
      logger.error("Title is incorrect");
    }
    driver.quit();
    logger.debug("Test complete");
  }
}
