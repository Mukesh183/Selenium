package interviewQuestionsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Learn Automation Online");
		Thread.sleep(3000);
		List<WebElement> getSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		/*
		 * int position=0; 
		 * for (WebElement webElement : getSuggestions) {
		 * System.out.println(webElement.getText()); 
		 * position++;
		 * if (position==4) {
		 * webElement.click(); break;
		 * } }
		 */
		
		for (WebElement webElement : getSuggestions) {
			String textData = webElement.getText();
			if (textData.contains("arul")) {
				webElement.click();
				break;
				
			}
		}
		
		
		

	}
}
