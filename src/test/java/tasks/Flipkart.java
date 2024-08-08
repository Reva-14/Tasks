package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//	option.addArguments("disable-popups");
		//	option.addArguments("disable-notifications");
			option.addArguments("start-maximized");
		//	option.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	Absolute Xpath
	    driver.findElementByXPath("/html/body//div[2]//div//a[4]/div//span/span").click();
	//	Xpath axes - parent
		driver.findElementByXPath("//a[text()='Cart']/parent::div").click();
	//  Xpath axes - following
		driver.findElementByXPath("//span[text()='Appliances']/following::span/span[text()='Travel']").click();
	//  Xpath axes - preceding
        driver.findElementByXPath("//input[@value=\"FLIPKART\"]/preceding::input[@class=\"Pke_EE\"]").sendKeys("Redmi Mobiles");
			}

}

