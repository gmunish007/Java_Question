package TestNg.Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingWithParameter {

    WebDriver driver;

    @Parameters({"browser"})
    @Test
    public void getData(String browser){

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        else{
        }
        driver.get("https://www.google.com");
    }

}
