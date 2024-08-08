package tasks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Desired_Capabilities {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("disable-popups");
//		option.addArguments("disable-notifications");
//		option.addArguments("start-maximized");
//		option.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
//		Absolute Xpath
		driver.findElementByXPath("/html/body/div/div/div//header/div/div/div/div/div[2]/div/a[3]").click();
//		Xpath axes
        driver.findElementByXPath("//a[text()='Sports']/following-sibling::a").click();
        
	}

}
