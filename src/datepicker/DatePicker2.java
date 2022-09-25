package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {
	public enum MonthList {January,February,March,April,May,June,August,July,September,October,November,December}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://demoqa.com/date-picker");

        WebElement datePicker = driver.findElement(By.id("datePickerMonthYearInput"));
        datePicker.click();
		for (int i = 0;i<10;i++)
		{
			datePicker.sendKeys(Keys.BACK_SPACE);
		}
        datePicker.sendKeys("02/14/1988");
        datePicker.sendKeys(Keys.ENTER);
		
		
	}
	


}
