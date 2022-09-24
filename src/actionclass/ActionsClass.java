package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import property.PropertyHelper;

public class ActionsClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		PropertyHelper obj = new PropertyHelper("env.properties");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(obj.getPropertyValue("baseUrl"));
		
		driver.navigate().to(obj.getPropertyValue("baseUrl")+"/buttons");
		
		Actions act = new Actions(driver);
		
		act.click(driver.findElement(By.xpath("//*[starts-with(text(),'Click Me')]"))).build().perform();
		
		//act.moveToElement(driver.findElement(By.xpath("//*[starts-with(text(),'Click Me')]"))).click().perform();
    
		act.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().perform();
		
		act.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
	}

}
