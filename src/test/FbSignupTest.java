package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;

public class FbSignupTest {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			WebElement cookie = driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']"));
			cookie.click();
			WebElement signUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
			signUp.click();
			WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
			WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
			WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			fName.sendKeys("John");
			lName.sendKeys("Smith");
			mobile.sendKeys("99999999999");
			password.sendKeys("German123");
			WebElement selectedDay = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
			System.out.println("The default day is " + selectedDay.getText());
			
			WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
			Select ddDay = new Select(day);
			ddDay.selectByVisibleText("10");
			//ddDay.selectByValue("10");
			
			WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
			Select ddMonth = new Select(Month);
			ddMonth.selectByVisibleText("Jan");
			
			WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
			Select ddYear = new Select(Year);
			ddYear.selectByVisibleText("2000");
			
			List<WebElement> list=driver.findElements(By.xpath("//select[@title='Month']/option"));
			for(WebElement month:list) {
				System.out.println(month.getText());
			}
			String Gender = "Male";
			
			/*String genderXpath = "//label[text()='placeholder']";
			String newXpath = genderXpath.replace("placeholder", Gender);*/
			
			String newXpath = "//label[text()='" + Gender + "']";
			
			WebElement genderElem = driver.findElement(By.xpath(newXpath));
			genderElem.click();



	}
}
