package Seller.FetchingSellerData;



import java.sql.SQLException;
import java.util.ArrayList;

public class SellerController {

    private static ArrayList<SellerModel> sellerModelArrayListObject;
    private static SellerView sellerViewObject;

    public SellerController(ArrayList<SellerModel> sellerModelArrayListObject,SellerView sellerViewObject){
        this.sellerModelArrayListObject=sellerModelArrayListObject;
        this.sellerViewObject=sellerViewObject;

    }
    public void setName(String name) throws SQLException {

        sellerModelArrayListObject.get(0).setName(name);


    }

    public void setUserName(String userName) {

        sellerModelArrayListObject.get(0).setUserName(userName);
    }

    public void setEmail(String email) {

        sellerModelArrayListObject.get(0).setEmail(email);
    }

    public void setPassword(String password) {

        sellerModelArrayListObject.get(0).setPassword(password);
    }

    public void setPhonenumber(String phoneNumber) {

        sellerModelArrayListObject.get(0).setPhoneNumber(phoneNumber);

    }


    //geter methods starts here



    public String getName() {
        return sellerModelArrayListObject.get(0).getName();
    }


    public String getUserName() {
        return sellerModelArrayListObject.get(0).getUserName();
    }



    public String getEmail() {
        return sellerModelArrayListObject.get(0).getEmail();
    }




    public String getPhoneNumber() {
        return sellerModelArrayListObject.get(0).getPhoneNumber();
    }
    public String getPassword(){
        return sellerModelArrayListObject.get(0).getPassword();
    }
    public static void UpdateCustomerView(ArrayList<SellerModel> customerModelObject){
        sellerViewObject.sellerViewMethod(customerModelObject);
    }
}
