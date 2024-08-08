package tasks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		//updated
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
//		driver.findElementByXPath("//a[@title=\"Music\" and @id=\"endpoint\"]").click();
		List<WebElement> links = driver.findElementsByTagName("link");
		Iterator<WebElement> linksIterator = links.iterator();
		while(linksIterator.hasNext()) {
			WebElement link = linksIterator.next();
			String href = link.getAttribute("href");
			if(href==null ||href.isEmpty()) {
				System.out.println("Link is empty "+href);
			}
			else if(!href.startsWith("https://www.youtube.com/")) {
			System.out.println("Link is not related to our application : "+href);
			}
			else {
				try {
					@SuppressWarnings("deprecation")
					HttpURLConnection http = (HttpURLConnection) new URL(href).openConnection();
					http.setRequestMethod("HEAD");
					http.connect();
					int responseCode = http.getResponseCode();
					if(responseCode==200) {
						System.out.println("Not a Broken Link :"+href);
					} else{
						System.out.println("Broken Link :"+href);}}
				catch (MalformedURLException e) {
					e.printStackTrace();
				}
			} 
		} 
	}}



