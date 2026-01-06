package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class practiceExerciseAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// click on check box
		driver.findElement(By.id("checkBoxOption2")).click();
		
		// get the check box label text
		String checkBoxOption = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		System.out.println(checkBoxOption);
		
		// select the above selected check box from the drop down
		WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
		Select option = new Select(dropDown);
		option.selectByVisibleText(checkBoxOption);
		
		
		// input check box label text in put box
		driver.findElement(By.id("name")).sendKeys(checkBoxOption);
		
		// Click on Alert button
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		// switch to alert pop up window and get the alert text
		String alertText = driver.switchTo().alert().getText();
		
		//confirm if input text in in the alert window statement
		if(alertText.contains(checkBoxOption)) {
			System.out.println("label is available:");
		}
	}
}
