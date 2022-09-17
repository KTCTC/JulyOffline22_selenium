package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    	    
	    driver.get("https://demo.guru99.com/test/radio.html");	
	    driver.findElement(By.xpath("//*[@value='Option 1' and @type='radio']")).click();
	    driver.findElement(By.xpath("//*[@value='Option 3' and @type='radio']")).click();
	    driver.findElement(By.xpath("//*[@value='Option 2' and @type='radio']")).click();
	    driver.findElement(By.xpath("//*[@value='Option 2' and @type='radio']")).click();

	}

}
