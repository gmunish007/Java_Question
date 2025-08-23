package TestNg;

import org.testng.annotations.*;

public class TestNgAnnotations_1 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("print before suite.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("print before test.");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("print before class.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("print before method.");
    }

    @Test
    public void method_1(){
        System.out.println("this is method 1.");
    }

    @Test
    public void method_2(){
        System.out.println("this is method 2.");
    }

    @Test
    public void method_3(){
        System.out.println("this is method 3.");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("print after method.");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("print after class.");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("print after test.");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("print after suite.");
    }
}