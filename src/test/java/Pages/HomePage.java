package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.TestBase;

public class HomePage extends TestBase {

	

	@Test
	public void HomePageTest() throws InterruptedException
	{
		OpenBrowser();
		WebElement Page = driver.findElement(By.xpath("//a[text()='Pages']"));
		Actions act=new Actions(driver) ;
				act.moveToElement(Page).build().perform();
				List<WebElement> dropdownlist = driver.findElements(By.xpath("//ul[@class='dropdown']/li"));
				for(int i=0;i<dropdownlist.size();i++)
				{
					String optionName = dropdownlist.get(i).getText();
					if(optionName.equalsIgnoreCase("Contact"))
					{
						WebElement opt = dropdownlist.get(i);
						act.click(opt).build().perform();
						Thread.sleep(3000);
						
					}
				}
				driver.switchTo().alert().accept();
				

	}
}
