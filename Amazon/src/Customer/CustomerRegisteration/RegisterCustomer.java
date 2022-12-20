package Customer.CustomerRegisteration;

import java.sql.SQLException;
import java.util.Scanner;

public class RegisterCustomer {

    Scanner scannerObject = new Scanner(System.in);
    static String Name;
    static String UserName;
    static  String Email;
    static String Password;

    static String PhoneNumber;



    //the method to set the details
    RegisterCustomer( ) throws SQLException {





    }

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

    public void setPhonenumber(String phoneNumber) {

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




    public String getPhonenumber() {
        return PhoneNumber;
    }
    public String getPassword(){
        return Password;
    }



}
