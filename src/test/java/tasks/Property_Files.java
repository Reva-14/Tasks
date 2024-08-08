package tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Files {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\91917\\eclipse-workspace\\Tasks\\src\\test\\resources\\File Properties");
		FileInputStream inputstream = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(inputstream);
		System.out.println(prop.getProperty("password"));
		FileOutputStream outputstream = new FileOutputStream(f);
		prop.setProperty("url", "https://www.youtube.com/");
		prop.store(outputstream, "stored data");
		
	}
}
