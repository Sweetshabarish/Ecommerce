package Customer.FetchingCustomerData.CustomerModels;

import database.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Customer {
    public  static ArrayList<CustomerModel> displayCustomer(String disaplayCustomerObject) throws SQLException {

        ResultSet DetailsQuery = ExcetuteQureyThrowDatabase.connectExecuteQuery(disaplayCustomerObject);
        ArrayList<CustomerModel> flowChartModelArrayListObject=new ArrayList<>();
        while (DetailsQuery.next()) {
            CustomerModel customerModelObject=new CustomerModel();

            customerModelObject.setName(DetailsQuery.getString(1));
            customerModelObject.setUserName(DetailsQuery.getString(2));
            customerModelObject.setPassword(DetailsQuery.getString(3));
            customerModelObject.setEmail(DetailsQuery.getString(4));
            customerModelObject.setPhoneNumber(DetailsQuery.getString(5));

            flowChartModelArrayListObject.add(customerModelObject);
            //    System.out.println(DetailsQuery.getString(1) + DetailsQuery.getString(2) + DetailsQuery.getString(3) + DetailsQuery.getString(4) + DetailsQuery.getInt(5) + DetailsQuery.getInt(6) + DetailsQuery.getString(7));

        }

        return flowChartModelArrayListObject;
    }
    public static void displayCustomerQuery(String Query) throws SQLException {
        ArrayList<CustomerModel> customerModelObject=displayCustomer(Query);

        CustomerView customerViewObject=new CustomerView();
        CustomerController customerControllerObject=new CustomerController(customerModelObject,customerViewObject);
        customerControllerObject.UpdateCustomerView(customerModelObject);

    }
}
