package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
	public enum MonthList {January,February,March,April,May,June,August,July,September,October,November,December}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://demoqa.com/date-picker");


		selectRequiredDate(driver, "02", MonthList.March, "1900");
		
		
	}
	
	public static void selectRequiredDate(WebDriver driver, String dd, MonthList month, String yyyy)
	{
		
driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText(yyyy);
		Select mn = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		mn.selectByVisibleText(month.toString());		
		driver.findElement(By.xpath("//*[@class='react-datepicker__month']//*[contains(@class,'0"+dd+"') and contains(@aria-label,'"+month.toString()+"')]")).click();
		
		
	}

}
