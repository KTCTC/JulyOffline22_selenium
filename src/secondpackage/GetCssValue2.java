package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCssValue2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");	  
	    
	   WebElement fbText = driver.findElement(By.name("login"));
	   
	 String font = fbText.getCssValue("font-family");
	
	System.out.println(font);
	System.out.println(fbText.getCssValue("color"));
	System.out.println(fbText.getCssValue("font-size"));
	System.out.println(fbText.getCssValue("background-color"));
	
	// below logic is to click on button if its color changed to  rgba(23, 255, 23, 0)
	for (int i = 0; i<40; i++)
	{
		if (fbText.getCssValue("background-color").equals("rgba(24, 119, 242, 1)"))
		{
			fbText.click();
			break;
		}
		
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	  

	}

}
