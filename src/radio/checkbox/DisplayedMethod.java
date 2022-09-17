package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/radio.html");
		//boolean flag = driver.findElement(By.xpath("//*[@value='Option 5' and @type='radio']")).isDisplayed();
		
		boolean flag = isElementDisplayed(driver, By.xpath("//*[@value='Option 1' and @type='radio']"));
		System.out.println(flag);

	}

	public static boolean isElementDisplayed(WebDriver dri, By oo) {
		boolean flag = false;
		try {
			flag = dri.findElement(oo).isDisplayed();
		} catch (Exception e) {

			flag = false;
		}

		return flag;
	}

}
