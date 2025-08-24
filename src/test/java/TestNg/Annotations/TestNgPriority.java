package TestNg.Annotations;

import org.testng.annotations.*;

public class TestNgPriority {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("this is before suite.");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("this is after suite.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("print before Test.");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("print after test.");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class.");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("this is after class.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method.");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method.");
    }

    @Test(priority=-2)
    public void manu(){
        System.out.println("print -2.");
    }

    @Test(enabled=true, priority=0)
    public void sona(){
        System.out.println("print 0.");
    }

    @Test(enabled=true, priority=-1)
    public void manju(){
        System.out.println("print -1.");
    }

    @Test(priority=0)
    public void sonu(){
        System.out.println("print 0");
    }

    @Test(priority=2)
    public void meeta(){
        System.out.println("print 2.");
    }

    @Test(priority=3)
    public void mehar(){
        System.out.println("print 3.");
    }

    @Test(priority=-3)
    public void priyanka(){
        System.out.println("print -3.");
    }
}
