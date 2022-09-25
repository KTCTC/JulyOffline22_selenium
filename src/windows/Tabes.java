package windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriver dri = new ChromeDriver();
		dri.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://demoqa.com/browser-windows");

		String parentWindow = driver.getWindowHandle();

		System.out.println(parentWindow);
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String each:allHandles)
		{
			
			if (!each.equals(parentWindow))
			{
				driver.switchTo().window(each);
			}
			
		}
		System.out.println(driver.getWindowHandle());
		String msg = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(msg);
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.quit();
	}

}
