package secondpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		List<WebElement> textBox = driver.findElements(By.xpath("//input[@id='email' and @name='pass']"));
		WebElement first = textBox.get(0);
		first.sendKeys("First ");
		textBox.get(1).sendKeys("Second");
		
		for (WebElement each:textBox)
		{
			each.sendKeys("First");
		}
		

	}

}
