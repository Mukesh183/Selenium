package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/index.html");
		
		WebElement brokenImage= driver.findElement(By.xpath("//img[@class='animate-image-1 top_image_bounce']"));
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
			
		}else {
			System.out.println("The image is not broken");
		}

	}

}
