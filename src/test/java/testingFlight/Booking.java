package testingFlight;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTestFlight;

public class Booking extends BaseTestFlight{

	@Test
	public static void Passengers() throws InterruptedException {
		
		
		
		driver.findElement(By.id(loc.getProperty("Passenger_dropdown"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id(loc.getProperty("done_button"))).click();
		
		
	}

}
