package testing;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadxlsData;

public class MyFirstTest extends BaseTest {
	
	

	@Test (dataProviderClass=ReadxlsData.class,dataProvider="data")
	public static void loginTest(String Username, String Password) throws InterruptedException
	{


		driver.findElement(By.linkText(loc.getProperty("sign_in"))).click();

		driver.findElement(By.cssSelector(loc.getProperty("email_field"))).sendKeys(Username);
		driver.findElement(By.cssSelector(loc.getProperty("next_button"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys(Password);
		driver.findElement(By.id(loc.getProperty("login_button"))).click();
		Thread.sleep(5000);

	}

	
}




