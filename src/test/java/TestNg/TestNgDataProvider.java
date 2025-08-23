package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {

    //this method will run 3 times on the basis of data provided from Data Provider
    @Test(dataProvider= "getData")
    public void printData(String username, String pwd){
        System.out.println("Print data from data provider."+username+" and password is: "+pwd);
    }


    @DataProvider
    public Object[][] getData(){

        // 1st combination: correct credentials
        // 2nd combination: incorrect credentials
        // 3rd combination: no credentials

        Object[][] data = new Object[3][2];
        // first array determines how many data sets you have,
        // and second columns tells how many values you have in each data set

        // filling the data in Object array
        data[0][0]="firstusername";
        data[0][1]="firstpassword";
        data[1][0]="secondusername";
        data[1][1]="secondpassword";
        data[2][0]="thirdusername";
        data[2][1]="thirdpassword";

        return data;
    }
}
