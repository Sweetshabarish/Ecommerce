package Seller.FetchingSellerData;

import java.sql.SQLException;

public class SellerModel {
    static String SellerName;
    static String UserName;
    static  String Email;
    static String Password;

    static String PhoneNumber;




    //setter methods starts here
    public void setName(String name) throws SQLException {

        SellerName = name;


    }

    public void setUserName(String userName) {

        UserName = userName;
    }

    public void setEmail(String email) {

        Email = email;
    }

    public void setPassword(String password) {

        Password = password;
    }

    public void setPhoneNumber(String phoneNumber) {

        PhoneNumber = phoneNumber;

    }


    //geter methods starts here



    public String getName() {
        return SellerName;
    }


    public String getUserName() {
        return UserName;
    }



    public String getEmail() {
        return Email;
    }




    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public String getPassword(){
        return Password;
    }
}
