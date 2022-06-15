package testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Google extends Base_class {

	WebDriver driver;
	
	@Test
	public void googletitle() {
		
		driver = Base_class.driver();
		driver.get("http://www.google.com");
		String expectedPageTitle = "Google";
		Assert.assertTrue(driver.getTitle().contains(expectedPageTitle), "Test Failed");
	}

	@Test
	public void gmailtitle() {
		
		driver = Base_class.driver();
		driver.get("http://www.gmail.com");
		String expectedPageTitle = "Gmail";
		Assert.assertTrue(driver.getTitle().contains(expectedPageTitle), "Test Failed");
	}

	@AfterMethod
	public void close_browser() {
		driver.close();
	}
}
