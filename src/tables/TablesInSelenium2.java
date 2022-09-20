package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesInSelenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demo.guru99.com/test/web-table-element.php");	
	    
	    List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
	    System.out.println(allRows.size());
	    //driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr")).findElement(By.xpath("/td[1]/a"));
	    for (WebElement each:allRows)
	    {
	    	String nameOfCompany = each.getText();
	    	System.out.println(nameOfCompany);
	    }
	    
	    
	}

}
