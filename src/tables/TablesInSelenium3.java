package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesInSelenium3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demo.guru99.com/test/web-table-element.php");	
	    
	    List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	    System.out.println(allRows.size());
	    
	    for (int i = 1; i<=allRows.size();i++)
	    {
	    	String cName = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[1]/a")).getText();
	    	System.out.println(cName);
	    }
	    
	   
	    
	    
	}

}
