package Customer.FetchingCustomerData.CustomerModels;

import java.sql.SQLException;

public class CustomerModel {
    static String Name;
    static String UserName;
    static  String Email;
    static String Password;

    static String PhoneNumber;




    //setter methods starts here
    public void setName(String name) throws SQLException {

        Name = name;


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
        return Name;
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
