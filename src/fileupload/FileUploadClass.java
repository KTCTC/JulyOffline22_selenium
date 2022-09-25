package fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir")+"\\env.properties");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		WebDriverWait wt = new WebDriverWait(driver, 8);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),'1 file')]"))));
		
		String msg = driver.findElement(By.id("res")).getText();
		System.out.println(msg);
		System.out.println("message has been printed......");
		String ss = msg.replace("\n", " ");
		
		if (ss.equals("1 file has been successfully uploaded."))
		{
			System.out.println("File upload test case is passed");
			
		}
		else
		{
			
			System.out.println("File upload test case is failed");
		}
		
	}

}
