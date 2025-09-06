package Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class test_login {

//    @Given("User is on login page")
//    public void userIsOnLoginPage() throws InterruptedException {
//        System.out.println("user is on login page");
//        Hooks.getDriver().get("https://www.google.com");
//        Thread.sleep(10000);
//    }


//    @When("^User is on login page with (.+) and (.+) using Examples$")
//    public void user_is_on_login_page_with_and_using_examples(String string, String string2) {
//        System.out.println("Username with example: "+string);
//        System.out.println("Password with example: "+string2);
//    }
//
//
//    @Given("user enters username {string} and password {string} on page without using Data Table or Example")
//    public void userEntersUsernameAndPasswordOnPageWithoutUsingDataTableOrExample(String user, String pwd) {
//        System.out.println("Username without Data Table and Examples: "+user+" : "+pwd);
//    }


    @Given("User is on login page with multiple username and passwords using DataTables")
    public void userIsOnLoginPageWithMultipleUsernameAndPasswordsUsingDataTables(DataTable dataTable) {

        //will print all data in a list
        List<List<String>> dataSet = dataTable.asLists(String.class);
        for(List<String> data:dataSet){
            System.out.println(data);
        }


        // print munish without using for()
        //System.out.println(dataSet.get(0).get(0));
    }
}

