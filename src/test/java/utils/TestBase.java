package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public void OpenBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
}
