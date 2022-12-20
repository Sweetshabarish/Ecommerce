package Customer.FetchingCustomerData;

import Categories.Product.Products.ProductConstnts;
import Customer.FetchingCustomerData.CustomerModels.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class AccountDetailsData {
    static public void accountDetailsDataMethod(ArrayList<Object> Object) throws SQLException {
        Scanner scanner=new Scanner(System.in);






                System.out.println(ProductConstnts.DesignDisplay2);
                Customer.displayCustomerQuery("Select * from customertable where username='"+Object.get(0).toString()+"';");
                System.out.println(ProductConstnts.DesignDisplay2);



    }
}
