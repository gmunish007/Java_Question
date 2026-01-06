import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class locators {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
	driver.findElement(By.id("inputUsername")).sendKeys("munish");
	
	driver.findElement(By.name("inputPassword")).sendKeys("123456789");
	
	driver.findElement(By.className("signInBtn")).click();
	
	String errorMsg = driver.findElement(By.cssSelector(".error")).getText();
	System.out.println("Incorrect credentials message: " +errorMsg);
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("aman");
	
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abc@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("1234567890");
	
	String pwdMsg = getPassword(driver);
	
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("inputUsername")).sendKeys("aman");
	
	driver.findElement(By.cssSelector("input[type*='passw']")).sendKeys(pwdMsg);
	
	driver.findElement(By.id("chkboxTwo")).click();
	
	driver.findElement(By.className("signInBtn")).click();
	
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
	String retrievedMsg = driver.findElement(By.xpath("//div[contains(@class,'login')]/p")).getText();
	System.out.println(retrievedMsg);
	
	String loggedMsg = "You are successfully logged in.";
	
	Assert.assertEquals("You are successfully logged in.", retrievedMsg);
	
	driver.findElement(By.cssSelector("form p")).getText();
	
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	
	driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException{
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		Thread.sleep(2000);
		
		String pwdMsg = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(pwdMsg);
		
		String str = pwdMsg.split("'")[1];	
		System.out.println(str);
		return str;
		
	}
}





