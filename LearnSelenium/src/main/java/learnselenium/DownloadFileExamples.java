package learnselenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/file");
		
		WebElement findLink = driver.findElement(By.xpath("//button[@class='button'][1]"));
		findLink.click();
		Thread.sleep(3000);
		
		File findFileLocation = new File("C:\\Users\\sivapriya\\Downloads");
		File[] findfiles = findFileLocation.listFiles();
		for (File files : findfiles) {
			if (files.getName().equals("sample.xlsx")) {
				System.out.println("File Downloaded Successfully");
				break;
				
			}
		}

	}

}
