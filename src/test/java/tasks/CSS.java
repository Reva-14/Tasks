package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html#google_vignette");
		driver.findElementByCssSelector("#firstName").sendKeys("Revathy");                    //id
		driver.findElementByCssSelector("input[id=\"lastName\"]").sendKeys("Thangam");        //other attribute
		driver.findElementByCssSelector("input.gender").sendKeys("Female");                   //class
		driver.findElementByCssSelector("input[placeholder*=\"City\"]").sendKeys("Chennai"); //contains
		driver.findElementByCssSelector("input[placeholder^=\"Country\"]").sendKeys("India");   //Starts with
		driver.findElementByCssSelector("input[placeholder$=\"question\"]").sendKeys("What is ur DOB ?"); //Ends with
		driver.findElementByCssSelector("input[placeholder=\"Enter your security answer\"]:nth-child(7)").sendKeys("What is ur pet's name ?"); //array
		driver.findElementByCssSelector("input[type=text]:nth-child(8)").sendKeys("Verification done");   //array
}}
