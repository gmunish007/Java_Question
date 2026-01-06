package Selenium.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class frameAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		// Get the count of frames
		System.out.println("Total number of frames: " + driver.findElements(By.tagName("frame")).size());

		// Switch to the parent frame
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));

		// Switch to the middle frame
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

		// Get the text from middle frame;
		System.out.println(driver.findElement(By.id("content")).getText());
		
		// Switch to parent frame
		driver.switchTo().defaultContent();
		
		// switch to main window
		driver.switchTo().defaultContent();
	}
}
