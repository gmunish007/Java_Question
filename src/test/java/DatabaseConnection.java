import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

public class DatabaseConnection {

    private Connection con;
    private Statement statement;
    private ResultSet resultSet;

    @BeforeClass
    public void establishDatabaseConnection() {
        try {

            String databaseUrl = "jdbc:mysql://localhost:3306/org"; // URl of database
            String username = "root";
            String pwd = "root@123";

            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to Database!");

            // Establish connection
            con = DriverManager.getConnection(databaseUrl, username, pwd);

            // Checking if connection is successful
            if (con == null) {
                System.out.println("Connection established!");
            } else {
                System.out.println("Connection failed!");
            }

        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    @Test
    public void getDataFromDatabase() {
        try {
            // SQl query to get emp table from database
            String query = "Select * from emp";
            statement = con.createStatement();
            resultSet = statement.executeQuery(query);

            // iterate through resultSet and print table details
            while (resultSet.next()) {
                int empID = resultSet.getInt("empId");
                String fname = resultSet.getString("fName");
                String lname = resultSet.getString("lName");

                // print emp details
                System.out.println("First name :" + fname + " and last name: " + lname + " with emp id :" + empID);
            }

        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    @AfterClass
    public void closeDatabaseConnection() throws SQLException {
        if (con != null) {
            try {
                System.out.println("Closing database connection!");
                con.close();
            } catch (Exception error) {
                error.printStackTrace();
            }
        }
    }
}
