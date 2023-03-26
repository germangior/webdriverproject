package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	   	 WebDriver driver=new ChromeDriver();
	   	 

	   	 driver.get("https://www.w3schools.com/html/html_tables.asp");
	   	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	   	 WebElement cookie = driver.findElement(By.xpath("//div[@id='accept-choices']"));
	   	 cookie.click();
	   	 List<WebElement> Rows = driver.findElements(By.cssSelector("table#customers>tbody>tr\r\n"));
	   	 List<WebElement> Columns = driver.findElements(By.cssSelector("table#customers>tbody>tr>th"));
	   	 WebElement data = driver.findElement(By.cssSelector("table#customers>tbody>tr:nth-of-type(4)>td:nth-of-type(1)"));
	   	 System.out.println(data.getText());
	   	 System.out.println(Rows.size());
	   	 System.out.println(Columns.size());
	   	 for(int i=2;i<=Rows.size();i++) {
			
			List<WebElement> ColumnsData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"));
			
			System.out.println(ColumnsData.get(0).getText() + " " + ColumnsData.get(1).getText() + " " + ColumnsData.get(2).getText()) ;
			
		}
	   	 			 
	   	
	   	 
	   	 

	}

}
