package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	WebDriver driver;
	Properties pro = new Properties();
	FileInputStream fil;

	public void setup() throws IOException {
		fil = new FileInputStream("D:\\Automation\\MyFirstProject\\resources\\configes\\config.properties");
		pro.load(fil);
		if (pro.getProperty("browser").equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			driver.get(pro.getProperty("url"));

		}

	}

	

}
