package first;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    EdgeDriver dr = new EdgeDriver();
    ChromeDriver driver1 = new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    
    dr.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads");
	
    driver1.get("https://demoqa.com/text-box");
    
    driver.close();
    dr.close();
    driver1.close();
    driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");

	}

}
