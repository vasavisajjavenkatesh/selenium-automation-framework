package testingFlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTestFlight;

public class SearchPageFlight extends BaseTestFlight {

//	@Test
//	public static void allFields() throws InterruptedException {
//
//		WebElement countryDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(countryDropdownElement);
//		dropdown.selectByVisibleText(loc.getProperty("currency_inr"));
//		driver.findElement(By.id(loc.getProperty("Passenger_dropdown"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id(loc.getProperty("adult_plus_sign"))).click();
//		driver.findElement(By.id(loc.getProperty("adult_plus_sign"))).click();
//		driver.findElement(By.id(loc.getProperty("child_plus_sign"))).click();
//		driver.findElement(By.id(loc.getProperty("departure_city"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector(loc.getProperty("city_bangalore"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class=' ']//a[@class='ui-state-default'][normalize-space()='10']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//
//	@Test
//	public static void currencyDropdown1() throws InterruptedException {
//
//		WebElement countryDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(countryDropdownElement);
//		dropdown.selectByVisibleText(loc.getProperty("currency_inr"));
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//
//	@Test
//	public static void currencyDropdown2() throws InterruptedException {
//
//		WebElement countryDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(countryDropdownElement);
//		dropdown.selectByVisibleText(loc.getProperty("currency_aed"));
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//
//	@Test
//	public static void currencyDropdown3() throws InterruptedException {
//
//		WebElement countryDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(countryDropdownElement);
//		dropdown.selectByVisibleText(loc.getProperty("currency_usd"));
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//
//	@Test
//	public static void passengerDropdown() throws InterruptedException {
//
//		driver.findElement(By.id(loc.getProperty("Passenger_dropdown"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id(loc.getProperty("adult_plus_sign"))).click();
//		driver.findElement(By.id(loc.getProperty("adult_plus_sign"))).click();
//		driver.findElement(By.id(loc.getProperty("child_plus_sign"))).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//
//	@Test
//	public static void radiobutton1() {
//		driver.findElement(By.id(loc.getProperty("radiobutton_oneway"))).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//
//	@Test
//	public static void radiobutton2() {
//		driver.findElement(By.id(loc.getProperty("radiobutton_roundtrip"))).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//
//	@Test
//	public static void radiobutton3() {
//		driver.findElement(By.id(loc.getProperty("radiobutton_multicity"))).click();
//	}

//	@Test
//	public static void passengers() throws InterruptedException {
//		driver.findElement(By.id(loc.getProperty("passenger_dropdown"))).click();
//		delay(3000);
//		for (int i = 1; i < 9; i++) {
//			driver.findElement(By.id(loc.getProperty("adult_plus_sign"))).click();
//		}
//		delay(3000);
//		for (int i = 0; i < 4; i++) {
//			driver.findElement(By.id(loc.getProperty("infant_plus_sign"))).click();
//		}
//		delay(3000);
//		WebElement countryDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(countryDropdownElement);
//		dropdown.selectByVisibleText(loc.getProperty("currency_inr"));
//		driver.findElement(By.id(loc.getProperty("departure_city"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector(loc.getProperty("city_bangalore"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		delay(3000);
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		delay(3000);
//		driver.findElement(By.xpath("//td[@class=' ']//a[@class='ui-state-default'][normalize-space()='10']")).click();
//		delay(3000);
//		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//	
//	@Test
//	public static void passengers1() throws InterruptedException {
//		driver.findElement(By.id(loc.getProperty("passenger_dropdown"))).click();
//		delay(3000);
//		for (int i = 1; i < 9; i++) {
//			driver.findElement(By.id(loc.getProperty("adult_plus_sign"))).click();
//		}
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//	
//	@Test
//	public static void passengers2() throws InterruptedException {
//		
//		driver.findElement(By.id(loc.getProperty("passenger_dropdown"))).click();
//		delay(3000);
//		for (int i = 1; i < 8; i++) {
//			driver.findElement(By.id(loc.getProperty("adult_plus_sign"))).click();
//		}	
//		delay(3000);
//		for (int j=0; j<1; j++) {
//			driver.findElement(By.id(loc.getProperty("child_plus_sign"))).click();
//		}
//		for (int i = 0; i < 4; i++) {
//			driver.findElement(By.id(loc.getProperty("infant_plus_sign"))).click();
//		}
//  	driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}
//	
//	@Test
//	public static void passengers3() throws InterruptedException {
//		
//		driver.findElement(By.id(loc.getProperty("passenger_dropdown"))).click();
//		delay(3000);
//		for (int i = 1; i < 8; i++) {
//			driver.findElement(By.id(loc.getProperty("adult_plus_sign"))).click();
//		}	
//		delay(3000);
//		for (int j=0; j<1; j++) {
//			driver.findElement(By.id(loc.getProperty("child_plus_sign"))).click();
//		}
//		for (int i = 0; i < 5; i++) {
//			driver.findElement(By.id(loc.getProperty("infant_plus_sign"))).click();
//		}
//  	driver.findElement(By.id(loc.getProperty("search_button"))).click();
//	}

//	@Test
//	public static void city() throws InterruptedException {
//		driver.findElement(By.id(loc.getProperty("departure_city"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector(loc.getProperty("city_bangalore"))).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//		
//	}

//	@Test
//	public static void cities() throws InterruptedException {
//		driver.findElement(By.id(loc.getProperty("departure_city"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector(loc.getProperty("city_bangalore"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		delay(3000);
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//		
//	}
//	
//	@Test
//	public static void date() throws InterruptedException {
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		delay(3000);
//		driver.findElement(By.xpath("//td[@class=' ']//a[@class='ui-state-default'][normalize-space()='10']")).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();
//
//	}

//	@Test
//	public static void allMandatoryFields() throws InterruptedException {
//		WebElement countryDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(countryDropdownElement);
//		dropdown.selectByVisibleText(loc.getProperty("currency_inr"));
//		driver.findElement(By.id(loc.getProperty("departure_city"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector(loc.getProperty("city_bangalore"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		delay(3000);
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		delay(3000);
//		driver.findElement(By.xpath("//td[@class=' ']//a[@class='ui-state-default'][normalize-space()='10']")).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();	
//	}
//	
//	@Test
//	public static void country() {
//		driver.findElement(By.id(loc.getProperty("country_dropdown"))).sendKeys("India");
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();	
//		
//	}

//	@Test
//	public static void selectedFields() throws InterruptedException {
//		WebElement countryDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(countryDropdownElement);
//		dropdown.selectByVisibleText(loc.getProperty("currency_inr"));
//		driver.findElement(By.id(loc.getProperty("departure_city"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector(loc.getProperty("city_bangalore"))).click();
//		delay(3000);
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		delay(3000);
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		delay(3000);
//		driver.findElement(By.xpath("//td[@class=' ']//a[@class='ui-state-default'][normalize-space()='10']")).click();
//		driver.findElement(By.id(loc.getProperty("seniorCitizen_checkbox"))).click();
//		driver.findElement(By.id(loc.getProperty("search_button"))).click();	
//	}

	@Test
	public static void checkbox() {
		driver.findElement(By.id(loc.getProperty("Unaccompanied_minor"))).click();
		driver.findElement(By.id(loc.getProperty("search_button"))).click();
	}

	@Test
	public static void checkbox1() {
		driver.findElement(By.id(loc.getProperty("student_checkbox"))).click();
		driver.findElement(By.id(loc.getProperty("search_button"))).click();
	}

	@Test
	public static void checkbox2() {
		driver.findElement(By.id(loc.getProperty("seniorCitizen_checkbox"))).click();
		driver.findElement(By.id(loc.getProperty("search_button"))).click();
	}

	@Test
	public static void checkbox3() {
		driver.findElement(By.id(loc.getProperty("indian_armed_forces"))).click();
		driver.findElement(By.id(loc.getProperty("search_button"))).click();
	}
	
	@Test
	public static void checkbox4() {
		driver.findElement(By.id(loc.getProperty("family&friends_checkbox"))).click();
		driver.findElement(By.id(loc.getProperty("search_button"))).click();
	}
	
	@Test
	public static void noData() {
		driver.findElement(By.id(loc.getProperty("search_button"))).click();
	}
	
	
	

}
