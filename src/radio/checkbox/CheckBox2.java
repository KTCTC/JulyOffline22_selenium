package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    	    
	    driver.get("https://demo.guru99.com/test/radio.html");	
	   WebElement checkBox = driver.findElement(By.xpath("//*[@value='checkbox1' and @type='checkbox']"));	 
	   
	   System.out.println(checkBox.isDisplayed());
	   System.out.println(checkBox.isEnabled());
	   System.out.println(checkBox.isSelected());
	   
	   checkBox.click();
	   
	   System.out.println(checkBox.isDisplayed());
	   System.out.println(checkBox.isEnabled());
	   System.out.println(checkBox.isSelected());
	 
	}

}
