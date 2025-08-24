package TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class CrossBrowserTestingWithDataProvider {

    WebDriver driver;

    @Test(dataProvider = "setBrowser")
    public void setup(String browser) {
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        driver.get("https://www.google.com");
    }

    @DataProvider
    public Object[][] setBrowser() {
        return new Object[][]{
                {"chrome"},
                {"edge"}
        };
    }
}
