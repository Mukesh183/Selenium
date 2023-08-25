package interviewQuestionsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlineOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub தமிழ்
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement tamil = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		String beforeHovering = tamil.getCssValue("text-decoration");
		System.out.println("Before Hover : "+beforeHovering);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(tamil);
		actions.build().perform();
		
		String afterHovering = tamil.getCssValue("text-decoration");
		System.out.println("After Hover : "+afterHovering);
		

	}

}
