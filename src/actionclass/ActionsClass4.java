package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import property.PropertyHelper;

public class ActionsClass4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(obj.getPropertyValue("baseUrl"));
		
		driver.navigate().to("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
act.click(driver.findElement(By.id("email"))).keyDown(Keys.SHIFT).sendKeys("welcome to ktctc").keyUp(Keys.SHIFT).perform();

		

	}

}
