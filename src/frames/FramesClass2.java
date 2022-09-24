package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.navigate().to("https://demoqa.com/nestedframes");
		
		
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@srcdoc,'<p>Child Iframe</p>')]")));
		
		
		String msg = driver.findElement(By.xpath("//*[contains(text(),'Child Iframe')]")).getText();
		System.out.println(msg);
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		

	}

}
