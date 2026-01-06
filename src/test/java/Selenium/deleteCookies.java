import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteCookies {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// delete all cookies
		driver.manage().deleteAllCookies();

		// delete a particular cookie
		driver.manage().deleteCookieNamed("named");

		driver.get("https://www.google.com");
	}
}
