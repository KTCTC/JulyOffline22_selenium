package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		WebElement textBox = driver.findElement(By.xpath("//input[@id='email' and @name='pass']"));
		textBox.sendKeys("KTCTC");

	}

}
