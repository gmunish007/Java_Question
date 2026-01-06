package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.Set;
import java.util.Iterator;

public class windowHandleAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterateWindow = windowHandles.iterator();
		
		String parentID= iterateWindow.next();
		String childID = iterateWindow.next();
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentID);
	}

}
