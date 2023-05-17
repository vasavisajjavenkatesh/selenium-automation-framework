package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readpropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\vasav\\eclipse-workspace\\testing\\src\\test\\resources\\configfiles\\config.properties");
	
		Properties pro = new Properties();
		pro.load(file);
		
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("testurl"));
		
	}

}
