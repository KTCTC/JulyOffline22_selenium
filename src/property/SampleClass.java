package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
PropertyHelper obj = new PropertyHelper("env.properties");
WebDriver driver = new ChromeDriver();
driver.get(obj.getPropertyValue("baseUrl"));

	}

}
