package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			dr.get("https://www.linkedin.com/");
			

	}
}
