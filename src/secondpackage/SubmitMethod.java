package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");	  
	    
	    driver.findElement(By.id("email")).sendKeys("Welcome to KTCTC");
	    
	   WebElement passTextBox = driver.findElement(By.name("pass"));
	    
	   passTextBox.sendKeys("KTCTC12345");

	  driver.findElement(By.name("login")).submit();

	}

}
