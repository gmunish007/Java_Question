import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windowAuthenticationPopUp {

	
	// here you have to input user name and password into popup window.
	// there is a line need to be added while mentioning site url. that line contains the user name and password. 
	
	// now you will not get the login window, selenium will automatically input both user name and password into it
	// and redirect the page to the next screen
	
	
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		
		// click on Basic Auth tag
		driver.findElement(By.linkText("Basic Auth")).click();
		
	}
}
