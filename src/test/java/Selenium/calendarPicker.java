import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class calendarPicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='MAA']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']"))
				.click();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	}
}
