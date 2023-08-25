package interviewQuestionsSelenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGoogleResult {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Vikram Movie \n");
		Thread.sleep(3000);
		
		//get all links
		/*List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement links: totalLinks) {
			System.out.println(links.getAttribute("href"));
		}*/
		
		//get Main Links
		List<WebElement> mainLinks = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		for(WebElement links:mainLinks) {
			System.out.println(links.getText());
		}
		
	}

}
