package interviewQuestionsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElementExamples {
	static WebElement q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	//	driver.switchTo().activeElement().sendKeys("CSK \n");
		
		PageFactory.initElements(driver, ActiveElementExamples.class);
		q.sendKeys("CSK \n");

	}

}
