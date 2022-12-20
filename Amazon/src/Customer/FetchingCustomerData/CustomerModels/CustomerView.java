package Customer.FetchingCustomerData.CustomerModels;

import java.util.ArrayList;

public class CustomerView {
    public void customerViewMethod(ArrayList<CustomerModel> customerModelObject){
        for(CustomerModel customerModelForloopObject:customerModelObject) {

            System.out.println("NAME: " + customerModelForloopObject.getName());
            System.out.println("USER NAME: " + customerModelForloopObject.getUserName());
            System.out.println("PASSWORD: " + customerModelForloopObject.getPassword());
            System.out.println("EMAIL: " +customerModelForloopObject.getEmail() );
            System.out.println("PHONE NUMBER: " + customerModelForloopObject.getPhoneNumber());


        }

    }
}
