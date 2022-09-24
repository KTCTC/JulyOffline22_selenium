package navigation.mathods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import property.PropertyHelper;

public class NAvigationClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		PropertyHelper obj = new PropertyHelper("env.properties");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(obj.getPropertyValue("baseUrl"));
		
		driver.navigate().to(obj.getPropertyValue("baseUrl")+"/text-box");
		driver.navigate().forward();
		driver.findElement(By.xpath("//*[contains(text(),'Check Box')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Radio Button')]")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
