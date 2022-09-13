package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdClass {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
		    ChromeDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.facebook.com/");
		    
		    By em = By.id("email");
		    
		    WebElement emailTextBox = driver.findElement(By.id("email"));
		    
		    driver.findElement(By.id("email")).sendKeys("Welcome to KTCTC");
		    driver.findElement(By.id("email")).sendKeys("Second time");
		   
		    
		    //By ps = By.name("pass");
		    
		   WebElement passTextBox = driver.findElement(By.name("pass"));
		    
		   passTextBox.sendKeys("KTCTC12345");
		   passTextBox.sendKeys("Sample");
		   
		   //By lg = By.name("login");
		   
		  //WebElement loginButton = driver.findElement(By.name("login"));
		  driver.findElement(By.name("login")).click();

	}

}
