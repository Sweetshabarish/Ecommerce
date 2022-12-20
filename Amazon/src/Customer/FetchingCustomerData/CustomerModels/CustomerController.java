package Customer.FetchingCustomerData.CustomerModels;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {
    private static ArrayList<CustomerModel> customerModelArrayListObject;
    private static CustomerView customerViewObject;

    public CustomerController(ArrayList<CustomerModel> customerModelArrayListObject,CustomerView customerViewObject){
        this.customerModelArrayListObject=customerModelArrayListObject;
        this.customerViewObject=customerViewObject;

    }
    public void setName(String name) throws SQLException {

        customerModelArrayListObject.get(0).setName(name);


    }

    public void setUserName(String userName) {

        customerModelArrayListObject.get(0).setUserName(userName);
    }

    public void setEmail(String email) {

        customerModelArrayListObject.get(0).setEmail(email);
    }

    public void setPassword(String password) {

        customerModelArrayListObject.get(0).setPassword(password);
    }

    public void setPhonenumber(String phoneNumber) {

        customerModelArrayListObject.get(0).setPhoneNumber(phoneNumber);

    }


    //geter methods starts here



    public String getName() {
        return customerModelArrayListObject.get(0).getName();
    }


    public String getUserName() {
        return customerModelArrayListObject.get(0).getUserName();
    }



    public String getEmail() {
        return customerModelArrayListObject.get(0).getEmail();
    }




    public String getPhoneNumber() {
        return customerModelArrayListObject.get(0).getPhoneNumber();
    }
    public String getPassword(){
        return customerModelArrayListObject.get(0).getPassword();
    }
    public static void UpdateCustomerView(ArrayList<CustomerModel> customerModelObject){
        customerViewObject.customerViewMethod(customerModelObject);
    }
}
