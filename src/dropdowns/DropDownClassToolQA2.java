package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClassToolQA2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    	    
	    driver.get("https://demoqa.com/select-menu");	
	    driver.findElement(By.xpath("//*[@id='withOptGroup']//input")).sendKeys("Group 1, option 2");
	    driver.findElement(By.xpath("//*[@id='withOptGroup']//input")).sendKeys(Keys.ENTER);
	    
	    //driver.findElement(By.xpath("//*[contains(text(),'Group 1, option 1')]")).click();
	    
	    
	}

}
