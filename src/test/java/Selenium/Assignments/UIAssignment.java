package Assignments;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UIAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("Munish Gupta");

		driver.findElement(By.name("email")).clear();

		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");

		driver.findElement(By.id("exampleInputPassword1")).clear();

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234567890");

		WebElement dropDown = driver.findElement(By.id("exampleFormControlSelect1"));

//		Thread.sleep(2000);

		Select gender = new Select(dropDown);
		gender.selectByVisibleText("Male");

		driver.findElement(By.id("inlineRadio2")).click();

		driver.findElement(By.name("bday")).sendKeys("11/12/1990");

		driver.findElement(By.className("btn-success")).click();
	}
}
