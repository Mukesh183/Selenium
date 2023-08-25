package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  datePickerMonthYearInput
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		
		WebElement calenderPick = driver.findElement(By.id("datePickerMonthYearInput"));
		calenderPick.click();
		WebElement nextButton = driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']"));
		nextButton.click();
		WebElement toDate =driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, August 26th, 2023']"));
		toDate.click();
		
		WebElement datePick = driver.findElement(By.id("dateAndTimePickerInput"));
		datePick.click();
		
		WebElement timePick = driver.findElement(By.xpath("//li[text()='08:00']"));
		timePick.click();
	}

}
