package interviewQuestionsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");//DOM appers wait
//		driver.navigate().to("https://letcode.in/windows"); //Its doest wait for DOM
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
	}

}
