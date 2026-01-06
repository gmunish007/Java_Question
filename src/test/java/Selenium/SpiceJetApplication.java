import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SpiceJetApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='MAA']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']"))
				.click();

		System.out.println("Radio button disabled: "+driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println("Radio button enabled: "+driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());

		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropDown);
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//div[@class='ad-row']/div[2]/span/following-sibling::span[2]")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.className("paxinfo")).getText());

	}
}
