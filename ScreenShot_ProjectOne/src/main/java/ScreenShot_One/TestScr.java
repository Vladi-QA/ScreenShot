package ScreenShot_One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerListener.class)
public class TestScr extends Initialization{
	
	@BeforeMethod
	public void start() {
		initializationOne();
	}
	@AfterMethod
	public void finish() {
		driver.quit();
	}

	@Test
 
		public void isDisplay() {
			WebElement element = driver.findElement(By.xpath("//header/section[1]/a[1]/img[0]"));
			if(!element.isDisplayed()) {
				System.out.println("Element is not displayed");
			}else {
				System.out.println("Element is present");
			}
		}
	}
 
