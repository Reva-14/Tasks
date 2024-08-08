package tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetProductPrices {
	public static void main(String[] args) throws InvalidFormatException, IOException  {
		File f = new File("C:\\Users\\91917\\eclipse-workspace\\Tasks\\target\\Task.xlsx");
		FileOutputStream output = new FileOutputStream(f);
		try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet sheet = workbook.createSheet("PRICELIST");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91917\\eclipse-workspace\\MavenProject\\target\\Driver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			//		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByXPath("//input[@placeholder=\"Search for Products, Brands and More\"]").sendKeys("Redmi Phones",Keys.ENTER);
			String text=driver.findElementByXPath("(//div[@class='KzDlHZ'])[1]").getText();
			System.out.println(text);
			String price=driver.findElementByXPath("(//div[@class='Nx9bqj _4b5DiR'])[1]").getText();
			System.out.println(price);
			List<WebElement> lists =driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
			List<WebElement> list =driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
			for(int i=0;i<lists.size()-1;i++) {
				System.out.println(lists.get(i).getText()+" - "+list.get(i).getText());
				XSSFRow row = sheet.createRow(i);
				XSSFCell cell = row.createCell(0);
				cell.setCellValue(lists.get(i).getText());
				XSSFCell cell1 = row.createCell(1);
				cell1.setCellValue(list.get(i).getText());
			} workbook.write(output);	}}}