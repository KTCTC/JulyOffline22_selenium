package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    	    
	    driver.get("http://output.jsbin.com/osebed/2");	
	    Select sel = new Select(driver.findElement(By.id("fruits")));
	    boolean flag = sel.isMultiple();
	    System.out.println(flag);
	    sel.selectByIndex(1);
	    sel.selectByValue("orange");
	    sel.selectByVisibleText("Grape");
	    
	    List<WebElement> allOp = sel.getOptions();
	    for (WebElement each:allOp)
	    {
	    	System.out.println(each.getText());
	    }
	    
	   List<WebElement> seleOptions = sel.getAllSelectedOptions();
	   
	   for (WebElement each:seleOptions)
	   {
		   System.out.println(each.getText());
	    
	   }
	   WebElement firstElement = sel.getFirstSelectedOption();
	    String msg = firstElement.getText();
	    System.out.println(msg);
	    sel.deselectByVisibleText("Orange");
	    
	    sel.deselectAll();
	    
	}

}
