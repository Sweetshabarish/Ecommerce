package Main.Login.Customer;

import Customer.CustomerWorking;

import java.sql.SQLException;
import java.util.ArrayList;

public class Data {
    static ArrayList<Object>object=new ArrayList<>();
     public ArrayList<Object> data(String username, String password) throws SQLException {


        object.add(username);
        object.add(password);

        if(CheckingCustomerDetails.customerDetails(object)==1){

            System.out.println("login susccesfiullt");

            CustomerWorking.customerWorkingMethod(object);
            //IncrementingProducts.addProducts();
        } else {
            System.out.println("no use");
        }

        return object;

    }

}
