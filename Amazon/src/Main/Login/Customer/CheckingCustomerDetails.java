package Main.Login.Customer;

import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CheckingCustomerDetails {
    static public int customerDetails(ArrayList<Object> arrayObject) throws SQLException {
        CustomerLogin customerLoginObject = new CustomerLogin();
        int count = 0;


        ResultSet resultSetObject = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select * from customertable;");
        while (resultSetObject.next()) {




                if (arrayObject.get(0).toString().equals(resultSetObject.getString(2)) && arrayObject.get(1).toString().equals(resultSetObject.getString(3)))

                    count++;


        }
        return count;
    }
}






