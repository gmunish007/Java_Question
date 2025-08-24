package TestNg.Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners1.class)
public class TestngListeners {

    static WebDriver driver = new ChromeDriver();

    @Test
    public void checkListener(){
        driver.get("https://www.mozilla.org/");
        System.out.println("current title is: "+driver.getTitle());
        System.out.println("Current url is:"+driver.getCurrentUrl());

        Assert.assertTrue(2==3);
    }
}