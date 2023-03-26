package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	  	//WebElement cookie = driver.findElement(By.cssSelector("button[id='manageSettings'] span[class='mat-button-wrapper'] span"));
	   	//cookie.click();
		WebElement newtab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		
		newtab.click();
		
		
		

	}

}
