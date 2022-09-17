package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");	  
	    
	   WebElement emailText = driver.findElement(By.id("email"));
	   
	emailText.sendKeys("WElcome to KTCTC");

	String msg = emailText.getAttribute("value");
	System.out.println(msg);
	
	   

	}

}
