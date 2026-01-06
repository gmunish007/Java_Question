import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class multipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		// creating new tab on the same browser
		driver.switchTo().newWindow(WindowType.TAB);

		// since this requires multiple windows, we request each window. tab ID to switch to it
		Set<String> windw = driver.getWindowHandles();
		Iterator<String> it = windw.iterator();
		
		String parentID = it.next();
		String childID = it.next();

		// switch to child window
		driver.switchTo().window(childID);
		
		// now open new URL on child window since the focus is now on child window
		driver.get("https://rahulshettyacademy.com/");
		
		// get the data from the child window
		
		// switch back to parent window
		driver.switchTo().window(parentID);
		
		// input the value into field
	}
}
