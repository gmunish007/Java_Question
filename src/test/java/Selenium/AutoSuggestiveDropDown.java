import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		String countryName = "IND";
		
		driver.findElement(By.id("autosuggest")).sendKeys(countryName);
		
		Thread.sleep(2000);
		
		List<WebElement> str = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(int i=0; i<str.size(); i++) {
			System.out.println(str.get(i).getText());
			
			if(str.get(i).getText().equalsIgnoreCase("Indonesia")){
				str.get(i).click();				
			}
		}
		/*for(WebElement option : str) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
			}
		} */
		
	}
}
