package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
		    ChromeDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.facebook.com/");
		    
		    By em = By.id("email");
		    
		    WebElement emailTextBox = driver.findElement(em);
		    
		    emailTextBox.sendKeys("Welcome to KTCTC");
		    
		    By ps = By.name("pass");
		    
		   WebElement passTextBox = driver.findElement(ps);
		    
		   passTextBox.sendKeys("KTCTC12345");
		   
		   By lg = By.name("login");
		   
		  WebElement loginButton = driver.findElement(lg);
		  loginButton.click();

	}

}
