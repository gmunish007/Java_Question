import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;

public class frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		// Switch to frame window
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		// Apply Drag and Drop inside a frame
		// Apply Actions class
		Actions a = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
		a.dragAndDrop(drag, drop).build().perform();
		
		// switch back to main screen
		driver.switchTo().defaultContent();

		

	}
}
