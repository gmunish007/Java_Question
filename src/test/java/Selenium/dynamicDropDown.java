import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;


public class dynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	
	driver.findElement(By.xpath("//a[@value='MAA']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
	
	//List<WebElement> str = driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li")).getText();
	}
}
