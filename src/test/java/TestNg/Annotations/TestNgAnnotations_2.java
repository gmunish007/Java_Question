package TestNg.Annotations;

import org.testng.annotations.*;

public class TestNgAnnotations_2 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("print before suite5.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("print before test5.");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("print before class5.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("print before method5.");
    }

    @Test
    public void method_5(){
        System.out.println("this is method 5.");
    }

    @Test
    public void method_6(){
        System.out.println("this is method 6.");
    }

    @Test
    public void method_7(){
        System.out.println("this is method 7.");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("print after method5.");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("print after class5.");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("print after test5.");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("print after suite5.");
    }
}