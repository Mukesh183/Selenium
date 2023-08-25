package learnselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement dropDown1 = driver.findElement(By.id("fruits"));
		Select selectOrange = new Select(dropDown1);
		selectOrange.selectByValue("2");
		selectOrange.selectByIndex(4);
		selectOrange.selectByVisibleText("Pine Apple");
		
		WebElement superHeros = driver.findElement(By.id("superheros"));
		Select noOfSuperHeros = new Select(superHeros);
		List<WebElement> noOfSH = noOfSuperHeros.getOptions();
		int sizeOfSuperHeros =  noOfSH.size();
		System.out.println("Total Super Heros :"+sizeOfSuperHeros);
		noOfSuperHeros.selectByIndex(0);
		noOfSuperHeros.selectByIndex(1);
		noOfSuperHeros.selectByIndex(2);
		
		WebElement progLang = driver.findElement(By.id("lang"));
		Select lastLang = new Select(progLang);
		lastLang.selectByValue("sharp");
		
		WebElement selectCountry = driver.findElement(By.id("country"));
		selectCountry.sendKeys("India");

	}

}
