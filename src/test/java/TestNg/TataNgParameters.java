package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TataNgParameters {

    @Parameters({"url"})
    @Test
    public void printUrl(String url){
        System.out.println("URL value is: "+url);
    }

    @Parameters({"fname"})
    @Test
    public void printFname(String fname){
        System.out.println("Fname is "+fname);
    }

    @Test
    @Parameters({"url", "fname"})
    public void printBothParameter(String url, String fname){
        System.out.println("URL: "+url+" fname: "+fname);
    }
}
