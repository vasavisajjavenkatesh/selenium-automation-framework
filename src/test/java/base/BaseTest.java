package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties pro = new Properties();
	public static Properties loc = new Properties();
	public static FileReader file;
	public static FileReader file1;

	@BeforeMethod
	public void setup() throws IOException {
		
		if(driver==null) {
			System.out.println(System.getProperty("user.dir"));
			FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			FileReader file1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			
			pro.load(file);
			loc.load(file1);
			
			if(pro.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(pro.getProperty("testurl"));
				
			}
		}
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("tearDown successfull");
	}
	
}
