package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void invokeBrowser()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uat02\\eclipse-workspace\\Framework\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	}
	public void closeBrowser()
	{
		driver.close();
	}

}
