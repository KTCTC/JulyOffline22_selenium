package tables;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesInSelenium4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/webtables");	
	    
	    HashMap<String, String> dd = getUserDetails(driver, "alden@example.com");
	   String fna = dd.get("FirstName");
	    System.out.println(fna);
	    
	    for(Entry<String, String> each:dd.entrySet())
	    {
	    	System.out.println(each.getKey());
	    	System.out.println(each.getValue());
	    }
	    
	    
	    printDetailsOfProvidedEmailId(driver, "alden@example.com");
	    printDetailsOfProvidedEmailId(driver, "cierra@example.com");
	    
	}
	
	public static void printDetailsOfProvidedEmailId(WebDriver driver, String email)
	{
		WebElement el = driver.findElement(By.id("searchBox"));
		el.clear();
		el.sendKeys(email);
		String fName = driver.findElement(By.xpath("//*[contains(text(),'"+email+"')]/preceding-sibling::div[3]")).getText();
	    
		   System.out.println(fName);
		   String dept = driver.findElement(By.xpath("//*[contains(text(),'"+email+"')]/following-sibling::div[2]")).getText();
		    System.out.println(dept);
		    el.clear();
	}
	
	public static HashMap<String,String> getUserDetails(WebDriver driver, String email)
	{
		WebElement el = driver.findElement(By.id("searchBox"));
		el.clear();
		el.sendKeys(email);
		HashMap<String, String> data = new HashMap<>();
		data.put("FirstName", driver.findElement(By.xpath("//*[contains(text(),'"+email+"')]/preceding-sibling::div[3]")).getText());
		data.put("LastName", driver.findElement(By.xpath("//*[contains(text(),'"+email+"')]/preceding-sibling::div[2]")).getText());
		data.put("Age", driver.findElement(By.xpath("//*[contains(text(),'"+email+"')]/preceding-sibling::div[1]")).getText());
		data.put("Eamil", driver.findElement(By.xpath("//*[contains(text(),'"+email+"')]")).getText());
		data.put("Salary", driver.findElement(By.xpath("//*[contains(text(),'"+email+"')]/following-sibling::div[1]")).getText());
		data.put("DepartMent", driver.findElement(By.xpath("//*[contains(text(),'"+email+"')]/following-sibling::div[2]")).getText());
		el.clear();
  return data;

		
		
	}

}
